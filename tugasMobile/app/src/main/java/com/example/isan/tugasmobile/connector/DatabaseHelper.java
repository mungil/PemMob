package com.example.isan.tugasmobile.connector;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.isan.tugasmobile.baseObject.Kegiatan;
import com.example.isan.tugasmobile.baseObject.User;

import java.util.ArrayList;

/**
 * Created by isan on 01/06/15.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "event";

    //table name
    private static final String TABLE_USER = "user";
    private static final String TABLE_KEGIATAN = "kegiatan";


    // kolom tabel user
    public static final String KEY_ID_USER = "idUser";
    public static final String KEY_NAMA_USER = "namaUser";
    public static final String KEY_USERNAME_USER = "username";
    public static final String KEY_PASSWORD_USER = "password";
    public static final String KEY_EMAIL_USER = "email";


    public String CREATE_AKTIVIS_TABLE = "CREATE TABLE " + TABLE_USER + " ("
            + KEY_ID_USER + " INTEGER PRIMARY KEY, " + KEY_NAMA_USER + " TEXT, "
            + KEY_USERNAME_USER + " TEXT, " + KEY_PASSWORD_USER + " TEXT, "
            + KEY_EMAIL_USER + " TEXT" + ");";

    // kolom tabel kegiatan
    public static final String KEY_ID_KEGIATAN = "idKegiatan";
    public static final String KEY_NAMA_KEGIATAN = "namaKegiatan";
    public static final String KEY_ID_USER_KEGIATAN = "idUser";
    public static final String KEY_TGL_KEGIATAN = "tgl";
    public static final String KEY_JAM_KEGIATAN = "jam";
    public static final String KEY_DESKRIPSI_KEGIATAN = "deskripsi";
    public static final String KEY_CP_KEGIATAN = "cp";
    public static final String KEY_HTM_KEGIATAN = "htm";
    public static final String KEY_LINK_KEGIATAN = "link";
    public static final String KEY_STATUS_KEGIATAN = "status";

    public String CREATE_KEGIATAN_TABLE = "CREATE TABLE " + TABLE_KEGIATAN + " ("
            + KEY_ID_KEGIATAN + " INTEGER PRIMARY KEY, " + KEY_NAMA_KEGIATAN + " TEXT, "
            + KEY_ID_USER_KEGIATAN + " INTEGER, " + KEY_TGL_KEGIATAN + " TEXT, "
            + KEY_JAM_KEGIATAN + " TEXT, " + KEY_DESKRIPSI_KEGIATAN + " TEXT, "
            + KEY_CP_KEGIATAN + " TEXT, " + KEY_HTM_KEGIATAN + " INTEGER, "
            + KEY_LINK_KEGIATAN + " TEXT, "
            + KEY_STATUS_KEGIATAN + " TEXT" + ");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_AKTIVIS_TABLE);
        db.execSQL(CREATE_KEGIATAN_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KEGIATAN);

        // Create tables again
        onCreate(db);
    }



    public int getUserCount() {
        int count = 0;
        String countQuery = "SELECT  * FROM " + TABLE_USER;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        if(cursor!=null && !cursor.isClosed()) {
            count = cursor.getCount();
            cursor.close();
        }
        return count;
    }

    public void addUser(User newUser) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ID_USER, newUser.getIdUser());
        values.put(KEY_NAMA_USER, newUser.getNamaUser());
        values.put(KEY_USERNAME_USER, newUser.getUsername());
        values.put(KEY_PASSWORD_USER, newUser.getPassword());
        values.put(KEY_EMAIL_USER, newUser.getEmail());

        //inserting row
        db.insert(TABLE_USER, null, values);
        db.close();
    }

    //mengambil 1 data user
    public User getUser(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_USER, new String[]{KEY_ID_USER,
                        KEY_NAMA_USER, KEY_USERNAME_USER,
                        KEY_PASSWORD_USER, KEY_EMAIL_USER}, KEY_ID_USER + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        User user = new User();
        user.setIdUser(Integer.parseInt(cursor.getString(0)));
        user.setNamaUser(cursor.getString(1));
        user.setUsername(cursor.getString(2));
        user.setPassword(cursor.getString(3));
        user.setEmail(cursor.getString(4));

        return user;
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<User>();
        String selectQuery = "SELECT  * FROM " + TABLE_USER;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                User user = new User();
                user.setIdUser(Integer.parseInt(cursor.getString(0)));
                user.setNamaUser(cursor.getString(1));
                user.setUsername(cursor.getString(2));
                user.setPassword(cursor.getString(3));
                user.setEmail(cursor.getString(4));
                users.add(user);
            } while (cursor.moveToNext());
        }

        return users;
    }

    // Deleting single contact
    public void deleteContact(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_USER, KEY_ID_USER + " = ?",
                new String[] { String.valueOf(user.getIdUser()) });
        db.close();
    }

    // Updating single contact
    public int updateContact(User user) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAMA_USER, user.getNamaUser());
        values.put(KEY_USERNAME_USER, user.getUsername());
        values.put(KEY_PASSWORD_USER, user.getPassword());
        values.put(KEY_EMAIL_USER, user.getEmail());

        // updating row
        return db.update(TABLE_USER, values, KEY_ID_USER + " = ?",
                new String[] { String.valueOf(user.getIdUser()) });
    }

    public ArrayList<Kegiatan> getAllKegiatan() {
        ArrayList<Kegiatan> kegiatan = new ArrayList<Kegiatan>();
        String selectQuery = "SELECT  * FROM " + TABLE_KEGIATAN;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Kegiatan kegiatanObject = new Kegiatan();
                kegiatanObject.setIdKegiatan(Integer.parseInt(cursor.getString(0)));
                kegiatanObject.setNamaKegiatan(cursor.getString(1));
                kegiatanObject.setIdUser(Integer.parseInt(cursor.getString(2)));
                kegiatanObject.setTgl(cursor.getString(3));
                kegiatanObject.setJam(cursor.getString(4));
                kegiatanObject.setDeskripsi(cursor.getString(5));
                kegiatanObject.setCp(cursor.getString(6));
                kegiatanObject.setHtm(Integer.parseInt(cursor.getString(7)));
                kegiatanObject.setLink(cursor.getString(8));
                kegiatan.add(kegiatanObject);
            } while (cursor.moveToNext());
        }

        return kegiatan;
    }
}
