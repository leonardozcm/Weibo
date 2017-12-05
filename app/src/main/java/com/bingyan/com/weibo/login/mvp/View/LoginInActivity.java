package com.bingyan.com.weibo.login.mvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.bingyan.com.weibo.R;
import com.bingyan.com.weibo.login.mvp.LoginTaskOfVP;
import com.bingyan.com.weibo.login.mvp.Presenter.LoginInPresenter;

public class LoginInActivity extends AppCompatActivity implements LoginTaskOfVP.LoginView{
    private WebView web_login;
    private LoginTaskOfVP.LoginPresenter mLoginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
        mLoginPresenter = new LoginInPresenter(this);

        web_login=findViewById(R.id.web_login);
        web_login.getSettings().setJavaScriptEnabled(true);
        
    }

    @Override
    public void setPresenter(LoginTaskOfVP.LoginPresenter presenter) {
        mLoginPresenter=presenter;
    }

    @Override
    public void OnLoading() {

    }

    @Override
    public void OnSuccess() {

    }

    @Override
    public void OnFail(String error) {

    }
}
