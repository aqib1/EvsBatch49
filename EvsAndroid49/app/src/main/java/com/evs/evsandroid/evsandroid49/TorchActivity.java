package com.evs.evsandroid.evsandroid49;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by AQIB JAVED on 9/27/2020.
 */

public class TorchActivity extends Activity {

    private static final int RUNTIME_PERMISSION_REQUEST_CODE = 0;
    private ToggleButton btn_torch;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);
        addingRuntimePermissions();
        initComponents();
        settingUpListeners();
    }

    private void settingUpListeners() {
        btn_torch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_torch.isChecked()){
                    //torch on
                    torchOn();
                } else {
                    // torch off
                    torchOff();
                }
            }
        });
    }

//    @RequiresApi(api = Build.VERSION_CODES.M)
    public void torchOn(){
        CameraManager cm =(CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            String cameraId = cm.getCameraIdList()[0];
            cm.setTorchMode(cameraId, true);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }

    public void torchOff() {
        CameraManager cm = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            String cameraId = cm.getCameraIdList()[0];
            cm.setTorchMode(cameraId, false);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private void initComponents() {
        btn_torch = findViewById(R.id.tb_torch);
    }

    private void addingRuntimePermissions() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            // runtime permissions
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, RUNTIME_PERMISSION_REQUEST_CODE);
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case RUNTIME_PERMISSION_REQUEST_CODE :{
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                } else {
                    Toast.makeText(this, "This application can not be used without camera permissions", Toast.LENGTH_LONG).show();
                    finish();
                }

                break;
            }
        }
    }
}
