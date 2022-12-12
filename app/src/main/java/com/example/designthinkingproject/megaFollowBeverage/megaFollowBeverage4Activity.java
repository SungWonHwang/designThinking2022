package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverage4Binding;

public class megaFollowBeverage4Activity extends AppCompatActivity {

    private ActivityMegaFollowBeverage4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowBeverage4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //체리콕 연결 버튼
        binding.btnMega4CherryCoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverage4Activity.this, megaFollowBeverageA14Cherrycoke.class);
                startActivity(intent); //액티비티 이동
            }
        });




    }
}