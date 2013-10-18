package com.kyler.mbqscpuguide.GovernorFragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.kyler.mbqscpuguide.R;
import com.kyler.mbqscpuguide.Adapters.ListViewAdapters.Governors.BrazilianWaxPagerAdapter;

public class BrazilianWax extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Get the view from activity_main.xml
		setContentView(R.layout.brazilianwax);

		// Locate the viewpager in activity_main.xml
		ViewPager viewPager = (ViewPager) findViewById(R.id.pager1);

		// Set the ViewPagerAdapter into ViewPager
		viewPager.setAdapter(new BrazilianWaxPagerAdapter(getSupportFragmentManager()));
	}
}
