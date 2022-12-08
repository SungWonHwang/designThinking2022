package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee5Binding;

<<<<<<< HEAD:app/src/main/java/com/example/designthinkingproject/megaFollowCoffee5Activity.java
public class megaFollowCoffee5Activity extends AppCompatActivity {
=======
public class megaFollowcoffee5Activity extends MyBaseActivity {
>>>>>>> origin/main:app/src/main/java/com/example/designthinkingproject/megaFollowcoffee5Activity.java

    private ActivityMegaFollowcoffee5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowcoffee5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 카페라떼 연결 버튼
        binding.btnMega5CafeLatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee5Activity.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega5 카페모카 연결 버튼
        binding.btnMega5CafeMocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee5Activity.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}