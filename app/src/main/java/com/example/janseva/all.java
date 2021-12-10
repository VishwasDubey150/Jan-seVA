package com.example.janseva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
    }

    public void elec(View view) {
        Intent intent=new Intent(all.this,electricity.class);
        startActivity(intent);
    }

    public void road(View view) {
        Intent intent=new Intent(all.this,road.class);
        startActivity(intent);
    }

    public void sewage(View view) {
        Intent intent=new Intent(all.this,sewage.class);
        startActivity(intent);
    }

    public void others(View view) {
        Intent intent=new Intent(all.this,others.class);
        startActivity(intent);
    }

    public void Feedback(View view) {
        Intent intent=new Intent(all.this,feedback.class);
        startActivity(intent);
    }
}