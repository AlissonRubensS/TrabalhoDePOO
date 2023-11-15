package com.mycompany.Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

public class File {
    public static String read(String path){
        String contents = "";
        try {
            FileReader file = new FileReader(path);
            BufferedReader readFile = new BufferedReader(file);
            String line = "";
            try {
                line = readFile.readLine();
                while (line != null) {                    
                    contents += line;
                    line = readFile.readLine();
                }
                readFile.close();
                
            } catch (IOException ex) {
                contents = "Erro: Não foi possível ler o arquivo";
            }
            
        } catch (FileNotFoundException e) {
            contents = "Erro: Não é possíel achar o arquivo!";
        }
        return contents;
    }
    
    public static boolean Writer(String path, String contents){
        try {
            FileWriter file = new FileWriter(path);
            PrintWriter writerFile = new PrintWriter(file);
            writerFile.println(contents);
            writerFile.close();
            return true;
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
            
        }
    }
}
