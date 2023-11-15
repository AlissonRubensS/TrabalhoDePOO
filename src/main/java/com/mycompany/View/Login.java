package com.mycompany.View;

import java.util.Scanner;

public class Login {

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome de usuário:");
        String username = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String password = scanner.nextLine();
        
        System.out.println("Login bem-sucedido para o usuário: " + username);
        return true;
    }
}
