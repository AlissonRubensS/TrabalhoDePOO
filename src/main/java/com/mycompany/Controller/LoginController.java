package com.mycompany.Controller;

import java.util.ArrayList;
import com.mycompany.Model.Email;
import com.mycompany.Model.Funcionario;

public class LoginController {
    public static ArrayList<Funcionario> load(){
        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Database\\Users.txt");
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        for (String l : linhas) {
            String[] aux = l.split(" ");
            Funcionario f = new Funcionario();
            Email email = new Email(aux[0].strip());
            f.setEmail(email);
            f.setSenha(aux[1].strip());
            f.setCargo(aux[2].strip());
            funcionarios.add(f);
        }
        
        return funcionarios;
    }

    public static Boolean logar(ArrayList<Funcionario> lista, Funcionario funcionario){
        for (Funcionario f : lista) {
            if (f.getEmail().equals(funcionario.getEmail()) && f.getSenha().equals(funcionario.getSenha())) {
                return true;
            }
        }
        return false;
    }

}
