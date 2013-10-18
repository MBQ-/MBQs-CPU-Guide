package com.kyler.mbqscpuguide.Adapters.ListViewAdapters.Governors;

import com.kyler.mbqscpuguide.LVFragments.Governors.Definitions.BrazilianWaxDefinition;
import com.kyler.mbqscpuguide.LVFragments.Governors.Definitions.BrazilianWaxUsage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class BrazilianWaxPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 2;
	// Tab Titles
	private String tabtitles[] = new String[] { "Definition", "Usage" };
	Context context;

	public BrazilianWaxPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {

		case 0:
			BrazilianWaxDefinition bwd = new BrazilianWaxDefinition();
			return bwd;		
			
		case 1:
			BrazilianWaxUsage bwu = new BrazilianWaxUsage();
			return bwu;				

		}
		return null;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabtitles[position];
	}
}