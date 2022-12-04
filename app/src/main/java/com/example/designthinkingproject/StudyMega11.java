package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.example.designthinkingproject.databinding.ActivityStudyMega11Binding;


public class StudyMega11 extends MyBaseActivity{

    private ActivityStudyMega11Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMega11Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnMega11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega11.this, StudyMega12.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
