package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee6Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee7Binding;

public class megaFollowcoffee7Activity extends AppCompatActivity {

    private ActivityMegaFollowcoffee7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee7Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega7Here 연결 버튼
        binding.btnMega7Here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee7Activity.this, megaFollowcoffeeQRActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega7Togo 연결 버튼
        binding.btnMega7Togo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee7Activity.this, megaFollowcoffeeQRActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });


    }
}