package com.example.designthinkingproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.designthinkingproject.databinding.ActivityMainBinding;


public class MainActivity<ActivityMainBinding> extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2


        // btnCafePart 연결
        binding.btnCafePart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseCafeActivity.class );
                startActivity(intent); //액티비티 이동
                //Toast.makeText(MainActivity.this, "clicked button", Toast.LENGTH_SHORT).show();
            }
        });

        // btn_foodPart 연결
        binding.btnFoodPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseFoodActivity.class );
                startActivity(intent); //액티비티 이동
            }
        });

        // btn_moviePart 연결
        binding.btnMoviePart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseMovieActivity.class );
                startActivity(intent); //액티비티 이동
            }
        });

        // btn_moviePart 연결
        binding.btnMartPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseMartActivity.class );
                startActivity(intent); //액티비티 이동
            }
        });

        //Setting 연결
        binding.btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddSettingActivity.class );
                startActivity(intent); //액티비티 이동
            }
        });

    }
}