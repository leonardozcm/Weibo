package com.bingyan.com.weibo.login.mvp.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.bingyan.com.weibo.MainActivity;
import com.bingyan.com.weibo.R;
import com.bingyan.com.weibo.login.mvp.LoginTaskOfVP;
import com.bingyan.com.weibo.login.mvp.Model.AccessTokenBeam;
import com.bingyan.com.weibo.login.mvp.Presenter.LoginInPresenter;

import static com.bingyan.com.weibo.login.mvp.Model.Contact.getcode_url;

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
        web_login.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                mLoginPresenter.OnloginSuccess(request);
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        web_login.loadUrl(getcode_url);
    }

    @Override
    public void setPresenter(LoginTaskOfVP.LoginPresenter presenter) {
        mLoginPresenter=presenter;
    }

    @Override
    public void OnLoading() {

    }

    @Override
    public void OnSuccess(AccessTokenBeam accessTokenBeam) {
        SharedPreferences.Editor editor=getSharedPreferences("accessTokenBeam",MODE_PRIVATE).edit();
        editor.putString("access_token",accessTokenBeam.getAccess_token());
        editor.putString("remind_in",accessTokenBeam.getRemind_in());
        editor.putInt("expires_in",accessTokenBeam.getExpires_in());
        editor.putString("uid",accessTokenBeam.getUid());
        editor.putString("scope",accessTokenBeam.getScope());
        editor.putString("isRealName",accessTokenBeam.getIsRealName());
        editor.apply();
        Intent intent=new Intent(LoginInActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void OnFail(String error) {

    }
}
