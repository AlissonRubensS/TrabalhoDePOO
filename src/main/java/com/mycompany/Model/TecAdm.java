package com.mycompany.Model;

import java.util.ArrayList;
import java.util.List;

public class TecAdm extends Funcionario {
    private Chamado chamado;

    private List<Chamado> chamados = new ArrayList<>();
    private List<Requisicao> requisicoes = new ArrayList<>();

    public TecAdm() {
    }

    public TecAdm(Funcionario fun) {
        super(fun.getNome(), fun.getCpf(), fun.getEmail(), fun.getSenha(), "T", fun.getId());
    }

    // MÉTODO PARA FINALIZAR UM CHAMADO
    public void finalizarChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        chamado.setStatus("Concluido");
        System.out.println("Chamado finalizado com sucesso!");
    }

    // MÉTODO PARA FORNECER FEEDBACK A UM CHAMADOFse
    public String feedbackChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE

        return "Feedback do chamado";
    }

    // MÉTODO PARA EDITAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void editarRequisicao(Data data_requisicao, String local, String objeto, String nivel_urgencia,
            Requisicao requisicao) {
        requisicao.setData_requisicao(data_requisicao);
        requisicao.setLocal(local);
        requisicao.setObjeto(objeto);
        requisicao.setStatus(nivel_urgencia);
        requisicao.setNivelUrgencia(nivel_urgencia);

    }

    // MÉTODO PARA CRIAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void criarRequisicao(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        Requisicao novaRequisicao = new Requisicao();
        requisicoes.add(novaRequisicao);
        chamado.setRequisicao(novaRequisicao);
    }

    // MÉTODO PARA EXCLUIR UMA REQUISIÇÃO E RETORNAR O CHAMADO ASSOCIADO
    public Chamado excluirRequisicao(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        Requisicao requisicaoParaExcluir = chamado.getRequisicao();
        if (requisicaoParaExcluir != null) {
            requisicoes.remove(requisicaoParaExcluir);
            chamado.setRequisicao(null);

        } else {
            System.out.println("Chamado não possui uma requisição associada.");
        }
        return chamado;
    }

    public Chamado selecionarChamadoPorId(int idChamado) {
        for (Chamado chamado : chamados) {
            if (chamado.getId() == idChamado) {
                return chamado;
            }
        }
        return null;
    }

    public void editarChamado(Data novaData, String novoLocal, String novoObjeto, String novaDescricao,
            Chamado chamado) {
        chamado.setDataChamado(novaData);
        chamado.setLocal(novoLocal);
        chamado.setObjeto(novoObjeto);
        chamado.setNovaDescricao(novaDescricao);
    }

    // GETTER PARA OBTER O CHAMADO
    public Chamado getChamado() {
        return chamado;
    }

    // SETTER PARA DEFINIR O CHAMADO
    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }
}
