package com.example.isan.tugasmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.isan.tugasmobile.baseObject.User;

import java.util.ArrayList;
/**
 * Created by isan on 01/06/15.
 */
public class customUserAdapter extends BaseAdapter{
    private static ArrayList<User> users;
    private LayoutInflater mInflater;

    public customUserAdapter(Context context, ArrayList<User> userIn) {
        users = userIn;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return users.size();
    }

    public Object getItem(int position) {
        return users.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView==null) {
            convertView = mInflater.inflate(R.layout.custom_user_view, null);
            holder = new ViewHolder();

            holder.txtNama = (TextView)convertView.findViewById(R.id.namaUser);
            holder.txtEmail = (TextView)convertView.findViewById(R.id.emailUser);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.txtNama.setText("Nama : " + users.get(position).getNamaUser());
        holder.txtEmail.setText("Email : " + users.get(position).getEmail());

        return convertView;

    }

    static class ViewHolder
    {
        TextView txtNama;
        TextView txtEmail;
    }
}
