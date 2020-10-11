package com.evs.evsandroid.evsandroid49;

import android.telephony.SmsManager;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class SmsManagerUtility {
    private String message;
    private String number;
    private SmsManager smsManager;
    private static SmsManagerUtility smsManagerUtility;

    public SmsManagerUtility init(String message, String number){
        this.message = message;
        this.number = number;
        return smsManagerUtility;
    }

    public SmsManagerUtility sendMessage() {

        this.smsManager.sendTextMessage(number, null, message, null, null);

        return smsManagerUtility;
    }

    private SmsManagerUtility(){

    }

    public static SmsManagerUtility getInstance(){
        if(smsManagerUtility == null)
            synchronized (SmsManagerUtility.class) {
                if(smsManagerUtility == null) {
                    smsManagerUtility = new SmsManagerUtility();
                    smsManagerUtility.smsManager = SmsManager.getDefault();
                }
            }
        return smsManagerUtility;
    }
}
