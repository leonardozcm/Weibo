package com.bingyan.com.weibo.login.mvp.Model;

/**
 * Created by 59771 on 2017/12/6.
 */

public class AccessTokenBeam{

    /**
     * access_token : 2.00v5TUaGo91SrC0d0f7c306eyDOlID
     * remind_in : 157679999
     * expires_in : 157679999
     * uid : 6036007949
     * scope : follow_app_official_microblog
     * isRealName : true
     */

    private String access_token;
    private String remind_in;
    private int expires_in;
    private String uid;
    private String scope;
    private String isRealName;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRemind_in() {
        return remind_in;
    }

    public void setRemind_in(String remind_in) {
        this.remind_in = remind_in;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(String isRealName) {
        this.isRealName = isRealName;
    }
}
