package com.kyler.mbqscpuguide.GovernorFragments;

import com.kyler.mbqscpuguide.R;
import com.kyler.mbqscpuguide.Adapters.ListViewAdapters.Governors.ConservativePagerAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Lionheart extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        setContentView(R.layout.lionheart);
        
		ViewPager viewPager = (ViewPager) findViewById(R.id.pagerLH);

		// Set the ViewPagerAdapter into ViewPager
		viewPager.setAdapter(new ConservativePagerAdapter(getSupportFragmentManager()));
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigate, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        
        return super.onPrepareOptionsMenu(menu);
    }    
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        // Respond to the action bar's Up/Home button
	        case R.id.goBack:
	            finish();
	            return true;
	    }
	    return super.onOptionsItemSelected(item);
	}	
}