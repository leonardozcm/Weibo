package com.bingyan.com.weibo.login.mvp;

import android.webkit.WebResourceRequest;

import com.bingyan.com.weibo.BasePresenter;
import com.bingyan.com.weibo.BaseView;
import com.bingyan.com.weibo.login.mvp.Model.AccessTokenBeam;

/**
 * Created by 59771 on 2017/12/5.
 */

public interface LoginTaskOfVP {
    interface LoginView extends BaseView<LoginPresenter> {
        //加载时显示
        void OnLoading();
        //加载成功时
        void OnSuccess(AccessTokenBeam accessTokenBeam);
        //加载失败
        void OnFail(String error);
    }
    interface LoginPresenter extends BasePresenter{
        void OnloginSuccess(WebResourceRequest request);
        void OnloginFail();
    }
}
