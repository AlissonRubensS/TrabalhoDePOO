package com.mycompany.Controller;

import java.util.ArrayList;
import com.mycompany.Model.*;
import com.mycompany.View.*;

public class DocenteController {
    private ArrayList<Chamado> listaChamados;
    private DocenteView visao;

    public DocenteController(DocenteView visao) {
        this.listaChamados = new ArrayList<>();
        this.visao = visao;
    }

    public void adicionarChamado(Chamado chamado) {
        Chamado novoChamado = new Chamado(chamado);
        listaChamados.add(novoChamado);
    }

    // MÉTODO PARA EXCLUIR UM CHAMADO
    public Chamado excluirChamado(int id) {
        for (int i=0;i<listaChamados.size();i++) {
            if(id==listaChamados.get(i).getId()){
                Chamado chamadoExcluido = listaChamados.get(i);
                listaChamados.remove(listaChamados.get(i));
                return chamadoExcluido;
            }
        }
        return null;
    }

    // MÉTODO PARA EDITAR A DESCRICAO DE UM CHAMADO
    public void editarChamado(int id, Data data_chamado, String local, String objeto, String novaDescricao) {
        for (int i=0;i<listaChamados.size();i++) {
            if(id==listaChamados.get(i).getId()){
                if(data_chamado!=null&&local!=null&&objeto!=null&&novaDescricao!=null){
                    listaChamados.get(i).setDataChamado(data_chamado);
                    listaChamados.get(i).setLocal(local);
                    listaChamados.get(i).setObjeto(objeto);
                    listaChamados.get(i).setNovaDescricao(novaDescricao);
                }
            }
        }
        
    }

    public void exibirChamado(int id) {
        for (int i=0;i<listaChamados.size();i++) {
            if(id==listaChamados.get(i).getId()){
                visao.imprimirDetalhesChamado(listaChamados.get(i).getDetalhes());
            }
        }
    }
}
