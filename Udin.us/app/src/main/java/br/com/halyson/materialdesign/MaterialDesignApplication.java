package br.com.halyson.materialdesign;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Toast;

/**
 * Created by Halyson on 20/01/15.
 */
public class MaterialDesignApplication extends Application{
    private static MaterialDesignApplication mMaterialDesignApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mMaterialDesignApplication = this;



    }


    public static MaterialDesignApplication getApplication() {
        return mMaterialDesignApplication;
    }

    public static Context getApplicationCtx() {
        return mMaterialDesignApplication.getApplicationContext();
    }
}
