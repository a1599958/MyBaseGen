package com.addcn.mediaeval.ui;

import com.addcn.mediaeval.R;
import com.addcn.mediaeval.R.id;
import com.addcn.mediaeval.R.layout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    private FrameLayout mContent;
	private RadioGroup rgGroup;
	private RadioButton rbSearch;
	private RadioButton rbCollect;
	private RadioButton rbSearchhistory;
	private RadioButton rbMore;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

	private void initData() {
		
	}

	private void initView() {
		mContent = (FrameLayout) findViewById(R.id.fl_content);
		rgGroup = (RadioGroup) findViewById(R.id.rg_group);
		rbSearch = (RadioButton) findViewById(R.id.rb_search);
		rbCollect = (RadioButton) findViewById(R.id.rb_collect);
		rbSearchhistory = (RadioButton) findViewById(R.id.rb_searchhistory);
		rbMore = (RadioButton) findViewById(R.id.rb_more);
		
	}
    
}
