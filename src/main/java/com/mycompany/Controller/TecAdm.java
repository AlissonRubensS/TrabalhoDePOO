package com.mycompany.Controller;
import java.util.ArrayList;


import com.mycompany.Model,TecAdm;

public class TecAdm {
    public static ArrayList<tecnico> load(){
         ArrayList<String> lines = File.read("src\\main\\java\\com\\mycompany\\Database\\Users.txt");
         ArrayList<String> tecnicos = new ArrayList<tecnico();
         
         for (String lines : linhas) {
            String[] aux = linha.split("-=-");

            TecAdm tecnico = new TecAdm();
            id.setId(Integer.parseInt(aux[0]));
        }
    }
}