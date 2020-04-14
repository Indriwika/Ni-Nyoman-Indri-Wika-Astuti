package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SeconActivity extends AppCompatActivity {

    ImageView secondImageView;
    TextView Nama, Penjelasan;
    String data1, data3;
    int myImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);
        secondImageView = findViewById(R.id.secondImageView);
        Nama = findViewById(R.id.Nama);
        Penjelasan =findViewById(R.id.penjelasan);

        getData();
        setData();
    }
    private void getData(){
        if(getIntent().hasExtra("myImageView") && getIntent().hasExtra("data1") && getIntent().hasExtra("data3")){
            data1 = getIntent().getStringExtra("data1");
            data3 = getIntent().getStringExtra("data3");
            myImageView = getIntent().getIntExtra("myImageView", 1);

        }else {
            Toast.makeText(this, "no data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        Nama.setText(data1);
        Penjelasan.setText(data3);
        secondImageView.setImageResource(myImageView);
    }
}
