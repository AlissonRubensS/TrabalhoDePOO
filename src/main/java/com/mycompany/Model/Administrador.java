package com.mycompany.Model;

public class Administrador extends Funcionario{

    public Administrador() {
        // CONSTRUTOR
    }

    public Administrador(Funcionario fun){
        this.setId(fun.getId());
        this.setNome(fun.getNome());
        this.setEmail(fun.getEmail());
        this.setCpf(fun.getCpf());
        this.setCargo("A");
        this.setSenha(fun.getSenha());
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
