package com.lxz.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.lxz.mvp.R;
import com.lxz.mvp.bean.Girl;

import java.util.List;


public class GirlListAdapter extends BaseAdapter{
	private List<Girl> list;
	private Context context;
	private LayoutInflater inflater;
	public GirlListAdapter(List<Girl> list, Context context) {
		super();
		this.list = list;
		this.context = context;
		this.inflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null){
			convertView=inflater.inflate(R.layout.list_item1, null);
			holder=new ViewHolder();
			holder.iv=(ImageView) convertView.findViewById(R.id.iv);
			holder.tvDescribe=(TextView) convertView.findViewById(R.id.tv);
			convertView.setTag(holder);
		}else{
			holder=(ViewHolder) convertView.getTag();
		}
		Girl girl=list.get(position);
		holder.tvDescribe.setText(girl.getDecribe());
		holder.iv.setImageResource(girl.getPictures());
		return convertView;
	}
	class ViewHolder{
		ImageView iv;
		TextView tvDescribe;
	}
}
