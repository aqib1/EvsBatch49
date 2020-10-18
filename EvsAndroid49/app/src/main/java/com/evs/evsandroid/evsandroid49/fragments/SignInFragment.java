package com.evs.evsandroid.evsandroid49.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.evs.evsandroid.evsandroid49.R;

/**
 * Created by AQIB JAVED on 10/18/2020.
 */

public class SignInFragment extends Fragment {
    private Button signinBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin_layout, container, false);
        initComponents(view);
        settingUpListener();
        return view;
    }

    private void settingUpListener() {
        signinBtn.setOnClickListener((v) -> {
            
        });
    }

    private void initComponents(View view) {
        signinBtn = view.findViewById(R.id.auth_signin_frag_edittext);
    }
}
