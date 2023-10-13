
package com.mycompany.trabalhopoo.Model;

public class Funcionario extends Pessoa {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if ("Docente".equals(cargo) || "TecAdm".equals(cargo) || "Administrador".equals(cargo)) {
            this.cargo = cargo;
        }
    }

    public boolean Login(String email, String senha) {
        return (this.getEmail().equals(email) && this.getSenhaString().equals(senha));
    }
}
