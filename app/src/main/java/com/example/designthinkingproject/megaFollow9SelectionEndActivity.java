package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollow7placeBinding;
import com.example.designthinkingproject.databinding.ActivityMegaFollow9SelectionEndBinding;

public class megaFollow9SelectionEndActivity extends AppCompatActivity {

    private ActivityMegaFollow9SelectionEndBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow9SelectionEndBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        SharedPreferences funcName = getSharedPreferences("FuncName", MODE_PRIVATE);
        Integer sharedFuncName = funcName.getInt("FuncName", 0);



        //btnNextPage 연결 버튼
        binding.btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sharedFuncName==0){
                    Intent intent = new Intent(megaFollow9SelectionEndActivity.this, megaFollow10ExplainNextActivity.class);
                    startActivity(intent); //액티비티 이동
                }
                else if(sharedFuncName==1){
                    Intent intent = new Intent(megaFollow9SelectionEndActivity.this, megaFollow8QrActivity.class);
                    startActivity(intent); //액티비티 이동
                }
            }
        });


    }
}