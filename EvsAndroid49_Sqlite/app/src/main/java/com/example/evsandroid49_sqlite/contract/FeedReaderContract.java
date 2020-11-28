package com.example.evsandroid49_sqlite.contract;

import android.provider.BaseColumns;

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {

    }

    public static class DBEntry {
        public static final int DATABASE_VERSION = 1;
        public static final String USER_DATABASE_NAME = "USER.DB";
    }
    public static class FeedEntry implements BaseColumns {
        public static final String STUDENT_TABLE = "STUDENTS";
        public static final String STUDENT_NAME_COLUMN = "NAME";
        public static final String STUDENT_PASSWORD_COLUMN = "PASSWORD";
        public static final String STUDENT_EMAIL_COLUMN = "EMAIL";
        public static final String STUDENT_PHONE_COLUMN = "PHONE";


        //

    }
}
