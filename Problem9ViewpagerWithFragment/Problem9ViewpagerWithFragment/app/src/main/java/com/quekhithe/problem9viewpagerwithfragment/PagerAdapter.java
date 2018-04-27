package com.quekhithe.problem9viewpagerwithfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by QueKhiThe on 2/15/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTab;

    public PagerAdapter(FragmentManager fm, int NumOfTab) {
        super(fm);
        this.mNumOfTab = NumOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: TabFragment tab1 = new TabFragment();
            return tab1;
            case 1: Tab2Fragment tab2 = new Tab2Fragment();
            return tab2;
            case 2: Tab3Fragment tab3 = new Tab3Fragment();
            return tab3;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTab;
    }
}
