package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseFuncBinding;
import com.example.designthinkingproject.databinding.ActivityStudyMac1Binding;

public class StudyMega1 extends MyBaseActivity{

    private ActivityStudyMac1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMac1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnMega1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega1.this, StudyMega2.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
