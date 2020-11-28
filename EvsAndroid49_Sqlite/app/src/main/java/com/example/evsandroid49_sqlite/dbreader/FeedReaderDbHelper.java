package com.example.evsandroid49_sqlite.dbreader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.evsandroid49_sqlite.contract.FeedReaderContract;
import com.example.evsandroid49_sqlite.contract.QueryHelper;

public class FeedReaderDbHelper extends SQLiteOpenHelper {
    public FeedReaderDbHelper(Context context) {
        super(context, FeedReaderContract.DBEntry.USER_DATABASE_NAME, null,FeedReaderContract.DBEntry.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(QueryHelper.CREATE_STUDENT_TABLE);
        //
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //
        db.execSQL(QueryHelper.DELETE_STUDENT_TABLE);
        onCreate(db);
    }
}
