package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.openclassrooms.entrevoisins.R;


public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {


    public Object MyNeighbourRecyclerViewAdapter;

    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        return NeighbourFragment.newInstance();

    }


    /**
     * get the number of pages
     *
     * @return
     */
    @Override
    public int getCount() {
        return 1;
    }





}

