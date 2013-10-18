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
import com.kyler.mbqscpuguide.GovernorFragments.OnDemandX;
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
        		"BrazilianWax",
        		"Conservative",
        		"DynInteractive",
        		"Hotplug",
        		"HotplugX",
        		"Interactive",
        		"InteractiveX",
        		"Lagfree",
        		"Lazy",
        		"Lionheart",
        		"Lulzactive",
        		"MinMax",
        		"Nightmare",
        		"OnDemand",
        		"OnDemandPlus",
        		"OnDemandX",
        		"PegasusQ",
        		"Performance",
        		"Powersave",
        		"Sakuractive",
        		"Savagedzen",
        		"Scary",
        		"Smartass",
        		"SmartassV2",
        		"Userspace"
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
        			Intent BZW = new Intent(getActivity(), BrazilianWax.class);
        			startActivity(BZW);
        			break;

        		case 1:
        			Intent C = new Intent(getActivity(), Conservative.class);
        			startActivity(C);
        			break;

        		case 2:
        			Intent DI = new Intent(getActivity(), DynInteractive.class);
        			startActivity(DI);
        			break;

        		case 3:
        			Intent HP = new Intent(getActivity(), Hotplug.class);
        			startActivity(HP);
        			break;

        		case 4:
        			Intent HPX = new Intent(getActivity(), HotplugX.class);
        			startActivity(HPX);
        			break;

        		case 5:
        			Intent II = new Intent(getActivity(), Interactive.class);
        			startActivity(II);
        			break;

        		case 6:
        			Intent IX = new Intent(getActivity(), InteractiveX.class);
        			startActivity(IX);
        			break;

        		case 7:
        			Intent Lagfree = new Intent(getActivity(), Lagfree.class);
        			startActivity(Lagfree);
        			break;

        		case 8:
        			Intent me = new Intent(getActivity(), Lazy.class);
        			startActivity(me);
        			break;

        		case 9:
        			Intent LH = new Intent(getActivity(), Lionheart.class);
        			startActivity(LH);
        			break;

        		case 10:
        			Intent I = new Intent(getActivity(), Lulzactive.class);
        			startActivity(I);
        			break;

        		case 11:
        			Intent MM = new Intent(getActivity(), MinMax.class);
        			startActivity(MM);
        			break;

        		case 12:
        			Intent Nightmare = new Intent(getActivity(), Nightmare.class);
        			startActivity(Nightmare);
        			break;

        		case 13:
        			Intent OD = new Intent(getActivity(), OnDemand.class);
        			startActivity(OD);
        			break;

        		case 14:
        			Intent ODP = new Intent(getActivity(), OndemandPlus.class);
        			startActivity(ODP);
        			break;

        		case 15:
        			Intent ODX = new Intent(getActivity(), OnDemandX.class);
        			startActivity(ODX);
        			break;

        		case 16:
        			Intent P = new Intent(getActivity(), PegasusQ.class);
        			startActivity(P);
        			break;

        		case 17:
        			Intent Pe = new Intent(getActivity(), Performance.class);
        			startActivity(Pe);
        			break;

        		case 18:
        			Intent PS = new Intent(getActivity(), Powersave.class);
        			startActivity(PS);
        			break;

        		case 19:
        			Intent SAA = new Intent(getActivity(), Sakuractive.class);
        			startActivity(SAA);
        			break;

        		case 20:
        			Intent SZ = new Intent(getActivity(), Savagedzen.class);
        			startActivity(SZ);
        			break;

        		case 21:
        			Intent S = new Intent(getActivity(), Scary.class);
        			startActivity(S);
        			break;

        		case 22:
        			Intent SA = new Intent(getActivity(), Smartass.class);
        			startActivity(SA);
        			break;

        		case 23:
        			Intent SmartassV2 = new Intent(getActivity(), SmartassV2.class);
        			startActivity(SmartassV2);
        			break;   
        			
        		case 24:
        			Intent Userspace = new Intent(getActivity(), Userspace.class);
        			startActivity(Userspace);
        			break;         			
                
        		}
        		
        	}
 
        });
        return view;
        }
	}