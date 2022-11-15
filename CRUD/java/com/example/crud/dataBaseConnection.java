package com.example.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dataBaseConnection extends SQLiteOpenHelper {
    public dataBaseConnection(@Nullable Context context) {
        super(context, "myDatabase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE crud(roll_no INTEGER PRIMARY KEY, name TEXT, email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE crud");
    }

    public boolean updateUserData(String user_id, String user_name, String user_email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", user_name);
        values.put("email", user_email);
        Cursor cursor = db.rawQuery("SELECT * FROM CRUD WHERE id=?", new String[]{user_id});
        if(cursor.getCount() >0) {
            long result = db.update("crud", values, "id=?", new String[]{user_id});
            if(result == -1) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public Boolean deleteUserData(String id){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("SELECT * from crud where id=?", new String[]{id});
        if(cursor.getCount()>0) {
            long result = DB.delete("crud", "id=?", new String[]{id});
            if (result == -1)
                return false;
            else
                return true;
        }
        else
            return false;
    }
}
