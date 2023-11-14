
package com.mycompany.trabalhopoo.Model;

import java.util.Scanner;

public class TrabalhoPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha, idex;
        String usuarioDig, senhaDig, usuarioCorreto, senhaCorreta;
        do {
            System.out.println("Menu:");
            System.out.println("1. Docente");
            System.out.println("2. Tecnico");
            System.out.println("3. Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                
                case 1:
                    DocenteView visao = new DocenteView();
                    DocenteController controlador = new DocenteController(visao);

                    System.out.println("ÁREA DO DOCENTE\nBem-vindo, Professor!");
                    usuarioCorreto = "docente";
                    senhaCorreta = "246";
                    
                    do{
                        System.out.print("Digite seu nome de usuário: ");
                        usuarioDig = scanner.nextLine();
                        System.out.print("Digite sua senha: ");
                        senhaDig = scanner.nextLine();

                        if (usuarioDig.equals(usuarioCorreto) && senhaDig.equals(senhaCorreta)) {
                            
                            System.out.println("Login bem sucedido!");
                            System.out.println("\nO que deseja?");
                            System.out.println("1. Editar Chamado");
                            System.out.println("2. Excluir Chamado");
                            System.out.println("0. Sair");
                            System.out.print("Escolha uma opcao: ");
                            escolha = scanner.nextInt();
                            if(escolha==1){
                                Chamado novChamado = new Chamado();
                                System.out.println("Preencha os dados!");
                                System.out.print("ID do seu chamado: ");
                                String id_cham = scanner.nextLine();
                                novChamado.setLocal(id_cham);
                                System.out.print("Data: ");
                                String data = scanner.nextLine();
                                novChamado.setLocal(data);
                                System.out.print("Local: ");
                                String local = scanner.nextLine();
                                novChamado.setLocal(local);
                                System.out.print("Objeto: ");
                                String objeto = scanner.nextLine();
                                novChamado.setLocal(objeto);
                                System.out.print("Descricao: ");
                                String descricao = scanner.nextLine();
                                novChamado.setLocal(descricao);
                            }if(escolha==2){


                                System.out.println("Digite o ID do chamado: ");
                                idex = scanner.nextInt();
                                //criar um For para procurar o chamado pelo ID
                                //criar uma função imprimir para imprimir as informações do chamado
                                controlador.excluirChamado(null);


                            }if(escolha==3){

                            }if(escolha==0){
                                System.out.println("Saindo do programa.");
                                break;
                            }else{
                                System.out.println("Opção inválida.");
                                break;
                            }
                        } else {
                            System.out.println("Usuário ou senha incorretos. Tente novamente.");
                        }
                    }while(true);
                    break;

                case 2:
                    //usuarioCorreto = "tecnico";
                    //senhaCorreta = "135";
                case 3:
                    //usuarioCorreto = "administrador";
                    //senhaCorreta = "369";
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);
        scanner.close(); 
    }
}
