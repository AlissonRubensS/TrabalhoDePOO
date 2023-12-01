package com.mycompany.Model;
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
            File.write("src\\main\\java\\com\\mycompany\\Database\\Users.txt", funcionario.toString(funcionario));
            File.write("src\\main\\java\\com\\mycompany\\Database\\LoginUsers.txt", (funcionario.getEmail() +" "+ funcionario.getSenha() +" "+ funcionario.getCargo()));
            return true;
        } catch (Exception e) {
            return false;
        }
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
