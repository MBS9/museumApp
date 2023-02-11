package com.example.museumapp.ui.mfab_folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.museumapp.R;


public class mfab extends Fragment {
    View view;
    public mfab() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        view =  inflater.inflate(R.layout.fragment_mfab, container, false);
        TextView description = view.findViewById(R.id.description_museum_example);
        TextView viewMore = view.findViewById(R.id.view_mfab);
        ImageView imageView = (ImageView)view.findViewById((R.id.mfab_picture));
        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMore.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.GONE);
                description.setMaxLines(Integer.MAX_VALUE);
            }
        });
        return view;
    }
}