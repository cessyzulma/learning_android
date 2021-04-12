package com.example.imagecircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {

    //Deklarasi Variable CircleImageView
    private CircleImageView GambarBulat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        GambarBulat = findViewById(R.id.profile_image);
        GambarBulat.setImageResource(R.drawable.kucing);
    }
}
