package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1 [], s2 [], s3[];
    int image [] ={R.drawable.bayam, R.drawable.nasi, R.drawable.susu, R.drawable.ayam, R.drawable.apel, R.drawable.pisang, R.drawable.telur, R.drawable.jagung, R.drawable.tuna, R.drawable.salmon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclView);

        s1 = getResources().getStringArray(R.array.gizi_makanan);
        s2 = getResources() .getStringArray(R.array.description);
        s3 = getResources().getStringArray(R.array.lengkap);


        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
