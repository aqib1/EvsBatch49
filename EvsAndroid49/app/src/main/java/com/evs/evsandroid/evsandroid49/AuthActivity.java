package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

import com.evs.evsandroid.evsandroid49.model.AuthModel;

/**
 * Created by AQIB JAVED on 10/4/2020.
 */

public class AuthActivity extends Activity {

    private LinearLayout signinForm, registerationForm;
    private SlidingDrawer registerationDrawer;
    private EditText userName, password;
    private Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        initComponents();
        settingUpListeners();

    }

    private void settingUpListeners() {
        registerationDrawer.setOnDrawerOpenListener(()->{
            setFormsClickAble(false, true);
        });
        registerationDrawer.setOnDrawerCloseListener(() -> {
            setFormsClickAble(true, false);
        });

    }
    private void setFormsClickAble(boolean signinFormClickable, boolean registerationFormClickable){
        signinForm.setClickable(signinFormClickable);
        registerationForm.setClickable(registerationFormClickable);
    }
    private void initComponents() {
        userName = findViewById(R.id.editText_username);
        password = findViewById(R.id.editText_password);
        submit = findViewById(R.id.submit);
        signinForm = findViewById(R.id.auth_signinactivity_form);
        registerationForm = findViewById(R.id.auth_registerform);
        registerationDrawer = findViewById(R.id.auth_signupdrawer);
        SPManager.getInstance().init(this).setDefaultMessage("Please enter proper key");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String userName = this.userName.getText().toString();
        String password = this.userName.getText().toString();
        SPManager.getInstance().putString(AppConsts.USERNAME_KEY, userName)
                .putString(AppConsts.PASSWORD_KEY,password);
        AuthModel authModel = new AuthModel(userName, password);
        outState.putParcelable(AppConsts.AUTH_MODEL_KEY, authModel);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        AuthModel authModel = savedInstanceState.getParcelable(AppConsts.AUTH_MODEL_KEY);
       String userName = SPManager.getInstance().getString(AppConsts.USERNAME_KEY);
        if(authModel.getUserName()!= null || !authModel.getUserName().isEmpty())
            this.userName.setText(authModel.getUserName());
        if(authModel.getPassword()!= null || !authModel.getPassword().isEmpty())
            this.password.setText(authModel.getPassword());
    }
}
