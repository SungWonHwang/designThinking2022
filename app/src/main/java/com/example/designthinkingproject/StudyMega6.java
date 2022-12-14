package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.example.designthinkingproject.databinding.ActivityStudyMega6Binding;


public class StudyMega6 extends MyBaseActivity{

    private ActivityStudyMega6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMega6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnWhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega6.this, StudyMega7.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
