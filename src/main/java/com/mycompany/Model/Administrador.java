package com.mycompany.Model;
import java.util.ArrayList;

import com.mycompany.Controller.*;

public class Administrador extends Funcionario{

    public Administrador() {
        // CONSTRUTOR
    }

    public Administrador(Funcionario fun){
        super(fun.getNome(), fun.getCpf(), fun.getEmail(), fun.getSenha(), "D", fun.getId());
    }

    // MÉTODO PARA CADASTRAR UM FUNCIONÁRIO
    public boolean cadastrarFuncionario(Funcionario funcionario) {
        try {            
            File.write("src\\main\\java\\com\\mycompany\\Database\\Users.txt", funcionario.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // MÉTODO PARA ALTERAR UM FUNCIONÁRIO COM BASE NO ID
    public void alterarFuncionario(int id, String nome_novo, CPF cpf_novo, Email email_novo, String senha_nova, String cargo_novo) {
        ArrayList<Funcionario> funcionarios = LoginController.load();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                funcionario.setNome(nome_novo);
                funcionario.setCpf(cpf_novo);
                funcionario.setEmail(email_novo);
                funcionario.setSenha(senha_nova);
                funcionario.setCargo(cargo_novo);
                break;
            }
            File.write("src\\main\\java\\com\\mycompany\\Database\\Users.txt", funcionario.toString());
        }
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

    public String toString(){
        return super.toString();
    }
}
