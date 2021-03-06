package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends Activity {

    private EditText user_name;
    private Button ok_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        settingUpListener();
    }

    private void settingUpListener() {
        ok_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String userName = user_name.getText().toString();
                if(userName.isEmpty()){
                    throw new IllegalArgumentException("Please enter user name");
                }
                /***/

                //Toast.makeText(MainActivity.this, "Hi there", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initComponents() {
        ok_btn =  findViewById(R.id.btn_ok);
        user_name = findViewById(R.id.edittext_name);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


//    public void okClick(View v){
//        Toast.makeText(this, "Hi there", Toast.LENGTH_LONG).show();
//    }

}
