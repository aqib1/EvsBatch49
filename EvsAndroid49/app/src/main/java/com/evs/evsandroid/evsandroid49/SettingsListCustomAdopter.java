package com.evs.evsandroid.evsandroid49;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.evs.evsandroid.evsandroid49.model.SettingEntityModel;

import java.util.List;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class SettingsListCustomAdopter extends BaseAdapter {
    private Context context;
    private List<SettingEntityModel> data;
    public SettingsListCustomAdopter(Context context, List<SettingEntityModel> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View customeView = view;
        if(customeView == null)
            customeView = LayoutInflater.from(context).inflate(R.layout.view_layout_settings2_row, null);
        ImageView img = customeView.findViewById(R.id.imgview_settings_icon);
        img.setImageResource(data.get(i).getImageSrc());
        TextView txt = customeView.findViewById(R.id.txtview_settings_title);
        txt.setText(data.get(i).getValue());
        return customeView;
    }
}
