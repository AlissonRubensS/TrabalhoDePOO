
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
        // VERIFICA SE O E-MAIL E SENHA FORNECIDOS CORRESPONDEM ÀS INFORMAÇÕES DO
        // FUNCIONÁRIO
        return (this.getEmail().equals(email) && this.getSenha().equals(senha));
    }
}
