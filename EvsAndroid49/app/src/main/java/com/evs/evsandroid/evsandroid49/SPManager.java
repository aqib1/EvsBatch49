package com.evs.evsandroid.evsandroid49;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by AQIB JAVED on 10/4/2020.
 */

public class SPManager {
    private static SPManager spManager = null;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private String message;
    private static final String DEFAULT_MESSAGE = "KEY NOT FOUND";
    private SPManager (){

    }

    public SPManager init(Context context){
        this.sp = context.getSharedPreferences(AppConsts.AUTH_APP_SP, Context.MODE_PRIVATE);
        this.editor = sp.edit();
        return this;
    }

    public SPManager setDefaultMessage(String message) {
        this.message = message;
        return this;
    }
    public SPManager putString(String key, String value){
        this.editor.putString(key, value);
        this.editor.commit();
        return this;
    }

    public String getString(String key) {
        return this.sp.getString(key, (message == null  || message.isEmpty()) ? DEFAULT_MESSAGE : message);
    }

    public static SPManager getInstance(){
        if(spManager == null)
            synchronized (SPManager.class) {
                if(spManager == null)
                spManager = new SPManager();
            }

        return spManager;
    }
}
