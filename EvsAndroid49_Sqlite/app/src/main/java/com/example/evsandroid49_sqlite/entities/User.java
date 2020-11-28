package com.example.evsandroid49_sqlite.entities;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "USER_TABLE")
public class User {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "USER_ID")
    private int id; // (universal unique identifier)

    @ColumnInfo(name = "USER_NAME")
    private String name;

    @ColumnInfo(name = "USER_PASSWORD")
    private String password;

    @ColumnInfo(name = "USER_EMAIL")
    private String email;

    @ColumnInfo(name = "USER_CNIC")
    private String cnic;

    @ColumnInfo(name = "USER_NUMBER")
    private String number;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
