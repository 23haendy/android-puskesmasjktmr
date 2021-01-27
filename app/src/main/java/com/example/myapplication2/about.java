package com.example.myapplication2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class about extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            ImageView imgAuthor = findViewById(R.id.img_profile);
            TextView tvauthor = findViewById(R.id.author);
            TextView tvEmail = findViewById(R.id.email);

            
            Glide.with(this)
                    .load(R.drawable.foto12)
                    .into(imgAuthor);


            tvauthor.setText("Haendy Busman");
           tvEmail.setText("haendy23@gmail.com");
        }
    }
}
