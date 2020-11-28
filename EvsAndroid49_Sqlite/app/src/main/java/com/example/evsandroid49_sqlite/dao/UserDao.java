package com.example.evsandroid49_sqlite.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.evsandroid49_sqlite.entities.User;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM USER_TABLE")
    List<User> getAll();

    @Query("SELECT * FROM USER_TABLE WHERE USER_NAME IN (:userNames)")
    List<User> getAllByUserNames(List<String> userNames);

    @Query("SELECT * FROM USER_TABLE WHERE USER_NAME=:userId AND USER_PASSWORD=:password")
    User getUserByUserIdAndPassword(String userId, String password);

    @Insert
    void insert(User ...users);

    @Delete
    void delete(User user);
}
