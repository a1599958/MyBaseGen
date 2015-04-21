package com.addcn.mediaeval.base;

import android.content.Context;
import android.view.View;

public abstract class BaseContent {
	public Context mActivity;
	private View rootView;
	public BaseContent(Context context){
		this.mActivity=context;
		rootView = initView();
	}
	public abstract View initView();
	
	public View getRootView() {
		return rootView;
	}
	public void initData(){};
}
