package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

import com.example.designthinkingproject.databinding.ActivityAddSettingBinding;
import com.example.designthinkingproject.databinding.ActivitySettingTextSizeBinding;

public class SettingTextSizeActivity extends MyBaseActivity {

    private ActivitySettingTextSizeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingTextSizeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //SmallSize 설정 버튼
        binding.btnFontSmallSize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                adjustFontScaleSmall(getResources().getConfiguration());
            }
        });

        //NormalSize 설정 버튼
        binding.btnFontNormalSize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                adjustFontScaleNormal(getResources().getConfiguration());
            }
        });

        //BigSize 설정 버튼
        binding.btnFontBigSize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                adjustFontScaleBig(getResources().getConfiguration());
            }
        });

    }
}