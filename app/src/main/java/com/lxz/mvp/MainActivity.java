package com.lxz.mvp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.lxz.mvp.adapter.GirlListAdapter;
import com.lxz.mvp.base.BaseActivity;
import com.lxz.mvp.bean.Girl;
import com.lxz.mvp.presenter.GirlPresenter;
import com.lxz.mvp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter> implements IGirlView {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        mPresenter.fetch();
    }

    @Override
    protected GirlPresenter createPresenter() {
        return new GirlPresenter(this);
    }

    private void setView() {
        lv = (ListView) findViewById(R.id.lv_list);
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "正在加载.....", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirl(List<Girl> girls) {
        lv.setAdapter(new GirlListAdapter(girls, this));
    }
}
