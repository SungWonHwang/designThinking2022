package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.MyBaseActivity;
import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffee7Binding;

public class megaFollowCoffee7 extends MyBaseActivity {

    private ActivityMegaFollowCoffee7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffee7Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

/*
        //btnMega5 카페라떼 연결 버튼
        binding.btnMega5CafeLatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee7Activity.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
*/
        //btnMega5HazelnutLatte 헤이즐넛라떼 연결 버튼
        binding.btnMega5HazelnutLatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee7.this, megaFollowCoffeeHazelnut.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}