package com.evs.evsandroid.evsandroid49.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by AQIB JAVED on 10/4/2020.
 */

public class AuthModel implements Parcelable {

    private String userName;
    private String password;


    public AuthModel() {
        this(null, null);
    }

    public AuthModel(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    protected AuthModel(Parcel in) {
        this.userName = in.readString();
        this.password = in.readString();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(password);
    }


    public static final Creator<AuthModel> CREATOR = new Creator<AuthModel>() {
        @Override
        public AuthModel createFromParcel(Parcel in) {
            return new AuthModel(in);
        }

        @Override
        public AuthModel[] newArray(int size) {
            return new AuthModel[size];
        }
    };
}
