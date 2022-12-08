package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee2Binding;

<<<<<<< HEAD:app/src/main/java/com/example/designthinkingproject/megaFollowCoffee2Activity.java
public class megaFollowCoffee2Activity extends AppCompatActivity {
=======
public class megaFollowcoffee2Activity extends MyBaseActivity {
>>>>>>> origin/main:app/src/main/java/com/example/designthinkingproject/megaFollowcoffee2Activity.java

    private ActivityMegaFollowcoffee2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega2General 연결 버튼
        binding.btnMega2General.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee2Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega2Dutch 연결 버튼
        binding.btnMega2Dutch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee2Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega2Press 연결 버튼
        binding.btnMega2Press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee2Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });


    }
}