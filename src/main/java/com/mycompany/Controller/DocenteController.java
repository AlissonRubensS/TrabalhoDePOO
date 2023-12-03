package com.mycompany.Controller;

import java.util.ArrayList;

import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;
import com.mycompany.Model.Docente;

public class DocenteController {
    private ArrayList<Chamado> chamados;
    private Docente docente;

    public DocenteController(){}

    public DocenteController(Docente docente){
        this.docente = docente;

        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Database\\Chamados.txt");
        ArrayList<Chamado> chamados = new ArrayList<Chamado>();

        for (String linha : linhas) {
            String aux[] = linha.split("-=-");

            Chamado chamado = new Chamado();
            chamado.setId(1);;
            Data data = new Data(aux[1]);
            chamado.setDataChamado(data);
            chamado.setLocal(aux[2]);
            chamado.setObjeto(aux[3]);
            chamado.setNovaDescricao(aux[4]);

            chamados.add(chamado);
        }
    }

    public ArrayList<Chamado> getChamados() {
        return chamados;
    }

    public Docente getDocente() {
        return docente;
    }
}
