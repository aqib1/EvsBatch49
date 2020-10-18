package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.evs.evsandroid.evsandroid49.gameview.GameSurfaceView;

/**
 * Created by AQIB JAVED on 10/18/2020.
 */

public class GameActivity extends Activity {

    private GameSurfaceView gameSurfaceView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameSurfaceView = new GameSurfaceView(getApplicationContext());
        setContentView(gameSurfaceView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        gameSurfaceView.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameSurfaceView.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        gameSurfaceView.onStop();
    }
}
