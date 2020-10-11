package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class MessageActivity extends Activity {
    private EditText message, number;
    private Button send;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        initComponents();
        settingUpListener();
    }

    private void settingUpListener() {
        send.setOnClickListener((v) -> {
            SmsManagerUtility.getInstance().init(message.getText().toString(), number.getText().toString()).sendMessage();
        });
    }

    private void initComponents() {
        message = findViewById(R.id.editText_message);
        number = findViewById(R.id.editText_phone);
        send = findViewById(R.id.btn_send);

    }
}
