package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffee6Binding;
import com.example.designthinkingproject.megaFollow6ExtralorderActivity;

public class megaFollowCoffee6Activity extends AppCompatActivity {

    private ActivityMegaFollowCoffee6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffee6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega6 아메리카노 연결 버튼
        binding.btnMega6Americano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(megaFollowCoffee6Activity.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}