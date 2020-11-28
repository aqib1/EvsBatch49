package com.example.evsandroid49_sqlite.contract;

public interface QueryHelper {

    // DDL
    String CREATE_STUDENT_TABLE = "CREATE TABLE "+ FeedReaderContract.FeedEntry.STUDENT_TABLE+ " ("+ FeedReaderContract.FeedEntry._ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+ FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN + " TEXT, "+ FeedReaderContract.FeedEntry.STUDENT_PASSWORD_COLUMN+" TEXT, "+ FeedReaderContract.FeedEntry.STUDENT_EMAIL_COLUMN+" TEXT, "+ FeedReaderContract.FeedEntry.STUDENT_PHONE_COLUMN+ " TEXT)";

    String DELETE_STUDENT_TABLE = "DROP TABLE IF EXISTS "+ FeedReaderContract.FeedEntry.STUDENT_TABLE;


    // DML
}
