package com.mycompany.trabalhopoo.Model;

public class Administrador {
    private String nome;
    private String cpf;

    public Administrador() {
        // CONSTRUTOR
    }

    // MÉTODO GETTER PARA OBTER O NOME DO ADMINISTRADOR
    public String getNome() {
        return nome;
    }

    // MÉTODO SETTER PARA DEFINIR O NOME DO ADMINISTRADOR
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÉTODO GETTER PARA OBTER O CPF DO ADMINISTRADOR
    public String getCpf() {
        return cpf;
    }

    // MÉTODO SETTER PARA DEFINIR O CPF DO ADMINISTRADOR
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // MÉTODO PARA CADASTRAR UM FUNCIONÁRIO
    public boolean cadastrarFuncionario(Funcionario funcionario) {

        return true;
    }

    // MÉTODO PARA ALTERAR UM FUNCIONÁRIO COM BASE NO ID
    public void alterarFuncionario(int id) {

    }

    // MÉTODO PARA REMOVER UM FUNCIONÁRIO COM BASE NO ID
    public Funcionario removerFuncionario(int id) {

        return null;
    }

    // MÉTODO PARA VALIDAR UMA REQUISIÇÃO
    public void validarRequisicao() {

    }
}
