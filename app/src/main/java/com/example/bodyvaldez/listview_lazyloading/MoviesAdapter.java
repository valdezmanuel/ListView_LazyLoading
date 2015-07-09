package com.example.bodyvaldez.listview_lazyloading;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fmsirvent.ParallaxEverywhere.PEWImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Body Valdez on 08/07/2015.
 */
public class MoviesAdapter extends BaseAdapter {

    LayoutInflater inflater = null;
    ArrayList<Movie> movies;
    Activity a;
    public MoviesAdapter(Activity activity,ArrayList<Movie> movies){
        this.movies = movies;
        a = activity;
        inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return movies.size();
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
        View v = convertView;
        Movie m = movies.get(position);
        if(convertView == null)
            v = inflater.inflate(R.layout.item_movies,null);
            PEWImageView img = (PEWImageView)v.findViewById(R.id.img_movie);
            TextView tv = (TextView)v.findViewById(R.id.title_movie);
            //set the values
            //using the library picasso to load the image into the imageview
            Picasso.with(a.getApplicationContext()).load(m.getUrlImg()).into(img);
            tv.setText(m.getTitle());
        return v;
    }
}
