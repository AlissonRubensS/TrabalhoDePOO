package com.mycompany.Model;

import java.util.ArrayList;

import com.mycompany.Controller.TecAdmController;

import com.mycompany.Controller.TecAdmController;

public class TecAdm extends Funcionario {
    private Chamado chamado;

    private ArrayList<Chamado> chamados = TecAdmController.carregar_chamado();
    private ArrayList<Requisicao> requisicoes = TecAdmController.carregar_requisicoes();

    public TecAdm() {
        //this.chamados = 
        super();
    }

    public ArrayList<Chamado> getChamados() {
        return chamados;
    }

    public ArrayList<Requisicao> getRequisicoes() {
        return requisicoes;
    }

    public TecAdm(Funcionario fun) {
        super(fun.getNome(), fun.getCpf(), fun.getEmail(), fun.getSenha(), "T", fun.getId());
    }

    // MÉTODO PARA FINALIZAR UM CHAMADO
    public void finalizarChamado(int idChamado) {
        Chamado chamado = selecionarChamadoPorId(idChamado);
        if (chamado != null) {
            chamado.setStatus("Concluído");
        } else {

        }
    }

    // MÉTODO PARA FORNECER FEEDBACK A UM CHAMADOFse
    public String feedbackChamado(int idChamado) {
        Chamado chamado = selecionarChamadoPorId(idChamado);
        if (chamado != null) {
            // IMPLEMENTAR A LÓGICA AINDA PARA OBTER O FEEDBACK
            return "Feedback do Chamado";
        } else {
            return "Chamado não encontrado";
        }

    }

    // MÉTODO PARA EDITAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void editarRequisicao(int idRequisicao, Data novaData, String novoLocal, String novoObjeto,
            String novoStatus, String novoNivelUrgencia) {
        Requisicao requisicaoParaEditar = null;

        // Encontrar a requisição com o ID fornecido
        for (Requisicao requisicao : requisicoes) {
            if (requisicao.getId() == idRequisicao) {
                requisicaoParaEditar = requisicao;
                break;
            }
        }

        if (requisicaoParaEditar != null) {
            try {
                requisicaoParaEditar.setData_requisicao(novaData);
                requisicaoParaEditar.setLocal(novoLocal);
                requisicaoParaEditar.setObjeto(novoObjeto);
                requisicaoParaEditar.setStatus(novoStatus);
                requisicaoParaEditar.setNivelUrgencia(novoNivelUrgencia);
            } catch (Exception e) {
                // LIDAR COM AS EXCEÇÕES
                e.printStackTrace();
            }
        } else {
            // LÓGICA PARA O CASO DA REQUISIÇÃO NÃO SER ENCONTRADA
        }
    }

    // MÉTODO PARA CRIAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void criarRequisicao(int idChamado, Data dataRequisicao, String localRequisicao, String objetoRequisicao, String statusRequisicao, String nivelUrgenciaRequisicao) {
        Chamado chamadoAssociado = selecionarChamadoPorId(idChamado);

        if (chamadoAssociado != null) {
            try {
                Requisicao novaRequisicao = new Requisicao();
                novaRequisicao.setData_requisicao(dataRequisicao);
                novaRequisicao.setLocal(localRequisicao);
                novaRequisicao.setObjeto(objetoRequisicao);
                novaRequisicao.setStatus(statusRequisicao);
                novaRequisicao.setNivelUrgencia(nivelUrgenciaRequisicao);

                requisicoes.add(novaRequisicao);
                chamadoAssociado.setRequisicao(novaRequisicao);
                TecAdmController.cadastrar_requisicao(novaRequisicao);
            } catch (Exception e) {
                System.out.println("Erro ao criar requisição: " + e.getMessage());
            }
        }
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

    public void excluirRequisicao(int idChamadoExcluirRequisicao) {
    }

}
