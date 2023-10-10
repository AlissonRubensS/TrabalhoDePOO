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
    private String name;
    private CPF cpf;
    private Data birth_date;
    private Email email;
    private String password;

    public Pessoa(){
        super();
    }
    
    public Pessoa(String name, CPF cpf, Data birth_date, Email email, String password){
        this.setName(name);
        this.setCpf(cpf);
        this.setBirth_date(birth_date);
        this.setEmail(email);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Data getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Data birth_date) {
        this.birth_date = birth_date;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
