package com.example.ma.guoguo;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView restaurant_image = (ImageView)findViewById(R.id.restaurant_image);
        restaurant_image.setImageResource(R.drawable.apple_pic);

        TextView text_location = (TextView)findViewById(R.id.show_location);
        text_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail.this, Map.class);
                startActivity(intent);
            }
        });

        TextView phone_number =(TextView)findViewById(R.id.phone_number)

    }
}
