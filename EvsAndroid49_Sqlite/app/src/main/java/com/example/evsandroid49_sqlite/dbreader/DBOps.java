package com.example.evsandroid49_sqlite.dbreader;

import com.example.evsandroid49_sqlite.models.UserModel;

import java.util.List;

public interface DBOps {

    List<UserModel> getUsersByUserName(String userName);
    long insert(UserModel model);
    void destroy();
}
