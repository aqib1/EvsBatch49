package com.example.evsandroid49_sqlite.dbreader;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.evsandroid49_sqlite.dao.UserDao;
import com.example.evsandroid49_sqlite.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
