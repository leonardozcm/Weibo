package com.bingyan.com.weibo.login.mvp.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bingyan.com.weibo.R;
import com.bingyan.com.weibo.login.mvp.LoginTaskOfVP;
import com.bingyan.com.weibo.login.mvp.Model.AccessTokenBeam;
import com.bingyan.com.weibo.login.mvp.Presenter.LoginInPresenter;

public class LoginActivity extends AppCompatActivity implements LoginTaskOfVP.LoginView{
    private Button login_in;
    private LoginTaskOfVP.LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginPresenter = new LoginInPresenter(this);

        login_in=findViewById(R.id.login_in);
        login_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.start();
            }
        });
    }

    @Override
    public void OnLoading() {
        Intent intent =new Intent(LoginActivity.this,LoginInActivity.class);
        this.startActivity(intent);
        finish();
    }

    @Override
    public void OnSuccess(AccessTokenBeam accessTokenBeam) {

    }

    @Override
    public void OnFail(String error) {

    }

    @Override
    public void setPresenter(LoginTaskOfVP.LoginPresenter presenter) {
        mLoginPresenter=presenter;
    }
}
