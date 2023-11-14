package com.mycompany.trabalhopoo.Model;

import java.util.ArrayList;

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
    public Chamado excluirChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        return chamado;
    }

    // MÉTODO PARA EDITAR A DESCRICAO DE UM CHAMADO
    public void editarChamado(Data data_chamado, String local, String objeto, String novaDescricao, Chamado chamado) {
        if(data_chamado!=null&&local!=null&&objeto!=null&&novaDescricao!=null&&chamado!=null){
            chamado.setDataChamado(data_chamado);
            chamado.setLocal(local);
            chamado.setObjeto(objeto);
            chamado.setNovaDescricao(novaDescricao);
        }
    }
    /*
    public void exibirTodosChamados() {
        for (Chamado chamado : listaChamados) {
            visao.imprimirDetalhesUsuario(chamado.imprimirDetalhesChamado);
        }
    }
    */
}
