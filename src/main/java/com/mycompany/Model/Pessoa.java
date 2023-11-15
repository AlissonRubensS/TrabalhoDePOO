
package com.mycompany.Model;

public class Pessoa {
    private int id;
    private String nome;
    private CPF cpf;
    private Email email;
    private String senha;

    // CONSTRUTOR PADRÃO VAZIO
    public Pessoa() {
    }

    // CONSTRUTOR QUE ACEITA ARGUMENTOS PARA INICIALIZAR AS PROPRIEDADES
    public Pessoa(String nome, CPF cpf, Email email, String senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSenha(senha);
    }

    // GETTER PARA OBTER O ID
    public int getId() {
        return id;
    }

    // SETTER PARA DEFINIR O ID
    public void setId(int id) {
        this.id = id;
    }

    // GETTER PARA OBTER O NOME
    public String getNome() {
        return nome;
    }

    // SETTER PARA DEFINIR O NOME
    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    // GETTER PARA OBTER O CPF
    public CPF getCpf() {
        return cpf;
    }

    // SETTER PARA DEFINIR O CPF
    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    // GETTER PARA OBTER O EMAIL
    public Email getEmail() {
        return email;
    }

    // SETTER PARA DEFINIR O EMAIL
    public void setEmail(Email email) {
        this.email = email;
    }

    // GETTER PARA OBTER A SENHA
    public String getSenha() {
        return senha;
    }

    // SETTER PARA DEFINIR A SENHA
    public void setSenha(String senha) {
        if(senha != null){
            this.senha = senha;
        }
    }
}
