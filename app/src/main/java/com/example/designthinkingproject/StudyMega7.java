package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.example.designthinkingproject.databinding.ActivityStudyMega7Binding;


public class StudyMega7 extends MyBaseActivity{

    private ActivityStudyMega7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMega7Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnMega7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega7.this, StudyMega8.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
