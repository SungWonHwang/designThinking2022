package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee5Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollow6extralorderBinding;

public class megaFollowcoffee6Activity extends MyBaseActivity {

    private ActivityMegaFollow6extralorderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow6extralorderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega6Yes 연결 버튼
        binding.btnMega6Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee6Activity.this, megaFollow1Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega6No 연결 버튼
        binding.btnMega6No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee6Activity.this, megaFollowcoffee7Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });


    }
}