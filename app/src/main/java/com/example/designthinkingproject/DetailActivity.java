package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends MyBaseActivity {

    Dictionary selectedDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSelectedDictionary(); //선택한 딕셔너리 정보 가져오기

        setValues(); //가져온 정보 화면에 보여주기
    }

    private void setValues(){
        TextView tv1 = findViewById(R.id.dic_datail_name);
        TextView tv2 = findViewById(R.id.dic_detail_defi);

        tv1.setText(selectedDictionary.getName_1());
        tv2.setText(selectedDictionary.getName_2());
    }

    private void getSelectedDictionary(){

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        selectedDictionary = Dictionary_MainActivity.dictionaryList.get(Integer.valueOf(id));
    }
}