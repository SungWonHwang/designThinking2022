package com.example.designthinkingproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import com.example.designthinkingproject.databinding.ActivityAddSettingBinding;

public class AddSettingActivity extends MyBaseActivity {

    private ActivityAddSettingBinding binding;
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
        binding = ActivityAddSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences voiceBool = getSharedPreferences("VoiceBool", MODE_PRIVATE);
        Boolean voice = voiceBool.getBoolean("VoiceBool", false);

        if(voice){
        }
        else{
            mediaPlayer = MediaPlayer.create(AddSettingActivity.this, R.raw.setting_sound);
            mediaPlayer.start();
        }

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