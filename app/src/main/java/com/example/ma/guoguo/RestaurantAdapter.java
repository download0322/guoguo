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
		Restaurant restaurant = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.RestaurantImage = (ImageView) view.findViewById(R.id.restaurant_image);
			viewHolder.RestaurantName = (TextView) view.findViewById(R.id.restaurant_name);
			viewHolder.about=(TextView)view.findViewById(R.id.about);
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.RestaurantImage.setImageResource(restaurant.getImageId());
		viewHolder.RestaurantName.setText(restaurant.getName());
		viewHolder.about.setText(restaurant.getAbout());
		return view;
	}
	
	class ViewHolder {
		
		ImageView RestaurantImage;
		
		TextView RestaurantName;

		TextView about;
		
	}

}
