package com.example.isan.tugasmobile;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.isan.tugasmobile.baseObject.Kegiatan;
import com.example.isan.tugasmobile.baseObject.User;
import com.example.isan.tugasmobile.baseObject.dummyKegiatan;
import com.example.isan.tugasmobile.connector.DatabaseHelper;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    public ArrayAdapter<User> mArrayAdapter;
    public ListView mListView;

    public ArrayList<User> users;
    public ArrayList<Kegiatan> kegiatans;
    User newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper db = new DatabaseHelper(getApplicationContext());

//        //menambahkan data
        newUser = new User();
        newUser.setIdUser(1);
        newUser.setNamaUser("isan");
        newUser.setUsername("isan");
        newUser.setPassword("isan");
        newUser.setEmail("isan@gmail.com");
        db.addUser(newUser);
        newUser.setIdUser(2);
        newUser.setNamaUser("awan");
        newUser.setUsername("awan");
        newUser.setPassword("awan");
        newUser.setEmail("awan@gmail.com");
        db.addUser(newUser);
        newUser.setIdUser(3);
        newUser.setNamaUser("dicky");
        newUser.setUsername("dicky");
        newUser.setPassword("dicky");
        newUser.setEmail("dicky@gmail.com");
        db.addUser(newUser);

        dummyKegiatan dummyData = new dummyKegiatan();
        kegiatans = dummyData.getAllKegiatan();




        //Log.d("Tag count", "Tag count : "+tableUser.getAllUser().size());
        //int tag = db.getUserCount();
//        TextView show = (TextView)findViewById(R.id.showQuery);
//        show.setText(tableUser.CREATE_AKTIVIS_TABLE);
        //Toast.makeText(getApplicationContext(), "jml data : "+tag, Toast.LENGTH_LONG).show();

        users = db.getAllUser();

        mListView = (ListView)findViewById(R.id.myUserView);
        mArrayAdapter = new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1,users);

        //mListView.setAdapter(mArrayAdapter);
        mListView.setAdapter(new customUserAdapter(this, users));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
