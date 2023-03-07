package com.example.museumapp.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.museumapp.ui.history_fragment.history;
import com.example.museumapp.ui.other_folder.other;
import com.example.museumapp.ui.science_fragment.science;
import com.example.museumapp.ui.visual_arts_folder.visual_arts;




public class ViewPagerAdapter  extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new science();
            case 2:
                return new history();
            case 3:
                return new other();
            default:
                return new visual_arts();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
