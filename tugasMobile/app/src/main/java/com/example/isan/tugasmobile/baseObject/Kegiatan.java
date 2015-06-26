package com.example.isan.tugasmobile.baseObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isan
 */
public class Kegiatan implements Serializable {
    private int idKegiatan, idUser,
                htm;
    private String namaKegiatan, jenis,
                   tgl, jam,
                   deskripsi, link, cp,
                   status;
    
    private Date date = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("y-M-d");
    public String today = ft.format(date);
    
    public Kegiatan() {
        
    }
    
    public Kegiatan(int idKegiatanIn, String namaKegiatanIn, int idUserIn, String jenisIn, String tglIn, String jamIn, String deskripsiIn, String cpIn, int htmIn, String linkIn) {
        this.setIdKegiatan(idKegiatanIn);
        this.setNamaKegiatan(namaKegiatanIn);
        this.setIdUser(idUserIn);
        this.setJenis(jenisIn);
        this.setJam(jamIn);
        this.setDeskripsi(deskripsiIn);
        this.setCp(cpIn);
        this.setHtm(htmIn);
        this.setLink(linkIn);
    } 
    
    public void setIdKegiatan(int idKegiatanIn) {
        this.idKegiatan = idKegiatanIn; 
    }
    
    public void setNamaKegiatan(String namaKegiatanIn) { 
        this.namaKegiatan = namaKegiatanIn; 
    }
    
    public void setIdUser(int idUserIn) { 
        this.idUser = idUserIn; 
    }
    
    public void setJenis(String jenisIn) { 
        this.jenis = jenisIn; 
    }
    
    public void setTgl(String tglIn) { 
        this.compare(tglIn); 
        this.tgl = tglIn; 
    }
    
    public void setJam(String jamIn) { 
        this.jam = jamIn; 
    }
    
    public void setDeskripsi(String deskripsiIn) { 
        this.deskripsi = deskripsiIn; 
    }
    
    public void setCp(String cpIn) { 
        this.cp = cpIn; 
    }
    
    public void setHtm(int htmIn) { 
        this.htm = htmIn; 
    }
    
    public void setLink(String linkIn) { 
        this.link = linkIn; 
    }
    
    public int getIdKegiatan() { 
        return this.idKegiatan; 
    }
    
    public String getNamaKegiatan() { 
        return this.namaKegiatan; 
    }
    
    public int getIdUser() { 
        return this.idUser; 
    }
    
    public String getJenis() { 
        return this.jenis; 
    }
    
    public String getTgl() { 
        return this.tgl; 
    }
    
    public String getJam() { 
        return this.jam; 
    }
    
    public String getDeskripsi() { 
        return this.deskripsi; 
    }
    
    public String getCp() { 
        return this.cp; 
    }
    
    public int getHtm() { 
        return this.htm; 
    }
    
    public String getLink() { 
        return this.link; 
    }
    
    public String getStatus() { 
        return this.status; 
    }
    
    @Override
    public String toString() {
       return "idEvent : "+this.idKegiatan+
              "\njudulEvent : "+this.namaKegiatan+
              "\nidUser : "+this.idUser+
              "\njenis : "+this.jenis+
              "\ntgl : "+this.tgl+
              "\njam : "+this.jam+
              "\ndeskripsi : "+this.deskripsi+
              "\ncp : "+this.cp+
              "\nhtm : "+this.htm+
              "\nlink : "+this.link+
              "\nstatus : "+this.status; 
    }
    
    protected void compare(String date) {
        try {
            Date tgl1 = ft.parse(today);
            Date today = ft.parse(date);
            
            if(tgl1.before(today)) {
                this.status = "on";
            }
            else {
                this.status = "off";
            }
        }
        catch(ParseException ex) {
            System.out.println(ex.getMessage()); 
        }
        
    }
}
