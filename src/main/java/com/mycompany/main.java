package com.mycompany;

import com.mycompany.Controller.*;
import com.mycompany.Model.Funcionario;
import com.mycompany.Model.TecAdm;
import com.mycompany.View.DocenteView;
import com.mycompany.View.Login;
import com.mycompany.View.TecAdmMenu;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
      
        LoginController.load();
        
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        while (control == true) {
            System.out.println("*******************************************************************");
            System.out.println("Bem Vindo(a) ao Sistema de Chamados e Requisições!");
            System.out.println("Digite uma das opções abaixo:\n");
            System.out.println("[1] - Login");
            System.out.println("[2] - Sair");
            System.out.println("\n*******************************************************************");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Funcionario fun = Login.login();
                    if (fun.getCargo().equals("A")) {
                        //View do Admin 
                    }else if (fun.getCargo().equals("D")) {
                        //Area do Docente
                        DocenteView doc_view = new DocenteView();
                        doc_view.areaDocente();
                    }else if (fun.getCargo().equals("T")) {
                        //Area do Tecnico Administrativo
                        TecAdm tec_adm = new TecAdm();
                        TecAdmMenu tec_adm_menu = new TecAdmMenu(tec_adm);
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
                    break;
            }

        }
        scanner.close(); 
    }
}
