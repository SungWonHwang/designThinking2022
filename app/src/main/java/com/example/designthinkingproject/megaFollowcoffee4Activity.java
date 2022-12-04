package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee3Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee4Binding;

public class megaFollowcoffee4Activity extends AppCompatActivity {

    private ActivityMegaFollowcoffee4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega4MilkTrue 연결 버튼
        binding.btnMega4MilkTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee4Activity.this, megaFollowcoffee5Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega4MilkFalse 연결 버튼
        binding.btnMega4MilkFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee4Activity.this, megaFollowcoffee5Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}