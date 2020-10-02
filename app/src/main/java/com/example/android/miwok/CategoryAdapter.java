package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.provider.Settings.Global.getString;

public class CategoryAdapter extends FragmentPagerAdapter {

    private final Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NumbersFragment();
        } else if (position == 1){
            return new ColorsFragment();
        } else if (position == 2){
            return new FamilyFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        if (position == 0){
            return context.getString(R.string.category_numbers);
        } else if (position == 1){
            return context.getString(R.string.category_colors);
        } else if (position == 2){
            return context.getString(R.string.category_family);
        } else {
            return context.getString(R.string.category_phrases);
        }
    }
}
