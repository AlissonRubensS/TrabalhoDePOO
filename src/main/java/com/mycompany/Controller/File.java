package com.mycompany.Controller;

import java.io.*;
import java.util.ArrayList;

public class File {
    public static ArrayList<String> read(String caminho){
        ArrayList<String> texto = new ArrayList<String>();

        try{
            FileReader leitor;
            leitor = new FileReader(caminho);
            BufferedReader buffer_leitor = new BufferedReader(leitor);
            String linha;

            while ((linha = buffer_leitor.readLine()) != null) {
                texto.add(linha);
            }

            buffer_leitor.close();
            leitor.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Erro ao encontrar o arquivo" + " " + e.getMessage());
            
        }catch(IOException e){
            System.out.println("Erro ao lê o arquivo" + " " + e.getMessage());;
            
        }catch(Exception e){
            System.out.println("Erro desconhecido" + " " + e.getMessage());;
            
        }
        return texto;     
    }
}
