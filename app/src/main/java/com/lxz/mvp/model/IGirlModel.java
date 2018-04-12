package com.lxz.mvp.model;


import com.lxz.mvp.bean.Girl;

import java.util.List;


public interface IGirlModel {
	void loadGirl(GirlOnLoadListener listener);
	interface GirlOnLoadListener{
		void onComplete(List<Girl> girls);
	}
}
