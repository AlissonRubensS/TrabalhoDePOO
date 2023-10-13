
package com.mycompany.trabalhopoo.Model;

public class Pessoa {
    private int id;
    private String nome;
    private CPF cpf;
    private Email email;
    private String senha;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String cpf, Email email, String senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSenha(senha);
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
        if (nome != null) {
            this.nome = nome;
        }
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = new CPF(cpf);
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        if(email.validarEmail(email.getEmail())){ 
            this.email = email;
        }
    }

    public String getSenhaString() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
