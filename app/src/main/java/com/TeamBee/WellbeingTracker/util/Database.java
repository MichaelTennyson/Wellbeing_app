package com.TeamBee.WellbeingTracker.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.TeamBee.WellbeingTracker.R;

public class Database extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_NAME = "App_Collection.db";
    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "WellbeingDB";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_SMILEY = "SMILEY";
    private static final String COLUMN_FRUIT = "FRUIT";
    private static final String COLUMN_VEG = "VEG";
    private static final String COLUMN_EXERCISE = "EXERCISE";
    private static final String COLUMN_ADD = "ADD";
    private static final String COLUMN_REMOVE = "REMOVE";




    public Database(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    // TODO Integer or String for smiley?
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =          "CREATE TABLE " +  TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_SMILEY + " INTEGER, " +
                COLUMN_FRUIT + " BOOLEAN, " +
                COLUMN_VEG + " BOOLEAN, " +
                COLUMN_EXERCISE + " BOOLEAN);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void addItem(int smiley, Boolean veg, Boolean fruit, Boolean exercise){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_SMILEY, smiley);
        cv.put(COLUMN_VEG, veg);
        cv.put(COLUMN_FRUIT, fruit);
        cv.put(COLUMN_EXERCISE, exercise);
        long result = db.insert(TABLE_NAME, null, cv);

        if(result == -1){
            Toast.makeText(context, R.string.InsertFail, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, R.string.InsertSucceed, Toast.LENGTH_SHORT).show();
        }
    }

    public void updateItem(String row_id, int smiley, Boolean veg, Boolean fruit, Boolean exercise){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_SMILEY, smiley);
        cv.put(COLUMN_VEG, veg);
        cv.put(COLUMN_FRUIT, fruit);
        cv.put(COLUMN_EXERCISE, exercise);

        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{row_id});

        if(result == -1){
            Toast.makeText(context, R.string.UpdateFail, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(context, R.string.UpdateComplete, Toast.LENGTH_LONG).show();
        }
    }

    public void deleteItem(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "_id=?", new String[]{row_id});

        if(result == -1){
            Toast.makeText(context, R.string.FailDelete, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(context, R.string.CompleteDelete, Toast.LENGTH_LONG).show();
        }
    }

    Cursor readAllData(){
        String query = "Select * from " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}