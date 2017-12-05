package com.bingyan.com.weibo.login.mvp.Model;

import java.util.HashMap;

/**
 * Created by 59771 on 2017/12/5.
 */

public class Contact {
    private String client_id="2619780042";
    private String client_secret="e8884f05523a01db5d7eaa496ee99a3e";
    private  String grant_type="authorization_code";
    public static String getAccess_token_url="https://api.weibo.com/oauth2/access_token";
    private  String redirect_uri="http://www.sina.com";
    /**
     * 此处url单列，不用httputil请求
     */
    public static final String getcode_url="https://open.weibo.cn/oauth2/authorize?"+
            "client_id=2619780042"
            + "&redirect_uri=http://www.sina.com"
            +"&scope=email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write"
            +"&display=moblie";
    //第一次清求服务器返回的code
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private Contact(){
    }
    public Contact getInstance(){
        return new Contact();
    }

    /**
     * 获取accesstoken所需map实例
     * @return map实例
     */
    public HashMap<String,String> getParams(){
        HashMap<String,String> map=new HashMap<>();
        map.put("client_id",client_id);
        map.put("client_secret",client_secret);
        map.put("grant_type",grant_type);
        map.put("code",getCode());
        map.put("redirect_uri",redirect_uri);
        return map;
    }
}
