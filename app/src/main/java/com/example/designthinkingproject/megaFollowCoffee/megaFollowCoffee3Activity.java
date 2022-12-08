package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffee3Binding;
import com.example.designthinkingproject.megaFollow1Activity;
import com.example.designthinkingproject.megaFollowTea.megaFollowtea2Activity;
import com.example.designthinkingproject.megaFollowBeverage.megaFollowBeverage2Activity;
import com.example.designthinkingproject.megaFollowBeverage.megaFollowBeverage3Activity;

public class megaFollowCoffee3Activity extends AppCompatActivity {

    private ActivityMegaFollowCoffee3Binding binding;
    megaFollow1Activity temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffee3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2
        int var2 = ((megaFollow1Activity)megaFollow1Activity.BigMenu).var;

        //Coffee 페이지에서 넘어왔다면
        if (var2 == 1) {
            //btnMega3Hot 연결 버튼
            binding.btnMega3Hot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowCoffee4Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });

            //btnMega3Ice 연결 버튼
            binding.btnMega3Ice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowCoffee4Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });
        }

        //Tea 페이지에서 넘어왔다면
        if (var2 == 2) {
            //btnMega3Hot 연결 버튼
            binding.btnMega3Hot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowtea2Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });

            //btnMega3Ice 연결 버튼
            binding.btnMega3Ice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowtea2Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });
        }

        //Beverage 페이지에서 넘어왔다면
        if (var2 == 3) {
            //btnMega3Hot 연결 버튼
            binding.btnMega3Hot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowBeverage2Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });

            //btnMega3Ice 연결 버튼
            binding.btnMega3Ice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(megaFollowCoffee3Activity.this, megaFollowBeverage3Activity.class);
                    startActivity(intent); //액티비티 이동
                }
            });
        }

    }
}