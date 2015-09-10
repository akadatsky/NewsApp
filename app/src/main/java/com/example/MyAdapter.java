package com.example;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.rss.RssItem;

import java.util.List;

public class MyAdapter extends ArrayAdapter<RssItem> {

    private final LayoutInflater inflater;

    public MyAdapter(Context context) {
        super(context, 0);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, parent, false);
        }


        RssItem item = getItem(position);

        TextView text = (TextView) convertView.findViewById(R.id.text);
        text.setText(item.getTitle());
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        Glide.with(parent.getContext()).load(item.getImage()).into(imageView);
        return convertView;
    }
}