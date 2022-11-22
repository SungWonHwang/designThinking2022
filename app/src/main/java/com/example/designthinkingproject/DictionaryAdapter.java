package com.example.designthinkingproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Dictionary;
import java.util.List;

public class DictionaryAdapter extends ArrayAdapter<Dictionary> {

    public DictionaryAdapter(Context context, int resource, List<Dictionary> dictionaryList)

    super(context, resource, dictionaryList);
    }

@NonNull
@Override
public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

    Dictionary dictionary = getItem(position);
    if(convertView == null) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.dictionary, parent, false);
    }

    TextView tv = convertView.findViewById(R.id.)
    }

}
