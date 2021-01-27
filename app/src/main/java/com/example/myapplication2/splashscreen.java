package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);



        new Thread() {
            public void run() {
                try{Thread.sleep(5000);}
                catch (Exception e) {}
                Intent i = new Intent(splashscreen.this, MainActivity.class);
                splashscreen.this.finish();
                startActivity(i);
            } }.start();

    }

}


