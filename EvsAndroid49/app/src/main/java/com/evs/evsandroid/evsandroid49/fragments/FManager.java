package com.evs.evsandroid.evsandroid49.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;

/**
 * Created by AQIB JAVED on 10/18/2020.
 */

public class FManager {
    private static FManager fManager;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private FManager() {

    }


    public FManager init(Activity activity) {
        fragmentManager = activity.getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        return fManager;
    }

    public FManager add(Fragment fragment){
        fragmentTransaction.add(fragment, fragment.getClass().getName());
        fragmentTransaction.commit();
        return fManager;
    }
    public FManager remove(Fragment fragment) {
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
        return fManager;
    }

    public FManager replace(Fragment fragment, int layout) {
        fragmentTransaction.replace(layout, fragment);
        fragmentTransaction.commit();

        return fManager;
    }

    public static FManager getInstance(){
        if(fManager == null){
            synchronized (FManager.class) {
                if(fManager == null)
                fManager = new FManager();
            }
        }
        return fManager;
    }
}
