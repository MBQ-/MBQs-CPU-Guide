package com.kyler.mbqscpuguide.FirstRun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.kyler.mbqscpuguide.GuideActivity;
import com.kyler.mbqscpuguide.R;

public class WelcomeFirstRun extends Activity {
	View button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.welcome_firstactivity);
		
	    View button = (findViewById(R.id.button1));
	    
	    button.setOnClickListener(
	    		
	        new OnClickListener() {
	        	
	            @Override
	            public void onClick(View v) {
	            	
	            	Intent intent = new Intent(WelcomeFirstRun.this, GuideActivity.class);
	            	intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	                startActivity(intent);
	                finish();

	            }
	        }
	    );
	}
}
