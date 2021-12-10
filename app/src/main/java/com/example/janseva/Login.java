package com.example.janseva;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.janseva.databinding.ActivityMain2Binding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    ActivityMain2Binding binding;
    ProgressDialog PD;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();

        PD = new ProgressDialog(Login.this);
        PD.setTitle("Please Wait");
        PD.setMessage("Login to your account");

        binding.LogIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PD.show();
                auth.signInWithEmailAndPassword(binding.etemail.getText().toString(),binding.etpassword.getText().toString())
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        PD.dismiss();
                        if(task.isSuccessful())
                        {
                            Intent intent = new Intent(Login.this,Mainscreen.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(Login.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });



    }

    public void create(View view) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }
}