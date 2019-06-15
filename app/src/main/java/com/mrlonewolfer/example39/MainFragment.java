package com.mrlonewolfer.example39;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    Context context;
    ListView listCity;
   String[] cityName;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context=getActivity();
        View view= inflater.inflate(R.layout.fragment_main, container, false);

        listCity=view.findViewById(R.id.lstCity);
        cityName= getResources().getStringArray(R.array.city_list);
        ListviewAdapterClass listviewAdapterClass = new ListviewAdapterClass(context,cityName);
        listCity.setAdapter(listviewAdapterClass);
        return  view;
    }


}
