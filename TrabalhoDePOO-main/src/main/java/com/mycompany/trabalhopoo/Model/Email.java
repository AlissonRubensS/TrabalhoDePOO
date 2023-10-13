
package com.mycompany.trabalhopoo.Model;

public class Email {
    private String email;
    
    public boolean validarEmail(String email){
        String charespecias  = "!\"#$%&'()*+,-./:;<=>?[\\]^_`{|}~";
        
        // verifica se o @ está presente no email e depois procura por caracteres especiais
        if(email.indexOf("@") != -1)
        {
            for(char T:charespecias.toCharArray()){
                if(email.indexOf(T) ==  -1){
                    // caso encontre um caractere especial retorna false
                    return false;
                }
            }
            // caso não encontre e o email tenha um @ retorna true
            return true;
        }
        //caso n encontre o @ retorna false
        return false;
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
