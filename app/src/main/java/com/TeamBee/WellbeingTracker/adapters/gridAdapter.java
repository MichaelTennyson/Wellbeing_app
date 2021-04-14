package com.TeamBee.WellbeingTracker.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.TeamBee.WellbeingTracker.R;

public class gridAdapter extends BaseAdapter {
    private Context myContext;

    //constructor
    public gridAdapter(Context c) {
        myContext= c;

    }
    @Override
    public int getCount() {
        //gets length of array
        return mThumbIDs.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = null;
        //following if statement sets, scales and padding the grid
        if(convertView == null){
            imageView = new ImageView(myContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(6, 6, 6, 6);
        }
        else
            imageView = (ImageView) convertView;
        imageView.setImageResource(mThumbIDs[position]);
        return imageView;


    }
    //the following is an array of drawable IDs
    public Integer[] mThumbIDs = {
            R.drawable.mad,
            R.drawable.smiley,
            R.drawable.unhappy,
            R.drawable.unwell

    };
}
