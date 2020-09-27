package com.evs.evsandroid.evsandroid49.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import com.evs.evsandroid.evsandroid49.R;

/**
 * Created by AQIB JAVED on 9/27/2020.
 */

public class MusicService extends Service {
    private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startMediaPlayer();
        return START_STICKY;
    }

    private void startMediaPlayer() {
        player = MediaPlayer.create(this, R.raw.iphone_6_original);
        player.start();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        closeMediaPlayer();
    }

    private void closeMediaPlayer() {
        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
