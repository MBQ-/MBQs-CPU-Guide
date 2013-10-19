package com.kyler.mbqscpuguide.Utils;

import com.kyler.mbqscpuguide.R;

import android.app.Activity;
import android.content.Intent;

public class Utils {
	private static int mTheme;
	
	public final static int Holo_Light_Text = 0 ;	
	public final static int Black_Text = 1;	
	
	public static void changeToTheme(Activity activity, int theme) {
		
		mTheme = theme;
		
		activity.finish();
		
		activity.startActivity(new Intent(activity, activity.getClass()));
		
	}
	
	public static void onActivityCreateSetTheme(Activity activity) {
		
		switch (mTheme) {
		
		case Holo_Light_Text:
			activity.setTheme(R.style.Holo_Light_Text);
			break;	
			
		case Black_Text:
			activity.setTheme(R.style.Black_Text);
			break;			
		}				
	}
}
