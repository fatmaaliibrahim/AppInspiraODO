package com.Inspira.odo.buyerUi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Inspira.odo.R;


public class MakeBatteryRequest extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rooteView = inflater.inflate(R.layout.fragment_make_battery_request, container, false);
        return  rooteView;
    }

}
