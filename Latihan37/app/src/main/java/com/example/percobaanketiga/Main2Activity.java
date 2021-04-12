package com.example.percobaanketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);

                Button button = findViewById(R.id.button2);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Main2Activity.this,Addnew.class);
                        startActivity(intent);

                        Button button = findViewById(R.id.button3);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Main2Activity.this,About.class);
                                startActivity(intent);

                            }
                        });
                    }
                });
            }
        });


    }
}
