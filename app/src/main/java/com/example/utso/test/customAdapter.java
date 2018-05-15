package com.example.utso.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class customAdapter extends BaseAdapter{

    Context context;
    int flags[];
    String[] str;
    LayoutInflater inflater;

    public customAdapter(Context context, int[] flags, String[] str){
        this.context = context;
        this.flags = flags;
        this.str = str;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.custom_resource,null);
        ImageView icon = (ImageView)view.findViewById(R.id.imageView);
        TextView names = (TextView)view.findViewById(R.id.textView1);
        icon.setImageResource(flags[position]);
        names.setText(str[position]);
        return view;
    }
}
