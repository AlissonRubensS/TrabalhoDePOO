package com.mycompany.View;

import java.util.Scanner;
import com.mycompany.Model.*;

public class AdmView {   
    
    private Administrador adm; 
    private Scanner scanner;

    public AdmView(Administrador adm, Scanner scanner){   // metodo construtor
        this.adm = adm;
        this.scanner = scanner;
    }

    public void mostrarOpcoes(){
            int opcao;

            do{
                System.out.println("*******************************************************************");
                System.out.println("Escolha uma opção:");
                System.out.println("1. Cadastrar Funcionario");
                System.out.println("2. Alterar Funcionario");
                System.out.println("3. Remover Funcionario");
                System.out.println("4. Validar Requisição");
                System.out.println("0. Sair");
                System.out.println("*******************************************************************");
               
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                    
                    String nome, senha, cargo, cpf_String, email_String;
                    int id;
                    CPF cpf;
                    Email email;
                    
                    System.out.println("digite o id do funcionario:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("digite o nome do funcionario:");
                    nome = scanner.nextLine();
                    
                    System.out.println("digite o CPF do funcionario:");
                    cpf_String = scanner.nextLine();
                    cpf = new CPF(cpf_String);

                    System.out.println("digite o Email do funcionario:");
                    email_String = scanner.nextLine();
                    email = new Email(email_String);

                    System.out.println("digite a senha do funcionario:");
                    senha = scanner.nextLine();

                    System.out.println("digite o cargo do funcionario (A/D/T):");
                    cargo = scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nome, cpf, email, senha, cargo, id);

                    adm.cadastrarFuncionario(funcionario);
                    break;
                case 2:
                    System.out.println("digite o id do funcionario:");
                    int id_alterar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("digite o nome do funcionario:");
                    String nome_alterar = scanner.nextLine();
                    
                    System.out.println("digite o CPF do funcionario:");
                    String cpf_String2 = scanner.nextLine();
                    CPF cpf_alterar = new CPF(cpf_String2);

                    System.out.println("digite o Email do funcionario:");
                    String email_String2 = scanner.nextLine();
                    Email email_alterar = new Email(email_String2);

                    System.out.println("digite a senha do funcionario:");
                    String senha_alterar = scanner.nextLine();

                    System.out.println("digite o cargo do funcionario (A/D/T):");
                    String cargo_alterar = scanner.nextLine();
                    adm.alterarFuncionario(id_alterar,nome_alterar, cpf_alterar, email_alterar, senha_alterar, cargo_alterar);
                    break;
                case 3:
                    int id_remover = adm.getId();
                    adm.removerFuncionario(id_remover);
                    break;
                case 4:
                    adm.validarRequisicao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

                }
            
            } while (opcao != 0);
    
    }

}
