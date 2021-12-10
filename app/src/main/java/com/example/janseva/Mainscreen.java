package com.example.janseva;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.janseva.databinding.ActivityMainscreenBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class Mainscreen extends AppCompatActivity {
    FirebaseAuth auth;
    TabLayout tabLayout;
    ViewPager viewPager;
    ActivityMainscreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        auth = FirebaseAuth.getInstance();
        binding = ActivityMainscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                break;
            case R.id.logout:
                auth.signOut();
                Intent intent = new Intent(Mainscreen.this, Login.class);
                startActivity(intent);
                break;
        }

        return true;
    }

    public void next(View view) {
        Intent intent=new Intent(Mainscreen.this,all.class);
        startActivity(intent);
    }

    public void complaint(View view) {
        Intent intent=new Intent(Mainscreen.this,all.class);
        startActivity(intent);
    }

    public void news(View view) {
        Intent intent=new Intent(Mainscreen.this,news.class);
        startActivity(intent);
    }

}