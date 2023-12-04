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
                    int id = Funcionario.geraid();
                    CPF cpf;
                    Email email;
                    
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

                    System.out.println("escolha o cargo do funcionario:");
                    System.out.println("1. Administrador");
                    System.out.println("2. Tecnico Administrativo");
                    System.out.println("3. Docente");

                    cargoEscolha = scanner.nextInt();
                    scanner.nextLine();
                    switch (cargoEscolha) {
                        case 1:
                            cargo = "A";
                            break;
                        case 2:
                            cargo = "T";
                            break;
                        case 3:
                            cargo = "D";
                            break;
                    
                        default:
                            cargo=null;
                            break;
                    }
                    Funcionario funcionario = new Funcionario(nome, cpf, email, senha, cargo, id);

                    adm.cadastrarFuncionario(funcionario);
                    break;

                case 2:
                    String nome_alterar = adm.getNome();
                    CPF cpf_alterar = adm.getCpf();
                    Email email_alterar = adm.getEmail();
                    String senha_alterar = adm.getSenha();
                    String cargo_alterar = adm.getCargo();
                    adm.alterarFuncionario(nome_alterar, cpf_alterar, email_alterar, senha_alterar, cargo_alterar);
                    break;
               
                case 3:
                    System.out.println("Digite a do funcionario a ser removido:");
                    int id_remover = scanner.nextInt();
                    scanner.nextLine();
                
                    if (adm.removerFuncionario(id_remover)) {
                        System.out.println("Funcionário removido com sucesso!");
                    } else {
                        System.out.println("Falha ao remover o funcionário. Verifique o ID informado.");
                    }
                    break;
                
                case 4:
                    System.out.println("Digite o ID da requisição");
                    int id_ValRequisicao = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (adm.validarRequisicao(id_ValRequisicao)) {
                        System.out.println("Requisição validada com sucesso!");
                    } else {
                        System.out.println("Falha ao validar a requisição.");
                    }
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
