/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
import java.util.Scanner;

public class TrabalhoPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        String usuarioDig, senhaDig;
        do {
            System.out.println("Menu:");
            System.out.println("1. Docente");
            System.out.println("2. Tecnico");
            System.out.println("3. Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();
            String usuarioCorreto, senhaCorreta;
            switch (escolha) {
                case 1:
                    usuarioCorreto = "docente";
                    senhaCorreta = "246";
                    System.out.println("Bem-vindo ao sistema de login");
                    
                    do{
                        System.out.print("Digite seu nome de usuário: ");
                        usuarioDig = scanner.nextLine();
                        System.out.print("Digite sua senha: ");
                        senhaDig = scanner.nextLine();
                        if (usuarioDig.equals(usuarioCorreto) && senhaDig.equals(senhaCorreta)) {
                            System.out.println("Login bem-sucedido!\nBem-vindo, " + usuarioCorreto);
                            break;
                        } else {
                            System.out.println("Usuário ou senha incorretos. Tente novamente.");
                        }
                    }while(true);
                    break;
                case 2:
                    usuarioCorreto = "tecnico";
                    senhaCorreta = "135";
                    System.out.println("Bem-vindo ao sistema de login");
                    
                    do{
                        System.out.print("Digite seu nome de usuário: ");
                        usuarioDig = scanner.nextLine();
                        System.out.print("Digite sua senha: ");
                        senhaDig = scanner.nextLine();
                        if (usuarioDig.equals(usuarioCorreto) && senhaDig.equals(senhaCorreta)) {
                            System.out.println("Login bem-sucedido!\nBem-vindo, " + usuarioCorreto);
                            break;
                        } else {
                            System.out.println("Usuário ou senha incorretos. Tente novamente.");
                        }
                    }while(true);
                    break;
                case 3:
                    usuarioCorreto = "administrador";
                    senhaCorreta = "369";
                    System.out.println("Bem-vindo ao sistema de login");
                    
                    do{
                        System.out.print("Digite seu nome de usuário: ");
                        usuarioDig = scanner.nextLine();
                        System.out.print("Digite sua senha: ");
                        senhaDig = scanner.nextLine();
                        if (usuarioDig.equals(usuarioCorreto) && senhaDig.equals(senhaCorreta)) {
                            System.out.println("Login bem-sucedido!\nBem-vindo, " + usuarioCorreto);
                            break;
                        } else {
                            System.out.println("Usuário ou senha incorretos. Tente novamente.");
                        }
                    }while(true);
                    break;
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
