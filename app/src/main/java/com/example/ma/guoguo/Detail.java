package com.example.ma.guoguo;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView restaurant_image = (ImageView)findViewById(R.id.restaurant_image);
        restaurant_image.setImageResource(R.drawable.apple_pic);

    }
}
