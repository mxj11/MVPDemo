package com.lxz.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lxz.mvp.presenter.BasePresenter;

/**
 * Created by Administrator on 2018/4/13 0013.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    protected abstract T createPresenter();
}
