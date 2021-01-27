package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPuskesmas;
    private ArrayList<Puskesmas> list = new ArrayList<>();
    private String context;
    private ImageView imgPhoto;
    private TextView tvName, tvDetail;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPuskesmas = findViewById(R.id.rv_puskesmas);
        rvPuskesmas.setHasFixedSize(true);

        list.addAll(PuskesmasData.getListData());
        showRecyclerList();
    }



    private void showRecyclerList() {
        rvPuskesmas.setLayoutManager(new LinearLayoutManager(this));
        ListPuskesmasAdapter listPuskesmasAdapter = new ListPuskesmasAdapter(list);
        rvPuskesmas.setAdapter(listPuskesmasAdapter);

        listPuskesmasAdapter.setOnItemClickCallback(new ListPuskesmasAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Puskesmas data) {
                showSelectedPuskesmas(data);
            }
        });

}

    private void showSelectedPuskesmas(Puskesmas puskesmas) {
        Toast.makeText(this, "Kamu memilih " + puskesmas.getName(), Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);

                break;

        }
    }




}
