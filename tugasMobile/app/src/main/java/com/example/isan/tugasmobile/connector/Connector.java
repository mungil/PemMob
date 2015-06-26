package com.example.isan.tugasmobile.connector;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by isan on 08/06/15.
 */
public class Connector extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "events";

    // Current version of database
    private static final int DATABASE_VERSION = 1;

    public static String TAG = "tag";

    public Connector(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) { }

    /**
     * This method is called when any modifications in database are done like
     * version is updated or database schema is changed
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }
}
