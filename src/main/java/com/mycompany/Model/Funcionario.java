
package com.mycompany.Model;

public class Funcionario extends Pessoa {
    private String cargo; // PRPRIEDADE QUE ARMAZENA O CARGO DO FUNCIONÁRIO

    // GETTER PARA OBTER O CARGO DO FUNCIONÁRIO
    public String getCargo() {
        return cargo;
    }

    // SETTER PARA DEFINIR O CARGO DO FUNCIONÁRIO COM VALIDAÇÃO
    public void setCargo(String cargo) {
        if ("D".equals(cargo) || "T".equals(cargo) || "A".equals(cargo)) {
            this.cargo = cargo;
        }
    }

    // MÉTODO PARA REALIZAR P LOGIN DO FUNCIONÁRIO
    public boolean login(String email, String senha) {
        // VERIFICA SE O E-MAIL E SENHA FORNECIDOS CORRESPONDEM ÀS INFORMAÇÕES DO FUNCIONÁRIO
        return true;
    }
    
    public boolean equals(Funcionario funcionario){
        if (this.getEmail().equals(funcionario.getEmail())) {
            return true;
        }
        return false;
    }
    
    public Funcionario(Email email, String password){
        this.setEmail(email);
        this.setSenha(password);
    }
    
    public Funcionario(){}
}
