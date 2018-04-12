package com.lxz.mvp.view;


import com.lxz.mvp.bean.Girl;

import java.util.List;


public interface IGirlView {
	/**
	 * 加载提示
	 */
	void showToast();

	/**
	 * 显示数据
	 */
	void showGirl(List<Girl> girls);
	
}
