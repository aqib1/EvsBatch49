package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.evs.evsandroid.evsandroid49.services.DataHelper;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class SettingsActivity2 extends Activity {
    private SettingsListCustomAdopter adopter;
    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);
        initComponents();
        settingUpListeners();
    }

    private void settingUpListeners() {
        listView.setOnItemClickListener((adaptor, view, position, id) -> {
            String val = DataHelper.getSettingsListData().get(position).getValue();
            switch (val) {
                case "Messages": {


                    break;
                }
                case "Exit" : {
                    finish();
                }
            }
        });
    }

    private void initComponents() {
        listView = findViewById(R.id.listview_setting2);
        adopter = new SettingsListCustomAdopter(getApplicationContext(), DataHelper.getSettingsListData());
        listView.setAdapter(adopter);
    }
}
