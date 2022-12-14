package com.example.designthinkingproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseFuncBinding;

public class ChooseFuncActivity extends MyBaseActivity {

    private ActivityChooseFuncBinding binding;
    private SharedPreferences funcName;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseFuncBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        funcName = getSharedPreferences("FuncName",MODE_PRIVATE);
        SharedPreferences.Editor editor = funcName.edit();

        //btnStudywithme 연결 버튼
        binding.btnStudywithme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseFuncActivity.this, StudyMega1.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnFollowme 연결 버튼
        binding.btnFollowme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("FuncName", 0);
                editor.commit();

                Intent intent = new Intent(ChooseFuncActivity.this, megaFollow1Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnOrder 연결 버튼
        binding.btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("FuncName", 1);
                editor.commit();
                Intent intent = new Intent(ChooseFuncActivity.this, megaFollow1Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });


        // btnSetting 연결
        binding.btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseFuncActivity.this, AddSettingActivity.class );
                startActivity(intent); //액티비티 이동
                //Toast.makeText(MainActivity.this, "clicked button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}