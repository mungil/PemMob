package com.example.isan.tugasmobile.baseObject;

import java.util.ArrayList;

/**
 * Created by isan on 26/06/15.
 */
public class dummyKegiatan {
    ArrayList<Kegiatan> kegiatan = new ArrayList<Kegiatan>();
    Kegiatan kegiatanObject = new Kegiatan();

    public dummyKegiatan() {
        kegiatanObject.setIdKegiatan(1);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-01");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(2);
        kegiatanObject.setNamaKegiatan("ngobar");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-02");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("ngoprek bareng");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(0);
        kegiatanObject.setLink("doscom.org/ngobar");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(3);
        kegiatanObject.setNamaKegiatan("war");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-03");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("war DOTA");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(5000);
        kegiatanObject.setLink("doscom.org/warDota");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(4);
        kegiatanObject.setNamaKegiatan("release party");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-04");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("release party tea linux");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(20000);
        kegiatanObject.setLink("doscom.org/releaseParty");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(5);
        kegiatanObject.setNamaKegiatan("nobar");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-05");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("nonton bareng");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(1000);
        kegiatanObject.setLink("doscom.org/nobar");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(6);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-06");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(7);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-07");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(8);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-08");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(9);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-09");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);

        kegiatanObject.setIdKegiatan(10);
        kegiatanObject.setNamaKegiatan("bootcamp");
        kegiatanObject.setIdUser(1);
        kegiatanObject.setTgl("2015-10-10");
        kegiatanObject.setJam("08:00");
        kegiatanObject.setDeskripsi("bootcamp esssential");
        kegiatanObject.setCp("12345");
        kegiatanObject.setHtm(25000);
        kegiatanObject.setLink("doscom.org/bootcamp");
        kegiatan.add(kegiatanObject);
    }

    public ArrayList<Kegiatan> getAllKegiatan() {
        return this.kegiatan;
    }
}
