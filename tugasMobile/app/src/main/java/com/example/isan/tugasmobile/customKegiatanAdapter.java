package com.example.isan.tugasmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.isan.tugasmobile.baseObject.Kegiatan;
import com.example.isan.tugasmobile.baseObject.User;

import java.util.ArrayList;

/**
 * Created by isan on 26/06/15.
 */
public class customKegiatanAdapter extends BaseAdapter {
    private static ArrayList<Kegiatan> kegiatans;
    private LayoutInflater mInflater;

    public customKegiatanAdapter(Context context, ArrayList<Kegiatan> userIn) {
        kegiatans = userIn;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return kegiatans.size();
    }

    public Object getItem(int position) {
        return kegiatans.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView==null) {
            convertView = mInflater.inflate(R.layout.custom_kegiatan_view, null);
            holder = new ViewHolder();

            holder.txtNama = (TextView)convertView.findViewById(R.id.namaKegiatan);
            holder.txtTgl = (TextView)convertView.findViewById(R.id.tglKegiatan);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.txtNama.setText("Nama Kegiatan : " + kegiatans.get(position).getNamaKegiatan());
        holder.txtTgl.setText("Tgl : " + kegiatans.get(position).getTgl());

        return convertView;

    }

    static class ViewHolder
    {
        TextView txtNama;
        TextView txtTgl;
    }
}
