package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.annotation.NonNull;

import com.example.designthinkingproject.databinding.ActivityStudyMega1Binding;


public class StudyMega1 extends MyBaseActivity{

    private ActivityStudyMega1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityStudyMega1Binding binding = ActivityStudyMega1Binding.inflate(getLayoutInflater());
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
