package com.kyler.mbqscpuguide;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.kyler.mbqscpuguide.FirstRun.WelcomeFirstRun;
import com.kyler.mbqscpuguide.MenuDrawerFragments.GovernorsLV;
import com.kyler.mbqscpuguide.MenuDrawerFragments.Welcome;
import com.kyler.mbqscpuguide.Utils.Utils;


@SuppressLint("NewApi")
public class GuideActivity extends FragmentActivity {
	Context mContext;
	
	Utils utils;
	
	Intent intent;
	
	Toast toast;
	
	private long lastPressedTime;
	
	private static final int PERIOD = 2000;		
   	
	Fragment Welcome = new Welcome();
	Fragment Governors = new GovernorsLV();
	
	TextView textview;
	
    private DrawerLayout mDrawerLayout;
    
    private ListView mDrawerList;
    
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    
    private CharSequence mTitle;
    
	private String[] mCategories;	

	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		SharedPreferences first = PreferenceManager.getDefaultSharedPreferences(this);
		
        if (getIntent().getBooleanExtra("EXIT", false)) 
        {
                finish();
        }			

		if(!first.getBoolean("firstTime", false)) {
		
		Utils.onActivityCreateSetTheme(this);	
        Intent intent = new Intent(this, WelcomeFirstRun.class);            
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);            
        startActivity(intent);  
        finish();

        SharedPreferences.Editor editor = first.edit();

        editor.putBoolean("firstTime", true);
        editor.commit();

	}
		
		Utils.onActivityCreateSetTheme(this);
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        getActionBar().setHomeButtonEnabled(true);
		
		setContentView(R.layout.menudrawer);	

        mTitle = mDrawerTitle = getTitle();
        
        mCategories = getResources().getStringArray(R.array.Items);
        
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mCategories));
        
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        getActionBar().setHomeButtonEnabled(true);
        
        mDrawerToggle = new ActionBarDrawerToggle(
        		
                this,
                mDrawerLayout,
                R.drawable.ic_drawer,
                R.string.drawer_open,
                R.string.drawer_close 
                )
        
        { 
        	public void onDrawerClosed(View view) {
            	
                getActionBar().setTitle(mTitle);
                
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                
            }

            public void onDrawerOpened(View drawerView) {
            	
                getActionBar().setTitle(mDrawerTitle);
                
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                
            }
        };
        
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
        	
            selectItem(0);
        }
     } 
	
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            switch (event.getAction()) {
            case KeyEvent.ACTION_DOWN:
                if (event.getDownTime() - lastPressedTime < PERIOD) {
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Press again to exit.",
                            Toast.LENGTH_SHORT).show();
                    lastPressedTime = event.getEventTime();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.guide, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        
        return super.onPrepareOptionsMenu(menu);
    }    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
		switch (item.getItemId()) {			

        case R.id.exit:
        	// BYE :(
        	super.finish();
        	break;
        	
        case R.id.holoText:
        	Utils.changeToTheme(this, Utils.Holo_Light_Text);
        	break;        	
        	
        case R.id.blackText:
        	Utils.changeToTheme(this, Utils.Black_Text);
        	break;
        	
        case R.id.translators:
        	Intent openTranslators = new Intent(this, AppTranslators.class);
        	startActivity(openTranslators);
        	break;
                     
            default:

       };     

   return super.onOptionsItemSelected(item);
}  

private class DrawerItemClickListener implements ListView.OnItemClickListener {
   @Override
   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       selectItem(position);
   }
}

private void selectItem(int position) {

   FragmentTransaction ft = getFragmentManager().beginTransaction();
   switch (position) {
   
   case 0:
       ft.replace(R.id.content_frame, Welcome);
       ft.addToBackStack(null);
       break; 
       
   case 1:
       ft.replace(R.id.content_frame, Governors);
       break;         
    	
        }
        
        ft.commit();
        
        mDrawerList.setItemChecked(position, true);

        mDrawerLayout.closeDrawer(mDrawerList);
    }
    
    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);
        
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);
        
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    public static class CategoriesFragment extends Fragment {

    public static final String ARG_CATEGORY = "category";

    public CategoriesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_categories, container, false);
        
        int i = getArguments().getInt(ARG_CATEGORY);
        
        String List = getResources().getStringArray(R.array.Items)[i];
        
        getActivity().setTitle(List);
        
        return rootView;
        
          }
       }
    }
