package com.kyler.mbqscpuguide.MenuDrawerFragments;


import com.kyler.mbqscpuguide.R;
import com.kyler.mbqscpuguide.Adapters.ListViewAdapters.GovernorsListViewAdapter;
import com.kyler.mbqscpuguide.GovernorFragments.BrazilianWax;
import com.kyler.mbqscpuguide.GovernorFragments.Conservative;
import com.kyler.mbqscpuguide.GovernorFragments.DynInteractive;
import com.kyler.mbqscpuguide.GovernorFragments.Hotplug;
import com.kyler.mbqscpuguide.GovernorFragments.HotplugX;
import com.kyler.mbqscpuguide.GovernorFragments.Interactive;
import com.kyler.mbqscpuguide.GovernorFragments.InteractiveX;
import com.kyler.mbqscpuguide.GovernorFragments.Lagfree;
import com.kyler.mbqscpuguide.GovernorFragments.Lazy;
import com.kyler.mbqscpuguide.GovernorFragments.Lionheart;
import com.kyler.mbqscpuguide.GovernorFragments.Lulzactive;
import com.kyler.mbqscpuguide.GovernorFragments.MinMax;
import com.kyler.mbqscpuguide.GovernorFragments.Nightmare;
import com.kyler.mbqscpuguide.GovernorFragments.OnDemand;
import com.kyler.mbqscpuguide.GovernorFragments.OndemandPlus;
import com.kyler.mbqscpuguide.GovernorFragments.PegasusQ;
import com.kyler.mbqscpuguide.GovernorFragments.Performance;
import com.kyler.mbqscpuguide.GovernorFragments.Powersave;
import com.kyler.mbqscpuguide.GovernorFragments.Sakuractive;
import com.kyler.mbqscpuguide.GovernorFragments.Savagedzen;
import com.kyler.mbqscpuguide.GovernorFragments.Scary;
import com.kyler.mbqscpuguide.GovernorFragments.Smartass;
import com.kyler.mbqscpuguide.GovernorFragments.SmartassV2;
import com.kyler.mbqscpuguide.GovernorFragments.Userspace;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class GovernorsLV extends Fragment {
	String[] governors;
	
	ListView aboutLV;
	
	GovernorsListViewAdapter adapter;
	
	int[] flag;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
        View view = inflater.inflate(R.layout.governors_listview, container, false);                
        
        governors = new String[] 
        		{ 
        		"Ondemand",
        		"Interactive",
        		"InteractiveX",
        		"Performance",
        		"Powersave",
        		"Conservative",
        		"Userspace",
        		"Lagfree",
        		"Min Max",
        		"Hotplug",
        		"PegasusQ",
        		"Lazy",
        		"Nightmare",
        		"HotplugX",
        		"Lulzactive",
        		"Smartass",
        		"SmartassV2",
        		"Lionheart",
        		"BrazilianWax",
        		"Savagedzen",
        		"Scary",
        		"Sakuractive",
        		"OndemandPlus",
        		"DynInteractive" 
        		};
        
        aboutLV = (ListView) view.findViewById(R.id.governorLV);
        
        adapter = new GovernorsListViewAdapter(getActivity(), governors, 
                flag);
        // Binds the Adapter to the ListView
        aboutLV.setAdapter(adapter);
        // Capture clicks on ListView items
        aboutLV.setOnItemClickListener(new OnItemClickListener() {
        	@Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
        		switch(position) {
        		
        		case 0:
        			Intent OnDemand = new Intent(getActivity(), OnDemand.class);
        			startActivity(OnDemand);
        			break;

        		case 1:
        			Intent Interactive = new Intent(getActivity(), Interactive.class);
        			startActivity(Interactive);
        			break;

        		case 2:
        			Intent InteractiveX = new Intent(getActivity(), InteractiveX.class);
        			startActivity(InteractiveX);
        			break;

        		case 3:
        			Intent Performance = new Intent(getActivity(), Performance.class);
        			startActivity(Performance);
        			break;

        		case 4:
        			Intent Powersave = new Intent(getActivity(), Powersave.class);
        			startActivity(Powersave);
        			break;

        		case 5:
        			Intent Conservative = new Intent(getActivity(), Conservative.class);
        			startActivity(Conservative);
        			break;

        		case 6:
        			Intent Userspace = new Intent(getActivity(), Userspace.class);
        			startActivity(Userspace);
        			break;

        		case 7:
        			Intent Lagfree = new Intent(getActivity(), Lagfree.class);
        			startActivity(Lagfree);
        			break;

        		case 8:
        			Intent MinMax = new Intent(getActivity(), MinMax.class);
        			startActivity(MinMax);
        			break;

        		case 9:
        			Intent Hotplug = new Intent(getActivity(), Hotplug.class);
        			startActivity(Hotplug);
        			break;

        		case 10:
        			Intent PegasusQ = new Intent(getActivity(), PegasusQ.class);
        			startActivity(PegasusQ);
        			break;

        		case 11:
        			Intent Lazy = new Intent(getActivity(), Lazy.class);
        			startActivity(Lazy);
        			break;

        		case 12:
        			Intent Nightmare = new Intent(getActivity(), Nightmare.class);
        			startActivity(Nightmare);
        			break;

        		case 13:
        			Intent HotplugX = new Intent(getActivity(), HotplugX.class);
        			startActivity(HotplugX);
        			break;

        		case 14:
        			Intent Lulzactive = new Intent(getActivity(), Lulzactive.class);
        			startActivity(Lulzactive);
        			break;

        		case 15:
        			Intent Smartass = new Intent(getActivity(), Smartass.class);
        			startActivity(Smartass);
        			break;

        		case 16:
        			Intent SmartassV2 = new Intent(getActivity(), SmartassV2.class);
        			startActivity(SmartassV2);
        			break;

        		case 17:
        			Intent Lionheart = new Intent(getActivity(), Lionheart.class);
        			startActivity(Lionheart);
        			break;

        		case 18:
        			Intent BrazilianWax = new Intent(getActivity(), BrazilianWax.class);
        			startActivity(BrazilianWax);
        			break;

        		case 19:
        			Intent Savagedzen = new Intent(getActivity(),Savagedzen.class);
        			startActivity(Savagedzen);
        			break;

        		case 20:
        			Intent Scary = new Intent(getActivity(), Scary.class);
        			startActivity(Scary);
        			break;

        		case 21:
        			Intent Sakuractive = new Intent(getActivity(), Sakuractive.class);
        			startActivity(Sakuractive);
        			break;

        		case 22:
        			Intent OndemandPlus = new Intent(getActivity(), OndemandPlus.class);
        			startActivity(OndemandPlus);
        			break;

        		case 23:
        			Intent DynInteractive = new Intent(getActivity(), DynInteractive.class);
        			startActivity(DynInteractive);
        			break;                          
                
        		}
        		
        	}
 
        });
        return view;
        }
	}