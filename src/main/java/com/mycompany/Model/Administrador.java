package com.mycompany.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Administrador extends Funcionario {

    public Administrador() {
        // CONSTRUTOR
    }

    public Administrador(Funcionario fun) {
        super(fun.getNome(), fun.getCpf(), fun.getEmail(), fun.getSenha(), "D", fun.getId());
    }

    // MÉTODO PARA CADASTRAR UM FUNCIONÁRIO
    public boolean cadastrarFuncionario(Funcionario funcionario) {
        try {
            FileWriter fileWriter = new FileWriter("src/main/java/com/mycompany/Database/Users.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    
            bufferedWriter.write(funcionario.toString());
            bufferedWriter.newLine(); // Adiciona uma nova linha para o próximo funcionário
            bufferedWriter.close();
    
            return true;
        } catch (IOException e) {
            e.printStackTrace();
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
    public boolean removerFuncionario(int id) {
        try {
            File inputFile = new File("src\\main\\java\\com\\mycompany\\Database\\Users.txt");
            File tempFile = new File("src\\main\\java\\com\\mycompany\\Database\\tempUsers.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String linhaAtual;

            while ((linhaAtual = reader.readLine()) != null) {
                String[] dadosFuncionario = linhaAtual.split(" ");

                int idFuncionario = Integer.parseInt(dadosFuncionario[0]);

                if (idFuncionario != id) {
                    writer.write(linhaAtual + System.getProperty("line.separator"));
                }
            }

            writer.close();
            reader.close();

            // Renomeia o arquivo 
            if (!tempFile.renameTo(inputFile)) {
                throw new IOException("Não foi possível renomear o arquivo temporário");
            }

            return true; // Funcionário removido com sucesso
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Falha 
        }
    }

    // MÉTODO PARA VALIDAR UMA REQUISIÇÃO
    public void validarRequisicao() {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
    }
}
