/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
public class Pessoa {
    private int id;
    private String nome;
    private CPF cpf;
    private Data data_nasc;
    private Email email;
    private String senha;

    public Pessoa(){
        super();
    }
    
    public Pessoa(String nome, CPF cpf, Data data_nasc, Email email, String senha){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNasc(data_nasc);;
        this.setEmail(email);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return data_nasc;
    }

    public void setDataNasc(Data data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getPassword() {
        return senha;
    }

    public void setPassword(String senha) {
        this.senha = senha;
    }
    
    
}
