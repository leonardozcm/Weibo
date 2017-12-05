package com.bingyan.com.weibo.login.mvp.Presenter;

import com.bingyan.com.weibo.login.mvp.LoginTaskOfVP;

/**
 * Created by 59771 on 2017/12/5.
 * 这个present同时给LoginActivity与LoginInActivity的接口使用
 */

public class LoginInPresenter implements LoginTaskOfVP.LoginPresenter{
   public LoginTaskOfVP.LoginView mLoginView;

    public LoginInPresenter(LoginTaskOfVP.LoginView loginView){
        mLoginView=loginView;
        mLoginView.setPresenter(this);
    }

    @Override
    public void start() {
        mLoginView.OnLoading();
    }

    @Override
    public void OnloginSuccess() {

    }

    @Override
    public void OnloginFail() {

    }
}
