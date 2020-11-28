package com.example.evsandroid49_sqlite.dbreader;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.evsandroid49_sqlite.contract.FeedReaderContract;
import com.example.evsandroid49_sqlite.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class DBManager implements DBOps{
    private static DBManager dbManager = null;
    private FeedReaderDbHelper dbHelper = null;

    private DBManager (){

    }

    public DBManager init (Context context){
        dbHelper = new FeedReaderDbHelper(context);
        return dbManager;
    }


    @Override
    public List<UserModel> getUsersByUserName(String userName) {
        List<UserModel> data = null;
        try(SQLiteDatabase db = dbHelper.getReadableDatabase()) {
            // projection
            String projection[] = {
                    FeedReaderContract.FeedEntry._ID,
                    FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN,
                    FeedReaderContract.FeedEntry.STUDENT_PASSWORD_COLUMN,
                    FeedReaderContract.FeedEntry.STUDENT_EMAIL_COLUMN,
                    FeedReaderContract.FeedEntry.STUDENT_PHONE_COLUMN
            };

            String selection = FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN + " = ?";
            String selectionArgs[] = {userName};

            String sortOrder = FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN + " DESC";

           Cursor cursor =  db.query(FeedReaderContract.FeedEntry.STUDENT_TABLE, projection,selection,selectionArgs,null,null,sortOrder);
           data = new ArrayList<>();
           while (cursor.moveToNext()) {
               UserModel userModel = new UserModel();
               userModel.setId(cursor.getInt(cursor.getColumnIndex(FeedReaderContract.FeedEntry._ID)));
               userModel.setUserName(cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN)));
               userModel.setPassword(cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.STUDENT_PASSWORD_COLUMN)));
               userModel.setEmail(cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.STUDENT_EMAIL_COLUMN)));
               userModel.setContactNumber(cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.STUDENT_PHONE_COLUMN)));
               data.add(userModel);
           }
           cursor.close();
        }
        return data;
    }

    @Override
    public long insert(UserModel model) {
        long ID = 0L;
        try(SQLiteDatabase db = dbHelper.getWritableDatabase()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(FeedReaderContract.FeedEntry.STUDENT_NAME_COLUMN, model.getUserName());
            contentValues.put(FeedReaderContract.FeedEntry.STUDENT_PASSWORD_COLUMN, model.getPassword());
            contentValues.put(FeedReaderContract.FeedEntry.STUDENT_EMAIL_COLUMN, model.getEmail());
            contentValues.put(FeedReaderContract.FeedEntry.STUDENT_PHONE_COLUMN, model.getContactNumber());
            ID = db.insert(FeedReaderContract.FeedEntry.STUDENT_TABLE, null, contentValues);
        }
        return ID;
    }


    @Override
    public void destroy() {
        dbHelper.close();
    }
    public static DBManager getInstance() {
        if(dbManager == null) {
            synchronized (DBManager.class) {
                if(dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
}
