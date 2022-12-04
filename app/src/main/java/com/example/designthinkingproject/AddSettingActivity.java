package com.example.designthinkingproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.designthinkingproject.databinding.ActivityAddSettingBinding;

public class AddSettingActivity extends MyBaseActivity {

    private ActivityAddSettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //글자크기 설정 연결 버튼
        binding.btnTextSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddSettingActivity.this, SettingTextSizeActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //음성 안내 설정 연결 버튼
        binding.btnSoundService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddSettingActivity.this, SettingVoiceServiceActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //어플 정보 연결 버튼
        binding.btnAppInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddSettingActivity.this, SettingAppInformationActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}