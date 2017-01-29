package com.example.faisalkhan.layoutanditstypes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Activity Class to display list of Layouts
 *
 * @author Faisal Khan
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list of data
        ArrayList<String> listData=new ArrayList<>();
        listData.add("LinearLayout");
        listData.add("RelativeLayout");
        listData.add("FrameLayout");

        // initializing instance of list view from xml
        ListView listView=(ListView)findViewById(R.id.lv_items);

        //setting adapter in list
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData));

        //setting on item click listener on list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){

                    case 0: //View
                        //start intent to reach activity where you can see how to use LinearLayout
                        startActivity(new Intent(MainActivity.this,LinearLayoutActivity.class));
                        break;

                    case 1: //TextView
                        //start intent to reach activity where you can see how to use RelativeLayout
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;

                    case 2: //Button
                        //start intent to reach activity where you can see how to use FrameLayout
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                }
            }
        });
    }
}
