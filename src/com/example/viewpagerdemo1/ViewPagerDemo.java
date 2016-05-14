package com.example.viewpagerdemo1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class ViewPagerDemo extends Activity {

	List<View> viewList;
	View v1, v2, v3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LayoutInflater inflater = getLayoutInflater().from(this);
		v1 = inflater.inflate(R.layout.layout1, null);
		v2 = inflater.inflate(R.layout.layout2, null);
		v3 = inflater.inflate(R.layout.layout3, null);

		viewList = new ArrayList<View>();
		viewList.add(v1);
		viewList.add(v2);
		viewList.add(v3);
		
		
		

	}
}
