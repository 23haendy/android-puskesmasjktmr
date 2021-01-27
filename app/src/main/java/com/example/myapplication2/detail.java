package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class detail extends AppCompatActivity {
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public String title="Detail";
    private ImageView imgPhoto;
    private TextView  tvnama, tvdetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        TextView tvnama = findViewById(R.id.tvnama);
        TextView tvdetail = findViewById(R.id.tvdetail);
        ImageView imgPhoto = findViewById(R.id.img_item_photo);

         int getPhoto =  getIntent().getIntExtra(EXTRA_PHOTO,0);
        String getNama = getIntent().getStringExtra(EXTRA_NAMA);
        String getdetail = getIntent().getStringExtra(EXTRA_DETAIL);

        Glide.with(this)
                .load(getPhoto)
                .apply(new RequestOptions().override(100, 100))
                .into(imgPhoto);

        tvnama.setText(getNama);
        tvdetail.setText(getdetail);
        }
        private void setActionBarTitle (String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
        }

    }

