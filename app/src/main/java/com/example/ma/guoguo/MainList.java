package com.example.ma.guoguo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainList extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainList.this,
                R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainList.this, fruit.getName(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainList.this, Detail.class);
                startActivity(intent);
            }
        });
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.apple_pic, "about");
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.banana_pic, "about");
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.orange_pic, "about");
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic, "about");
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.pear_pic, "about");
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.grape_pic, "about");
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic, "about");
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic, "about");
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic, "about");
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.mango_pic, "about");
        fruitList.add(mango);
        Fruit cherry1 = new Fruit("Cherry1", R.drawable.cherry_pic, "about");
        fruitList.add(cherry1);
        Fruit mango1 = new Fruit("Mango1", R.drawable.mango_pic, "about");
        fruitList.add(mango1);
    }
}
