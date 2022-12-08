package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

<<<<<<< HEAD:app/src/main/java/com/example/designthinkingproject/megaFollow6ExtralorderActivity.java
import com.example.designthinkingproject.databinding.ActivityMegaFollow6extralorderBinding;

public class megaFollow6ExtralorderActivity extends AppCompatActivity {
=======
import com.example.designthinkingproject.databinding.ActivityMegaFollowcoffee5Binding;
import com.example.designthinkingproject.databinding.ActivityMegaFollow6extralorderBinding;

public class megaFollowcoffee6Activity extends MyBaseActivity {
>>>>>>> origin/main:app/src/main/java/com/example/designthinkingproject/megaFollowcoffee6Activity.java

    private ActivityMegaFollow6extralorderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow6extralorderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega6Yes 연결 버튼
        binding.btnMega6Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow6ExtralorderActivity.this, megaFollow1Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

/*        //btnMega6No 연결 버튼
        binding.btnMega6No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowcoffee6Activity.this, megaFollowc.class);
                startActivity(intent); //액티비티 이동
            }
        });
*/

    }
}