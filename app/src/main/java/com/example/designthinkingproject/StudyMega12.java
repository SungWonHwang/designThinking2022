package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import com.example.designthinkingproject.databinding.ActivityStudyMega12Binding;


public class StudyMega12 extends MyBaseActivity{

    private ActivityStudyMega12Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMega12Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //imgbtn_mega1 연결 버튼
        binding.btnMega12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudyMega12.this, megaLightCoffee10Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
