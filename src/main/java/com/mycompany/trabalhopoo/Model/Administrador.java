package com.mycompany.trabalhopoo.Model;

public class Administrador extends Funcionario{

    public Administrador() {
        // CONSTRUTOR
    }

    // MÉTODO PARA CADASTRAR UM FUNCIONÁRIO
    public boolean cadastrarFuncionario(Funcionario funcionario) {
        funcionario = new Funcionario();
        return true;
    }

    // MÉTODO PARA ALTERAR UM FUNCIONÁRIO COM BASE NO ID
    public void alterarFuncionario(String nome, CPF cpf, Email email, String senha, String cargo) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSenha(senha);
        this.setCargo(cargo);
    }

    // MÉTODO PARA REMOVER UM FUNCIONÁRIO COM BASE NO ID
    public Funcionario removerFuncionario(int id) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        return null;
    }

    // MÉTODO PARA VALIDAR UMA REQUISIÇÃO
    public void validarRequisicao() {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
    }
}
