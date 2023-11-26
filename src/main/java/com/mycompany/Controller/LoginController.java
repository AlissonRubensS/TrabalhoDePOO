package com.mycompany.Controller;

import java.util.ArrayList;

import com.mycompany.Model.Email;
import com.mycompany.Model.Funcionario;

public class LoginController {
    public static ArrayList<Funcionario> load(){
        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Controller\\Database\\Users.txt");
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        for (String l : linhas) {
            String[] aux = l.split(" ");
            Funcionario f = new Funcionario();
            Email email = new Email(aux[0]);
            f.setEmail(email);
            f.setSenha(aux[1]);
            f.setCargo(aux[2]);
            funcionarios.add(f);
        }
        
        return funcionarios;
    }

}
