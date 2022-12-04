package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee2Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee3Binding;

public class megaFollowcoffee3Activity extends AppCompatActivity {

    private ActivityMegaFollowcoffee3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3Hot 연결 버튼
        binding.btnMega3Hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee3Activity.this, megaFollowcoffee4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega3Ice 연결 버튼
        binding.btnMega3Ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee3Activity.this, megaFollowcoffee4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}