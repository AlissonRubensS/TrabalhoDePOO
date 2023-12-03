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

    public static void write(String caminho, String linha){
        ArrayList<String> texto = File.read(caminho);
        texto.add(linha);
        try {
            FileWriter esc = new FileWriter(caminho);
            PrintWriter prt_esc = new PrintWriter(esc);
            for (String l : texto) {
                prt_esc.println(l);
            }
            prt_esc.close();
            
        } catch(FileNotFoundException e){
            System.out.println("Erro ao encontrar o arquivo" + " " + e.getMessage());
            
        }catch(IOException e){
            System.out.println("Erro ao lê o arquivo" + " " + e.getMessage());;
            
        }catch(Exception e){
            System.out.println("Erro desconhecido" + " " + e.getMessage());;
            
        }
    }

    public static void overwriter(String caminho, ArrayList<String> texto){    
        try {
            FileWriter esc = new FileWriter(caminho);
            BufferedWriter prt_esc = new BufferedWriter(esc);
            for (String l : texto) {
                prt_esc.write(l);
            }
            prt_esc.close();
            
        } catch(FileNotFoundException e){
            System.out.println("Erro ao encontrar o arquivo" + " " + e.getMessage());
            
        }catch(IOException e){
            System.out.println("Erro ao lê o arquivo" + " " + e.getMessage());;
            
        }catch(Exception e){
            System.out.println("Erro desconhecido" + " " + e.getMessage());;
            
        }
    }
}
