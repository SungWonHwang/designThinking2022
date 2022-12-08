package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.designthinkingproject.databinding.ActivityDictionaryBinding;
import com.example.designthinkingproject.databinding.ActivityStudyMega1Binding;

public class Dictionary extends MyBaseActivity {

    private ActivityDictionaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityDictionaryBinding binding = ActivityDictionaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2
    }
}

