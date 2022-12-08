package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffee3Binding;

public class megaFollowCoffee3Activity extends AppCompatActivity {

    private ActivityMegaFollowCoffee3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffee3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3Hot 연결 버튼
        binding.btnMega3Hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowCoffee4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega3Ice 연결 버튼
        binding.btnMega3Ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowCoffee4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}