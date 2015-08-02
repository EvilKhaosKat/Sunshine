package com.example.evilkhaoskat.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> weekForecast = new ArrayList<>();
        weekForecast.add("Today - Sunday - 23/15");
        weekForecast.add("Tomorrow - Foggy - 20/10");
        weekForecast.add("Weds - Cloudy - 22/12");
        weekForecast.add("Thurs - Rainy  - 22/12");
        weekForecast.add("Fri - Sunny - 25/16");
        weekForecast.add("Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18");
        weekForecast.add("Sun 6/29 - Sunny - 20/7");

        ArrayAdapter<String> forecastListAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(forecastListAdapter);

        return rootView;
    }
}
