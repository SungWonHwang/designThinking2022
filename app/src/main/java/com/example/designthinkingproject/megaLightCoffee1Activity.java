package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee1Binding;
import com.example.designthinkingproject.databinding.ActivityStudyMega1Binding;

public class megaLightCoffee1Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee1Binding binding = ActivityMegaLightCoffee1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnMega1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee1Activity.this, megaLightCoffee2Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btn_video 연결 버튼
        binding.btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee1Activity.this, megaVideoActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        //btn_setting 연결 버튼
        binding.btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee1Activity.this, AddSettingActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        //btn_dic 연결 버튼
        binding.btnDic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee1Activity.this, MyDictionaryActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        //btn_back 연결 버튼
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee1Activity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}