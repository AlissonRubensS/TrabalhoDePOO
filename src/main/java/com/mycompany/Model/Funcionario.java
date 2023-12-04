
package com.mycompany.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Funcionario extends Pessoa {
    private String cargo; // PRPRIEDADE QUE ARMAZENA O CARGO DO FUNCIONÁRIO

    // GETTER PARA OBTER O CARGO DO FUNCIONÁRIO
    public String getCargo() {
        return cargo;
    }
    // METODO PARA GERAR O ID
    public int geraid(){
        int min = 1000;
        int max = 9999;
        int id = (int)Math.floor(Math.random() * (max - min + 1) + min);
        
        public static String read(String path)
            String content = "";
            try{
                FileReader usersarq  = new FileReader("../Database/Users.txt");
                BufferedReader readusers = new BufferedReader(usersarq);
                String line ="";
                try{
                    line = readusers.readLine();
                    while(line != null);
                    content += line;
                    line = readusers.readLine();
                }
                usersarq.close()
            
            } catch (IOException ex){
                content = "ERRO: Não foi possivel ler o arquivo";
            
            }catch (FileNotFoundException ex){
                content = "ERRO: Não foi possivel localizar o arquivo"
            
            }if(content.contains("ERRO")){
                return "";
            }else{
                return conteudo;
            }
        }
    }

    // SETTER PARA DEFINIR O CARGO DO FUNCIONÁRIO COM VALIDAÇÃO
    public void setCargo(String cargo) {
        if ("D".equals(cargo) || "T".equals(cargo) || "A".equals(cargo)) {
            this.cargo = cargo;
        }
    }

    // MÉTODO PARA REALIZAR P LOGIN DO FUNCIONÁRIO
    public boolean login(String email, String senha) {
        // VERIFICA SE O E-MAIL E SENHA FORNECIDOS CORRESPONDEM ÀS INFORMAÇÕES DO FUNCIONÁRIO
        return true;
    }
    
    public String toString(){
        return (this.getId() +" "+ this.getNome() +" "+ this.getEmail() +" "+ this.getSenha() +" "+ this.getCargo() +" "+ this.getCpf());
    }

    public boolean equals(Funcionario funcionario){
        if (this.getEmail().equals(funcionario.getEmail())) {
            return true;
        }
        return false;
    }
    
    public Funcionario(Email email, String password){
        this.setEmail(email);
        this.setSenha(password);
    }

    public Funcionario(String nome, CPF cpf, Email email, String senha, String cargo, int id){ 
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSenha(senha);
        this.setCargo(cargo);
        this.setId(id);
    }
    public Funcionario(){}
}
