package com.example.designthinkingproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Dictionary;

public class DictionaryAdapter extends ArrayAdapter<Dictionary> {

    public DictionaryAdapter(Context context, int resource, ArrayList<com.example.designthinkingproject.Dictionary> dictionaryList){

    super(context, resource, dictionaryList);
    }

@NonNull
@Override
public  View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

    Dictionary dictionary = getItem(position);
    if(convertView == null) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.dictionary_item, parent, false);
    }

    TextView tv1 = convertView.findViewById(R.id.dic_name);
    TextView tv2 = convertView.findViewById(R.id.dic_defi);

    tv1.setText(dictionary.getName_1());
    tv2.setText(dictionary.getName_2());

    return convertView;
    }

}
