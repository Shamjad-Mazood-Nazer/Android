package com.example.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dataBaseConnection extends SQLiteOpenHelper {
    public dataBaseConnection(@Nullable Context context) {
        super(context, "myDatabase.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE crud(roll_no INTEGER PRIMARY KEY, name TEXT, email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE crud");
    }

    public boolean insertUserData(String user_id, String user_name, String user_email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("roll_no", user_id);
        values.put("name", user_name);
        values.put("email", user_email);
        long result = db.insert("crud", null, values);
        if (result == -1) {
            return false;
        }
        else {
            return false;
        }
    }

//    public boolean viewUserDetails()
}