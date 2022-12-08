package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.example.designthinkingproject.databinding.ActivityStudyMega3Binding;


public class StudyMega3 extends MyBaseActivity{

    private ActivityStudyMega3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMega3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega3 연결 버튼
        binding.btnMega3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega3.this, StudyMega4.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
