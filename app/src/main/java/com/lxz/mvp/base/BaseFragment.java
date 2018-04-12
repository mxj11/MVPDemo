package com.lxz.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.lxz.mvp.presenter.BasePresenter;

/**
 * Created by Administrator on 2018/4/13 0013.
 */

public abstract class BaseFragment<V,T extends BasePresenter<V>> extends Fragment {
    private T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attach((V)this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    protected abstract T createPresenter();
}
