package com.example.imagecircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ListView list = findViewById(R.id.list);
    ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Liburan");
        arrayList.add("Jajanku");
        arrayList.add("Sehari-hari");
        arrayList.add("Belajarkah");
        arrayList.add("Sedekah dulu");
        arrayList.add("Main dulu");
        arrayList.add("Game apa");
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String clickedItem=(String) list.getItemAtPosition(position);
            Toast.makeText(Main2Activity.this,clickedItem,Toast.LENGTH_LONG).show();
        }
    });
}
}
