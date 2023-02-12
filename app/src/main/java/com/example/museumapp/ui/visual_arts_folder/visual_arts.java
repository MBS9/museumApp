package com.example.museumapp.ui.visual_arts_folder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.museumapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link visual_arts#newInstance} factory method to
 * create an instance of this fragment.
 */
public class visual_arts extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public visual_arts() {
        // Required empty public constructor
    }
    public static visual_arts newInstance(String param1, String param2) {
        visual_arts fragment = new visual_arts();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_visual_arts, container, false);
        ImageButton imuImageButton = (ImageButton) root.findViewById(R.id.mnc_banner);
        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
        imuImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_national_museum);
            }
        });
        ImageButton muBtn = (ImageButton) root.findViewById(R.id.mucsarnok_banner);
        muBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_mucsarnok);
            }
        });
        ImageButton mBtn = (ImageButton) root.findViewById(R.id.mmh_banner);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_mai_mano_house);
            }
        });
        ImageButton lBtn = (ImageButton) root.findViewById(R.id.lumu_banner);
        lBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_lumu);
            }
        });
        ImageButton mfabBtn = (ImageButton) root.findViewById(R.id.mfab_banner);
        mfabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_mfab);
            }
        });
        return root;
    }
}