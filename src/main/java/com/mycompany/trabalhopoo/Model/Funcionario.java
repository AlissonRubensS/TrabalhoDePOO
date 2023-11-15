
package com.mycompany.trabalhopoo.Model;

public class Funcionario extends Pessoa {
    private String cargo; // PRPRIEDADE QUE ARMAZENA O CARGO DO FUNCIONÁRIO

    // GETTER PARA OBTER O CARGO DO FUNCIONÁRIO
    public String getCargo() {
        return cargo;
    }

    // SETTER PARA DEFINIR O CARGO DO FUNCIONÁRIO COM VALIDAÇÃO
    public void setCargo(String cargo) {
        if ("Docente".equals(cargo) || "TecAdm".equals(cargo) || "Administrador".equals(cargo)) {
            this.cargo = cargo;
        }
    }

    // MÉTODO PARA REALIZAR P LOGIN DO FUNCIONÁRIO
    public boolean login(String email, String senha) {
        // VERIFICA SE O E-MAIL E SENHA FORNECIDOS CORRESPONDEM ÀS INFORMAÇÕES DO FUNCIONÁRIO
        return (this.equals(email, senha));
    }
    
    public boolean equals(String a, String b){
        boolean isEquals = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    isEquals = false;
                    break;
                }
            }
        }
        return isEquals;
    }
    
    public Funcionario(){}
    
    public Funcionario(Email email, String password){
        this.setEmail(email);
        this.setSenha(password);
    }
}
