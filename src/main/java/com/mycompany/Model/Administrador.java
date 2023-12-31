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
                String[] dadosFuncionario = linhaAtual.split("-=-");

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
    public boolean validarRequisicao(int idRequisicao) {
        try {
            File userFile = new File("src\\main\\java\\com\\mycompany\\Database\\Users.txt");
            File tempFile = new File("src\\main\\java\\com\\mycompany\\Database\\tempUsers.txt");

            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String linhaAtual;

            while ((linhaAtual = reader.readLine()) != null) {
                String[] dadosRequisicao = linhaAtual.split("-=-");

                int idRequisicaoAtual = Integer.parseInt(dadosRequisicao[0]);

                if (idRequisicaoAtual == idRequisicao) {
                    // Realiza a validação da requisição mudando seu status
                    if ("Pendente".equals(dadosRequisicao[4])) {
                        dadosRequisicao[4] = "Concluido";
                        linhaAtual = String.join("-=-", dadosRequisicao);
                    }
                }
                
                writer.write(linhaAtual + System.getProperty("line.separator"));
            }

            writer.close();
            reader.close();

            // Remover o arquivo original
            if (!userFile.delete()) {
                System.out.println("Falha ao deletar o arquivo original!");
                return false;
            }

            // Renomear o arquivo temporário para o nome do arquivo original
            if (!tempFile.renameTo(userFile)) {
                System.out.println("Falha ao renomear o arquivo temporário!");
                return false;
            }

            return true; // Operação concluída com sucesso
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Falha 
        }
    }
}
