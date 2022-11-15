package com.example.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dataBaseConnection extends SQLiteOpenHelper {

    public dataBaseConnection(@Nullable Context context) {
        super(context, "myDatabase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tbl_user (Roll INTEGER PRIMARY KEY, Name TEXT, Email TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE tbl_user");
    }
    public boolean insertUserData(int myno, String Name, String Email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues val = new ContentValues();
        val.put("Roll", myno);
        val.put("Name", Name);
        val.put("Email", Email);
        long result = db.insert("tbl_user", null, val);

        if(result >= 0){
            return true;
        }
        else
            return false;
    }
}
