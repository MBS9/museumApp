package com.example.museumapp.ui.museum_of_illusions_folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.museumapp.R;



public class museum_of_illusions extends Fragment {
    View view;
    public museum_of_illusions() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_example_museum, container, false);
        TextView button = view.findViewById((R.id.abt_btn_museum_example));
        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_credits);
            }
        });
        TextView description = view.findViewById(R.id.description_museum_example);
        TextView viewMore = view.findViewById(R.id.view_museum_example);
        ImageView imageView = (ImageView)view.findViewById((R.id.imu_picture));

        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewMore.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.GONE);
                button.setVisibility(View.INVISIBLE);
                description.setMaxLines(Integer.MAX_VALUE);
            }

        });
        return view;

    }
}