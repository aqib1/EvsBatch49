package com.evs.evsandroid.evsandroid49;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AQIB JAVED on 10/10/2020.
 */

public class SettingsActivity extends ListActivity {

    private List<String> data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_settings);
        initComponents();
    }

    private void initComponents() {
        data = new ArrayList<>(Arrays.asList("Home","Privacy","Sound","Exit"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.layout_settings, R.id.listview_setting_row, data);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
          String value = (String) getListView().getItemAtPosition(position);

//        switch (position) {
//            case 3: {
//                finish();
//
//            }
//        }
    }
}
