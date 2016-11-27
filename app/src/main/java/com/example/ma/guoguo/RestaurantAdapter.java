package com.example.ma.guoguo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

	private int resourceId;

	public RestaurantAdapter(Context context, int textViewResourceId,
			List<Restaurant> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Restaurant fruit = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.RestaurantImage = (ImageView) view.findViewById(R.id.fruit_image);
			viewHolder.RestaurantName = (TextView) view.findViewById(R.id.fruit_name);
			viewHolder.about=(TextView)view.findViewById(R.id.about);
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.RestaurantImage.setImageResource(fruit.getImageId());
		viewHolder.RestaurantName.setText(fruit.getName());
		viewHolder.about.setText(fruit.getAbout());
		return view;
	}
	
	class ViewHolder {
		
		ImageView RestaurantImage;
		
		TextView RestaurantName;

		TextView about;
		
	}

}
