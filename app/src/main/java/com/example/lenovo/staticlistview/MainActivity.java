package com.example.lenovo.staticlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String places[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       lv=findViewById(R.id.list_view);

       places=getResources().getStringArray(R.array.data);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(MainActivity.this, ""+places[position], Toast.LENGTH_SHORT).show();
                String item=places[position];
                Toast.makeText(MainActivity.this, ""+item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
