package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee4Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee5Binding;

public class megaFollowcoffee5Activity extends AppCompatActivity {

    private ActivityMegaFollowcoffee5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5Menu1 연결 버튼
        binding.btnMega5Menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee5Activity.this, megaFollowcoffee6Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega5Menu2 연결 버튼
        binding.btnMega5Menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee5Activity.this, megaFollowcoffee6Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}