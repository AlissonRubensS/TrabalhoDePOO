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
            f.setId(Character.getNumericValue(aux[0].charAt(0)));
            f.setNome(aux[1]);
            Email email = new Email(aux[2]);
            f.setEmail(email);
            f.setSenha(aux[3]);
            f.setCargo(aux[4]);

            funcionarios.add(f);
        }
        
        return funcionarios;
    }

    public static Funcionario logar(ArrayList<Funcionario> lista, Funcionario funcionario){
        for (Funcionario f : lista) {
            if (f.getEmail().equals(funcionario.getEmail()) && f.getSenha().equals(funcionario.getSenha())) {
                return f;
            }
        }
        return null;
    }
}
