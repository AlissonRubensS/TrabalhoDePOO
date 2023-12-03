
package com.mycompany.Model;

import java.util.ArrayList;

import com.mycompany.Controller.DocenteController;
import com.mycompany.Controller.File;

public class Docente extends Funcionario {
    private static ArrayList<Chamado> listaChamados;

    public void adicionarChamado(Chamado chamado) {
        listaChamados.add(chamado);
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

    public Chamado exibirChamado(int id) {
        for (int i=0;i<listaChamados.size();i++) {
            if(id==listaChamados.get(i).getId()){
                return listaChamados.get(i);
            }
        }
        return null;
    }

    public static boolean verificarID(int id) {
        for (int i=0;i<listaChamados.size();i++) {
            if(id==listaChamados.get(i).getId()){
                return true;
            }
        }
        return false;
    }
    
    public Docente(){
        super();
    }
    public Docente(Funcionario fun){
        super(fun.getNome(), fun.getCpf(), fun.getEmail(), fun.getSenha(), "D", fun.getId());
        DocenteController docenteController = new DocenteController(this);
        this.listaChamados = docenteController.getChamados();
    }

}
