package com.example.madsfinnerup.tractrac;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;

import com.example.madsfinnerup.tractrac.Tabs.Clubs_tab;
import com.example.madsfinnerup.tractrac.Tabs.Events_tab;
import com.example.madsfinnerup.tractrac.Tabs.Relevant_tab;
import com.example.madsfinnerup.tractrac.Tabs.SectionsAdapter;

import java.util.ArrayList;

import CostumList.SearchListItems;
import CostumList.Search_ListAdapter;


public class SearchFragment extends Fragment {

private ListView listView;
private ArrayList <SearchListItems> arrayList;
SearchListItems searchListItems;

private static final String  TAG = "Main";
private SectionsAdapter sectionsAdapter;
private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflaterview = inflater.inflate(R.layout.fragment_search, container, false);

        sectionsAdapter = new SectionsAdapter(getFragmentManager());

        viewPager = (ViewPager) inflaterview.findViewById(R.id.container);
        setUpAdapter(viewPager);

        TabLayout tabLayout = (TabLayout) inflaterview.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // if need it can be added again, but prob not gonna happen.

        return  inflaterview;
    }

    private void setUpAdapter(ViewPager viewPager) {
        SectionsAdapter adapter = new SectionsAdapter(getFragmentManager());
        adapter.addFragment(new Relevant_tab(), "RelevantTab");
        adapter.addFragment(new Events_tab(),"EventsTab");
        adapter.addFragment(new Clubs_tab(),"ClubsTab");
        viewPager.setAdapter(adapter);
    }

}
