package ua.example.rash1k.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ua.example.rash1k.remindme.fragment.ExampleFragment;


public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[]{"Tab 1", "Reminder", "Tab 2"};
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return  ExampleFragment.newInstance();
            case 1:
                return ExampleFragment.newInstance();
            case 2:
                return  ExampleFragment.newInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }


}
