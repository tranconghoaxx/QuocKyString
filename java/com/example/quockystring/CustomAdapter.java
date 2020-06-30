package com.example.quockystring;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<QuocKy>dataArList;
    public CustomAdapter(Context context, int resource,ArrayList<QuocKy>data) {
        super(context, resource);
        this.context =context;
        this.resource = resource;
        this.dataArList = data;
    }

    @Override
    public int getCount() {
        return  dataArList.size();
//        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(resource,null);
        ImageView img = view.findViewById(R.id.imgItem);
        TextView textView = view.findViewById(R.id.tvName);

        img.setImageResource(dataArList.get(position).getCo());
        textView.setText(dataArList.get(position).getTen());
        return  view;
//        return super.getView(position, convertView, parent);
    }
}
