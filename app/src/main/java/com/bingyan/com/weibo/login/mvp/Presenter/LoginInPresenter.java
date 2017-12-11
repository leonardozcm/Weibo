package com.bingyan.com.weibo.login.mvp.Presenter;

import android.support.annotation.NonNull;
import android.webkit.WebResourceRequest;

import com.bingyan.com.weibo.Utils.HttpUtils;
import com.bingyan.com.weibo.login.mvp.LoginTaskOfVP;
import com.bingyan.com.weibo.login.mvp.Model.AccessTokenBeam;
import com.bingyan.com.weibo.login.mvp.Model.Contact;
import com.google.gson.Gson;

/**
 * Created by 59771 on 2017/12/5.
 * 这个present同时给LoginActivity与LoginInActivity的接口使用
 */

public class LoginInPresenter implements HttpUtils.HttpCallBack<AccessTokenBeam>,LoginTaskOfVP.LoginPresenter{
   private LoginTaskOfVP.LoginView mLoginView;
   private Contact contact;
   private HttpUtils mHttpUtils;
   private AccessTokenBeam mAccessTokenBeam;

    public LoginInPresenter(LoginTaskOfVP.LoginView loginView){
        mLoginView=loginView;
        mLoginView.setPresenter(this);
    }

    /**
     * 给LoginActivity调用
     */
    @Override
    public void start() {
        mLoginView.OnLoading();
    }

    @Override
    public void OnloginSuccess(WebResourceRequest resourceRequest) {
        contact=Contact.getInstance();
        mHttpUtils=HttpUtils.getInstance();
        if(resourceRequest.getUrl().toString().contains("code")){
            contact.setCode(resourceRequest.getUrl().getQueryParameters("code").get(0));
        }
        mHttpUtils.postAsyn(Contact.getAccess_token_url,contact.getParams(),this);

    }



    @Override
    public void onRequestComplete(@NonNull String result, Gson gson) {
        //处理accesstokenbeam
        mAccessTokenBeam=onParseJson(result,gson);
        mLoginView.OnSuccess(mAccessTokenBeam);

    }

    @Override
    public void OnloginFail() {

    }
}
