package com.mycompany.Controller;

import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;

import java.util.ArrayList;

public class DocenteController{
    public static void cadastrar_chamado(Chamado chamado){
        File.write("src\\main\\java\\com\\mycompany\\Database\\Chamado.txt", chamado.toString());

    }

    public static ArrayList<Chamado> carregar_chamado(){
        ArrayList<Chamado> listaChamados = new ArrayList<Chamado>();
        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Database\\Chamado.txt");

        for (String linha : linhas) {
            String[] aux = linha.split("-=-");

            Chamado chamado = new Chamado();
            chamado.setId(Integer.parseInt(aux[0]));

            Data data = new Data(aux[1]);
            chamado.setDataChamado(data);
            
            chamado.setLocal(aux[2]);
            chamado.setObjeto(aux[3]);
            chamado.setNovaDescricao(aux[4]);
            
            listaChamados.add(chamado);

        }

        return listaChamados;
    }
}