package com.example.ma.guoguo;

import android.content.Intent;
import android.content.SyncAdapterType;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Bundle bundle = this.getIntent().getExtras();
        String detail = bundle.getString("detail");
        String[] item = detail.split(" ");
        int imgid = getResources().getIdentifier(item[1].split(":")[1], "drawable", "com.example.ma.guoguo"); //动态获取image id
        String address = item[3].split(":")[1]; //中文地址
        String coordinate = item[4].split(":")[1];  //坐标：longitude.latitude
        final float longitude = Float.parseFloat(coordinate.split(",")[0]);
        final float latitude = Float.parseFloat(coordinate.split(",")[1]);
        final String phone_number = item[5].split(":")[1];

        ImageView restaurant_image = (ImageView)findViewById(R.id.restaurant_image);
        restaurant_image.setImageResource(imgid);

        TextView text_location = (TextView)findViewById(R.id.show_location);
        text_location.setText(address);
        text_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //打开地图，并将坐标传递进去
                Intent intent = new Intent(Detail.this, Map.class);
                Bundle bundle_coordinate = new Bundle();
                bundle_coordinate.putFloat("latitude", latitude);
                bundle_coordinate.putFloat("longitude", longitude);
                intent.putExtras(bundle_coordinate);
                startActivity(intent);
            }
        });

        final TextView text_phone_number =(TextView)findViewById(R.id.phone_number);
        text_phone_number.setText(phone_number);
        text_phone_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //根据电话号码拨号
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + phone_number));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        LinearLayout detail_image = (LinearLayout)findViewById(R.id.detail_image);
        String[] images = item[2].split(":")[1].split(",");
        System.out.println(images.length);
        for(int j = 0;j<images.length;j++)
        {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            int img_id = getResources().getIdentifier(images[j], "drawable", "com.example.ma.guoguo"); //动态获取image id
            imageView.setImageResource(img_id);

            ViewGroup.LayoutParams para;
            para = imageView.getLayoutParams();
            para.height = 300;
            para.width = 300;
            imageView.setLayoutParams(para);

            imageView.setPadding(5,5,5,0);

            detail_image.addView(imageView);
        }
    }
}
