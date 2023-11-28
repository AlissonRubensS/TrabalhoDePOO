package com.mycompany.View;

import java.util.*;

public class MenuView {
    private DocenteView visao;
    //private MainController controlador;
    private boolean finalizar = false;
    Scanner scanner;

    public void finalizarSistema() {
		finalizar = true;
	}
    public void menuPrincipal() {
		
        Scanner scar = new Scanner(System.in);
		int opcao;

        System.out.println("\nSISTEMA DE CHAMADOS E REQUISICOES\n");
		
        do {
			
            System.out.println("Seja muito bem-vindo!");
            System.out.println("1. Docente");
            System.out.println("2. Tecnico Administrativo");
            System.out.println("3. Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();  

            switch (opcao) {
                case 1:
                    visao.areaDocente();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 0:
                    
                    break;
                default:
                    break;
            }

		} while (!finalizar);
		scar.close();
	}
}
