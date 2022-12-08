package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.designthinkingproject.databinding.ActivitySettingVoiceServiceBinding;


public class SettingVoiceServiceActivity extends MyBaseActivity {
    private ActivitySettingVoiceServiceBinding binding;
    private SharedPreferences voiceBool;
    SharedPreferences.Editor editor;
    MediaPlayer mediaPlayer;

    // 액티비티가 종료될때.. 이곳을 실행함.
    @Override
    protected void onDestroy() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }

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
                mediaPlayer = MediaPlayer.create(SettingVoiceServiceActivity.this, R.raw.soundtrue);
                mediaPlayer.start();
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
                mediaPlayer = MediaPlayer.create(SettingVoiceServiceActivity.this, R.raw.soundfalse);
                mediaPlayer.start();
                editor.putBoolean("VoiceBool", true);
                editor.commit();
            }
        });
    }

}