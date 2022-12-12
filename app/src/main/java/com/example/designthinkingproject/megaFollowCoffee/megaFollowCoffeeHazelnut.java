package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffeeHazelnutBinding;
import com.example.designthinkingproject.megaFollow6ExtralorderActivity;

public class megaFollowCoffeeHazelnut extends AppCompatActivity {

    private ActivityMegaFollowCoffeeHazelnutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffeeHazelnutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 카페라떼 연결 버튼
        binding.HazelnutLatteIntrod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffeeHazelnut.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });




    }
}