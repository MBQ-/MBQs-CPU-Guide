package com.kyler.mbqscpuguide.LVFragments.Governors.Definitions;

import com.kyler.mbqscpuguide.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConservativeDefinition extends Fragment {
	
	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
		  
	    final View view = inflater.inflate(R.layout.conservativedefinition, container, false);
	    setHasOptionsMenu(true);
	    
		return view;
		
	  }
}