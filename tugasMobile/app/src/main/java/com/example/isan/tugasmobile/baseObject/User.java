package com.example.isan.tugasmobile.baseObject;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isan
 */
public class User implements Serializable {
    private int idUser;
    private String namaUser, username, password, email;
    
    public User() { }
    
    public User(int idUserIn, String namaUserIn, String usernameIn, String passwordIn, String emailIn) {
        this.setIdUser(idUserIn);
        this.setNamaUser(namaUserIn);
        this.setUsername(usernameIn);
        this.setPassword(passwordIn);
        this.setEmail(emailIn);
    }
    
    public void setIdUser(int idUserIn) {
        this.idUser = idUserIn;
    }
    
    public void setNamaUser(String namaUserIn) {
        this.namaUser = namaUserIn;
    }
    
    public void setUsername(String usernameIn) {
        this.username = usernameIn;
    }
    
    public void setPassword(String passwordIn) {
        this.password = passwordIn;
    }
    
    public void setEmail(String emailIn) {
        this.email = emailIn;
    }

    public int getIdUser() { return this.idUser; }

    public String getNamaUser() { return this.namaUser; }

    public String getUsername() { return this.username; }

    public String getPassword() { return this.password; }

    public String getEmail() { return this.email; }
    
    @Override
    public String toString() {
        return "idUser : "+this.idUser+
                "\nnamaUser : "+this.namaUser+
                "\nusername : "+this.username+
                "\npassword : "+this.password+
                "\nemail : "+this.email;
    }
    
}
