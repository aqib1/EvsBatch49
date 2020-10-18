package com.evs.evsandroid.evsandroid49.gameview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.evs.evsandroid.evsandroid49.R;

import java.util.Random;

/**
 * Created by AQIB JAVED on 10/18/2020.
 */

public class GameSurfaceView extends SurfaceView implements Runnable, View.OnTouchListener {
    private SurfaceHolder holder;
    private Thread thread;
    private Random random = new Random();
    private float ballX= 50, ballY= 50;
    private boolean animator;
    public GameSurfaceView(Context context) {
        super(context);
        holder = getHolder();
    }
    public void onStart(){
        thread = new Thread(this);
        thread.start();
    }
    public void onResume() {
        animator = true;
    }
    public void onPause() {
        animator = false;
    }
    public void onStop() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ballX = motionEvent.getX();
        ballY = motionEvent.getY();
        return false;
    }

    @Override
    public void run() {
        while(animator) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!holder.getSurface().isValid()) continue;
            Canvas canvas = holder.lockCanvas();
            int red = random.nextInt(256);
            int blue = random.nextInt(256);
            int green = random.nextInt(256);

            canvas.drawRGB(red, blue, green);
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ball);

            canvas.drawBitmap(bitmap, ballX- (bitmap.getWidth()/2), ballY - (bitmap.getHeight()/2), null);
            holder.unlockCanvasAndPost(canvas);
        }
    }
}
