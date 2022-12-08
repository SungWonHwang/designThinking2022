package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.designthinkingproject.databinding.ActivitySettingVoiceServiceBinding;


public class SettingVoiceServiceActivity extends MyBaseActivity {
    private ActivitySettingVoiceServiceBinding binding;
    private SharedPreferences voiceBool;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingVoiceServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        voiceBool = getSharedPreferences("VoiceBool", MODE_PRIVATE);
        SharedPreferences.Editor editor = voiceBool.edit();

        //btnVoiceTrue 연결 버튼
        binding.btnVoiceTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("VoiceBool", false);
                editor.commit();
                /*읽어오기
                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                int nVal = pref.getInt("key2", 0);
                */
            }
        });

        //btnVoiceFalse 연결 버튼
        binding.btnVoiceFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putBoolean("VoiceBool", true);
                editor.commit();
            }
        });
    }

}