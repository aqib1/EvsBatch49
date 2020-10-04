package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ToggleButton;

import com.evs.evsandroid.evsandroid49.services.MusicService;

/**
 * Created by AQIB JAVED on 9/27/2020.
 */

public class MusicPlayerActivity extends Activity {

    private ToggleButton tb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer);
        initComponents();
        settingUpListener();
    }


    private void settingUpListener() {
        final Intent musicIntent = new Intent(MusicPlayerActivity.this, MusicService.class);
        tb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(tb.isChecked()){
                    startService(musicIntent);
                } else {
                    stopService(musicIntent);
                }
            }
        });
    }

    private void initComponents() {
        tb = findViewById(R.id.tb_mediaplayer);
    }
}
