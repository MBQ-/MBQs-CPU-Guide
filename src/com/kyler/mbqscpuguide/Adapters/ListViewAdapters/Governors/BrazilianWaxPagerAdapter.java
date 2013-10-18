package com.kyler.mbqscpuguide.Adapters.ListViewAdapters.Governors;

import com.kyler.mbqscpuguide.LVFragments.Governors.Definitions.BrazilianWaxDefinition;

import android.support.v4.app.FragmentPagerAdapter;
import android.view.MenuItem;
 
public class BrazilianWaxPagerAdapter extends FragmentPagerAdapter {
	
	MenuItem menu;

	private final String[] TITLES = { 
			"Definition",  
			};

	public BrazilianWaxPagerAdapter(android.support.v4.app.FragmentManager fm) {
		super(fm);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
		
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}

	@Override
	public android.support.v4.app.Fragment getItem(int position) {
		switch (position) {
        case 0:
            BrazilianWaxDefinition ondemand = new BrazilianWaxDefinition();
            return ondemand;                  	
		}
		
		return null;
		
		}
}