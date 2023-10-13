
package com.mycompany.trabalhopoo;

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
