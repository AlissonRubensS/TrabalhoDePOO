
package com.mycompany.Model;

public class Email {
    private String email; // PROPRIEDADE QUE ARMAZENA O ENDEREÇO DE E-MAIL

    public boolean equals(Email email){
        if (this.getEmail().equals(email.getEmail())) {
            return true;
        }
        return false;
    }

    public String toString(){
        return this.email;
    }

    // MÉTODO PARA VALIDAR UM ENDERRÇO DE E-MAIL
    public boolean validarEmail(String email) {
        // Verifica se o e-mail contém o caractere "@"
        return email.indexOf("@") != -1;
    }

    // GETTER PARA OBTER O ENDEREÇO DE E-MAIL ATUAL
    public String getEmail() {
        return email;
    }

    // SETTER PARA DEFINIR O ENDEREÇO DE E-MAIL, VALIDANDO-O
    public void setEmail(String email) {
        if (this.validarEmail(email)) {
            this.email = email;
        }
    }

    // CONSTRUTOR QUE ACEITA UM ENDEREÇO DE E-MAIL COMO ARGUMENTO
    public Email(String email) {
        this.setEmail(email);
    }

    // CONSTRUTOR PADRÃO VAZIO
    public Email() {
    }
}
