package com.example.madsfinnerup.tractrac;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import CostumList.SearchListItems;
import CostumList.Search_ListAdapter;


public class SearchFragment extends Fragment {

private ListView listView;
private ArrayList <SearchListItems> arrayList;
SearchListItems searchListItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflaterview = inflater.inflate(R.layout.fragment_search, container, false);

        listView = inflaterview.findViewById(R.id.SearchList);
        arrayList = new ArrayList<>();

        String mDrawableName = "ess";
        Resources res = getResources();

        searchListItems = new SearchListItems(R.drawable.ess,"test","endny en test");

        arrayList.add(searchListItems);
        searchListItems = new SearchListItems(R.drawable.eurosail,"Sailing","Way to go mate");

        arrayList.add(searchListItems);

        Search_ListAdapter listAdapter = new Search_ListAdapter(getContext(),R.layout.costume_search_list,arrayList);

        listView.setAdapter(listAdapter);

        return  inflaterview;
    }

}
