package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by AQIB JAVED on 9/26/2020.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        settingUpSplash();
    }

    private void settingUpSplash() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
//                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                Intent intent = new Intent("com.evs.evsandroid.evsandroid49.MAINACTIVITY");
                startActivity(intent);
            }
        }); thread.start();

    }
}
