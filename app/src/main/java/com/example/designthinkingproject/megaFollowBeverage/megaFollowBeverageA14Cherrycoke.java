package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverageA14CherrycokeBinding;
import com.example.designthinkingproject.megaFollow6ExtralorderActivity;

public class megaFollowBeverageA14Cherrycoke extends AppCompatActivity {

    private ActivityMegaFollowBeverageA14CherrycokeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowBeverageA14CherrycokeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 카페라떼 연결 버튼
        binding.CherryCokeIntrod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverageA14Cherrycoke.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });




    }
}