package com.example.museumapp.ui.mai_mano_house_folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.museumapp.R;


public class mai_mano_house extends Fragment {
    View view;
    public mai_mano_house() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mai_mano_house, container, false);
        TextView button = view.findViewById((R.id.abt_btn_mai_mano_house));
        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_credits);
            }
        });
        TextView description = view.findViewById(R.id.description_museum_example);
        TextView viewMore = view.findViewById(R.id.view_mai_mano_house);
        ImageView imageView = (ImageView)view.findViewById((R.id.mai_mano_house_picture));
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