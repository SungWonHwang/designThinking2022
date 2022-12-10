package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityBeginSetting1Binding;
import com.example.designthinkingproject.databinding.ActivitySettingTextSizeBinding;

public class beginSetting1Activity extends MyBaseActivity {

    private ActivityBeginSetting1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBeginSetting1Binding.inflate(getLayoutInflater());
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
        //BigSize 설정 버튼
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginSetting1Activity.this, beginSetting2Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}