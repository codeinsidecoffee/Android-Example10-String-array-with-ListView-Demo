package com.mrlonewolfer.example39;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

class ListviewAdapterClass extends ArrayAdapter<String> {
    Context context;
    String[] cityName;
    public ListviewAdapterClass(Context context, String[] cityName) {
        super(context,R.layout.fragment_main,cityName);
        this.context=context;
        this.cityName=cityName;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.service_layout, parent, false);
        TextView textviewName = (TextView) view.findViewById(R.id.txtCity);

        textviewName.setText(cityName[position]);
        return view;
    }

}
