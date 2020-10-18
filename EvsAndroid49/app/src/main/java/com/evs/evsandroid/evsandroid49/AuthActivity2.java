package com.evs.evsandroid.evsandroid49;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import com.evs.evsandroid.evsandroid49.fragments.FManager;
import com.evs.evsandroid.evsandroid49.fragments.SignInFragment;

/**
 * Created by AQIB JAVED on 10/18/2020.
 */

public class AuthActivity2 extends Activity {
    private Button siginpage, registerpage;
    private boolean isSignInPage, isRegisterPage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_2);
        initComponents();
        settingUpListener();
        addingSignInFragment();
    }

    private void settingUpListener() {
        siginpage.setOnClickListener((v) -> {
//            if(isSignInPage)
//                removeSignInFragment();
//            if(isRegisterPage)
//                removeRegisterFragment();
            addingSignInFragment();
        });

        registerpage.setOnClickListener((v) -> {
//            if(isRegisterPage)
//                removeRegisterFragment();
//            if(isSignInPage)
//                removeSignInFragment();
            addRegisterFragment();
        });
    }


    private void initComponents() {
        siginpage = findViewById(R.id.siginpage);
        registerpage = findViewById(R.id.registerpage);
    }

    private void removeSignInFragment(){
        SignInFragment signInFragment = new SignInFragment();
        FManager.getInstance().init(this).remove(signInFragment);
    }
    private void addRegisterFragment() {
        ///
//        setPages(false, true);
    }
    private void removeRegisterFragment() {
        ///
    }
    private void addingSignInFragment() {
        SignInFragment signInFragment = new SignInFragment();
        FManager.getInstance().init(this).replace(signInFragment, R.layout.activity_auth_2);
//        setPages(true, false);
    }

//    public void setPages(Boolean isSignPage, Boolean isRegisterPage){
//        this.isSignInPage = isSignPage;
//        this.isRegisterPage = isRegisterPage;
//    }
}
