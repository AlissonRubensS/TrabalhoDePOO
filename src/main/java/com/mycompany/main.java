package com.mycompany;

import com.mycompany.Controller.*;
import com.mycompany.Model.*;
import com.mycompany.View.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        LoginController.load();
        boolean control = true;
        Scanner scanner = new Scanner(System.in);
        while (control == true) {
            try {
                System.out.println("*******************************************************************");
                    System.out.println("Bem Vindo(a) ao Sistema de Chamados e Requisições!");
                    System.out.println("Digite uma das opções abaixo:\n");
                    System.out.println("[1] - Login");
                    System.out.println("[2] - Sair");
                    System.out.println("\n*******************************************************************");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Login login = new Login(scanner);
                            Funcionario func = login.login();
                            if (func.getCargo().equals("A")) {
                                //View do Admin 
                                Administrador adm = new Administrador(func);
                                AdmView adm_view = new AdmView(adm, scanner);
                                adm_view.mostrarOpcoes();

                            }else if (func.getCargo().equals("D")) {
                                //Area do Docente
                                Docente doc = new Docente(func);
                                DocenteView doc_view = new DocenteView(doc, scanner);
                                doc_view.areaDocente();

                            }else if (func.getCargo().equals("T")) {
                                //Area do Tecnico Administrativo
                                TecAdm tec_adm = new TecAdm();
                                TecAdmMenu tec_adm_menu = new TecAdmMenu(tec_adm, scanner);
                                tec_adm_menu.mostrarOpcoes();

                            }else{
                                System.out.println("Email ou senha incorreta, tente novamente!\n");
                            }
                            
                            break;
                        case 2:
                            System.out.println("Saindo ...");
                            control = false;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
            } catch (NullPointerException e){
                System.out.println("Funcionário não encontrado");
            }catch (InputMismatchException e){
                System.out.println("Valor inserido inválido");
            }catch (Exception e){
                System.out.println("ERRO! " + e.getMessage());
            }
        }
        scanner.close(); 
    }
} // Teste 2

