package com.example.designthinkingproject;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.designthinkingproject.databinding.ActivityDictionaryBinding;

public class DictionaryActivity extends MyBaseActivity {

    private ActivityDictionaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityDictionaryBinding binding = ActivityDictionaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2
    }
}

