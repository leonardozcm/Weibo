package com.bingyan.com.weibo.weibo;

import com.bingyan.com.weibo.BasePresenter;
import com.bingyan.com.weibo.BaseView;

/**
 * Created by 59771 on 2017/12/11.
 */

public interface WeiboTaskOfVP {
    interface WeiboView extends BaseView{
        //加载时显示
        void OnLoading();
        //加载成功时
        void OnSuccess();
        //加载失败
        void OnFail(String error);
        //刷新
        void OnRefresh();

        /**
         *item触摸按键的事件处理
         * @param button 点击不同按键调用present的不同方法
         */
        void MyOnTouchEvent(int button);
    }
    interface WeiboPresenter extends BasePresenter{
       //成功拿到数据
        void OnGetWeiboSuccess();
       //没有拿到数据
        void OnFail();
    }
}
