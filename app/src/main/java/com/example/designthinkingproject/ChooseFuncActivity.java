package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseFuncBinding;
import com.example.designthinkingproject.databinding.ActivityMainBinding;

public class ChooseFuncActivity extends MyBaseActivity {

    private ActivityChooseFuncBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseFuncBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnStudywithme 연결 버튼
        binding.btnStudywithme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseFuncActivity.this, StudyMac1Activity.class);
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