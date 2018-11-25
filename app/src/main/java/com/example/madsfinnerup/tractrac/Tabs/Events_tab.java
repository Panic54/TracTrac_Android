package com.example.madsfinnerup.tractrac.Tabs;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
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

public class Events_tab extends Fragment {
    private ListView listView;
    private ArrayList<SearchListItems> arrayList;
    SearchListItems searchListItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflaterview = inflater.inflate(R.layout.fragment_events_tab, container, false);

        listView = inflaterview.findViewById(R.id.EventsTabList);
        setUpList();

        return inflaterview;
    }


    void setUpList (){

        arrayList = new ArrayList<>();

        String mDrawableName = "ess";
        Resources res = getResources();

        searchListItems = new SearchListItems(R.drawable.ess,"Events test","Events endny en test");

        arrayList.add(searchListItems);
        searchListItems = new SearchListItems(R.drawable.eurosail,"Sailing","Events");

        arrayList.add(searchListItems);
        Search_ListAdapter listAdapter = new Search_ListAdapter(getContext(),R.layout.costume_search_list,arrayList);

        listView.setAdapter(listAdapter);
    }
}
