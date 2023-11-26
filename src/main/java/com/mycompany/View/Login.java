package com.mycompany.View;

import com.mycompany.Model.*;
import com.mycompany.Controller.*;
import java.util.*;

public class Login {

    public static boolean login() {
        boolean valido = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome de usuário:");
        String username = scanner.nextLine();
        Email email = new Email(username);

        System.out.println("Digite sua senha:");
        String password = scanner.nextLine();
        
        ////////////////////////////////////////////
        ArrayList<Funcionario> lista = LoginController.load();
        ////////////////////////////////////////////
        
        Funcionario f = new Funcionario();
        f.setEmail(email);
        f.setSenha(password);
        //ALTERAR ESSA PARTE PARA LEITURA COM ARQUIVO
        if (f.login(email.getEmail(), password)) {
            System.out.println("Login bem-sucedido para o usuário: " + username);
            valido = LoginController.logar(lista, f);
        }
        return valido;
    }
}
