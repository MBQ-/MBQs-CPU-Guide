package com.kyler.mbqscpuguide.Adapters.ListViewAdapters.Governors;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kyler.mbqscpuguide.LVFragments.Governors.Definitions.ConservativeDefinition;
import com.kyler.mbqscpuguide.LVFragments.Governors.Definitions.ConservativeUsage;

public class HotplugXPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 2;
	// Tab Titles
	private String tabtitles[] = new String[] { "Definition", "Usage" };
	Context context;

	public HotplugXPagerAdapter(FragmentManager fm) {
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
			ConservativeDefinition cd = new ConservativeDefinition();
			return cd;		
			
		case 1:
			ConservativeUsage cu = new ConservativeUsage();
			return cu;				

		}
		return null;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabtitles[position];
	}
}