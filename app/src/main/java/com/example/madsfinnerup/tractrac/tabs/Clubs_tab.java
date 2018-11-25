package com.example.madsfinnerup.tractrac.tabs;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.madsfinnerup.tractrac.R;

import java.util.ArrayList;

import CostumList.SearchListItems;
import CostumList.Search_ListAdapter;


public class Clubs_tab extends Fragment {
    private ListView listView;
    private ArrayList<SearchListItems> arrayList;
    SearchListItems searchListItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflaterview = inflater.inflate(R.layout.fragment_clubs_tab, container, false);

        listView = inflaterview.findViewById(R.id.ClubsTabList);
        setUpList();

        return inflaterview;
    }

    void setUpList (){

        arrayList = new ArrayList<>();

        String mDrawableName = "ess";
        Resources res = getResources();

        searchListItems = new SearchListItems(R.drawable.ess,"Clubs test","Clubs endny en test");

        arrayList.add(searchListItems);
        searchListItems = new SearchListItems(R.drawable.eurosail,"Sailing","Clubs");

        arrayList.add(searchListItems);
        Search_ListAdapter listAdapter = new Search_ListAdapter(getContext(),R.layout.costume_search_list,arrayList);

        listView.setAdapter(listAdapter);
    }
}