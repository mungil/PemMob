/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.isan.tugasmobile.baseObject;
/**
 *
 * @author isan
 */
public class Komentar {
    private String idKomentar, idUser, 
                   idKegiatan, isiKomentar;
    
    public Komentar() { }
    
    public Komentar(String idKomentarIn, String idUserIn, String idKegiatanIn, String isiKomentarIn) {
        this.setIdKomentar(idKomentarIn);
        this.setIdUser(idUserIn);
        this.setIdKegiatan(idKegiatanIn);
        this.setIsiKomentar(isiKomentarIn);
    }
    
    public void setIdKomentar(String idKomentarIn) {
        this.idKomentar = idKomentarIn;
    }
    
    public void setIdUser(String idUserIn) {
        this.idUser = idUserIn;
    }
    
    public void setIdKegiatan(String idKegiatanIn) {
        this.idKegiatan = idKegiatanIn;
    }
    
    public void setIsiKomentar(String isiKomentarIn) {
        this.isiKomentar = isiKomentarIn;
    }
    
    public String getIdKomentar() {
        return this.idKomentar;
    }
    
    public String getIdUser() {
        return this.idUser;
    }
    
    public String getIdKegiatan() {
        return this.idKegiatan;
    }
    
    public String getIsiKomentar() {
        return this.isiKomentar;
    }
}
