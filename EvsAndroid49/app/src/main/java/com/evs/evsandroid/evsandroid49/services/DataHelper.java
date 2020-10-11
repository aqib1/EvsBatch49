package com.evs.evsandroid.evsandroid49.services;

import com.evs.evsandroid.evsandroid49.R;
import com.evs.evsandroid.evsandroid49.model.SettingEntityModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class DataHelper {
    private DataHelper(){

    }
    public static List<SettingEntityModel> getSettingsListData() {
        return new ArrayList<>(Arrays.asList(
                new SettingEntityModel(R.drawable.home, "Home"),
                new SettingEntityModel(R.drawable.settings, "Settings"),
                new SettingEntityModel(R.drawable.messges, "Messages"),
                new SettingEntityModel(R.drawable.exit, "Exit")
        ));
    }

}
