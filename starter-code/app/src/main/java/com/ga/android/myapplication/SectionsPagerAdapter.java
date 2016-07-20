package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int mPageCount;

    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment sagetFragment;
        switch (position){
            //Complete this
            case 0:
                sagetFragment = new PlaceholderFragment();
                break;
            case 1:
                sagetFragment = new AboutFragment();
                break;
            case 2:
                sagetFragment = new ContactFragment();
                break;

            default: return new PlaceholderFragment();
        }
        return sagetFragment;

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "SAGET";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
        }

    }
}
