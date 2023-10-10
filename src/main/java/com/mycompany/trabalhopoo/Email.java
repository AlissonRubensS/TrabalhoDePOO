/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
public class Email {
    private String email;
    
    public boolean validarEmail(String email){
        return email.indexOf("@") != -1;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(this.validarEmail(email)){
            this.email = email;
        }
    }

    public Email(String email) {
        this.email = email;
    }

    public Email() {
    }
    
}
