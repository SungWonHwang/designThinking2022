package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Dictionary_MainActivity extends MyBaseActivity {
    public static ArrayList<Dictionary> dictionaryList = new ArrayList<Dictionary>();

    ListView listView;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_main);

        setUpData(); //데이터 셋팅
        setUpList(); //리스트 셋팅
        setUpOnClickListener(); //상세페이지 이벤트
    }
//데이터 셋팅
    private void setUpData(){
        Dictionary takeout = new Dictionary("0", "테이크아웃","포장해서 가져가기");
        dictionaryList.add(takeout);

    }

    //리스트 셋팅
    private void setUpList(){
        listView = findViewById(R.id.dictionary_listView);

        DictionaryAdapter adapter = new DictionaryAdapter(getApplicationContext(),0,dictionaryList);
        listView.setAdapter(adapter);
    }

    //상세페이지 이벤트
    private  void setUpOnClickListener(){

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Dictionary selectDictionary = (Dictionary) listView.getItemAtPosition(position);
                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
                showDetail.putExtra("id", selectDictionary.getId());
                startActivity(showDetail);
            }
        });
    }
}
