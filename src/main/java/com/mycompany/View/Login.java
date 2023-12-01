package com.mycompany.View;

import com.mycompany.Model.*;
import com.mycompany.Controller.*;
import java.util.*;

public class Login {
    Scanner scanner;
    
    public Login(Scanner scanner){
        this.scanner = scanner;
    }

    public Funcionario login() {
        
        System.out.println("Digite seu email:");
        String username = scanner.next().strip();
        Email email = new Email(username);

        System.out.println("Digite sua senha:");
        String password = scanner.next().strip();
        
        ////////////////////////////////////////////
        ArrayList<Funcionario> lista = LoginController.load();
        ////////////////////////////////////////////
        
        Funcionario f = new Funcionario();
        f.setEmail(email);
        f.setSenha(password);
        //ALTERAR ESSA PARTE PARA LEITURA COM ARQUIVO
        return LoginController.logar(lista, f);
    }
}
