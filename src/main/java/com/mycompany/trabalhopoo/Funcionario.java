/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
public class Funcionario extends Pessoa {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if ("docente".equals(cargo) || "tec".equals(cargo) || "admin".equals(cargo)) {
            this.cargo = cargo;
        }
    }

    public boolean Login(String email, String senha) {
        return (this.getEmail().equals(email) && this.getSenhaString().equals(senha));
    }
}
