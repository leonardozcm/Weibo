package com.bingyan.com.weibo.Utils;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by 59771 on 2017/12/4.
 */

public class HttpUtils {

    private static HttpUtils mHttpUtils=new HttpUtils();

    private OkHttpClient mClient;

    private Gson gson=new Gson();

    private HttpUtils(){
        mClient=new OkHttpClient();
    }

    public static HttpUtils getInstance(){
        return mHttpUtils;
    }

    /**
     * 用于提供给Present层回调
     * @param <T>
     */
    public interface HttpCallBack<T>{
       default T onRequestComplete(@NonNull String result, Gson gson){
           JsonParser jsonParser = new JsonParser();
           JsonElement jsonElement = jsonParser.parse(result);
           Type type=((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
           return gson.fromJson(jsonElement,type);
       }

    }

    /**
     * 用异步的方法拿到数据
     * @param url 服务器地址
     * @param params GET请求的参数
     * @param callBack 获取成功后回调的接口
     */
    public void getAsyn(final String url,HashMap<String,String> params,@NonNull final HttpCallBack callBack){
        try{
            Request mRequest=buildGetReqWithAllParams(url,params);
            mClient.newCall(mRequest).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    call.cancel();
                    Log.d(TAG, "onFailure: http GET请求失败");
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call,@NonNull Response response) throws IOException {
                    if(response.isSuccessful()){
                        callBack.onRequestComplete(response.body().string(),gson);
                    }
                }
            });


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param map 请求的参数
     * @return 一个完整的请求头
     */
    private Request buildGetReqWithAllParams(String url,HashMap<String,String> map){
       Request.Builder builder=new Request.Builder().url(url);
        for (Map.Entry<String,String> entry:map.entrySet()){
            builder.addHeader(entry.getKey(),entry.getValue());
        }
        return builder.build();
    }

    public void postAsyn(final String url,HashMap<String,String> params,@NonNull final HttpCallBack callBack){
        try{
            Request mRequest=buildPostReqWithAllParams(url,params);
            mClient.newCall(mRequest).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call,@NonNull IOException e) {
                    call.cancel();
                    Log.d(TAG, "onFailure: http POST请求失败");
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call,@NonNull Response response) throws IOException {
                    if(response.isSuccessful()){
                        callBack.onRequestComplete(response.body().string(),gson);
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private Request buildPostReqWithAllParams(String url,HashMap<String,String> map){
        FormBody.Builder builder=new FormBody.Builder();
        for (Map.Entry<String,String> entry:map.entrySet()) {
            builder.add(entry.getKey(),entry.getValue());
        }
        return new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
    }

}
