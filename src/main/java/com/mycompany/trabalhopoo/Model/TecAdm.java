
package com.mycompany.trabalhopoo.Model;

public class TecAdm {
    private Chamado chamado;

    // MÉTODO PARA FINALIZAR UM CHAMADO
    public void finalizarChamado(Chamado chamado) {

    }

    // MÉTODO PARA FORNECER FEEDBACK A UM CHAMADO
    public String feedbackChamado(Chamado chamado) {

        return "Feedback do chamado";
    }

    // MÉTODO PARA CRIAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void criarRequisicao(Chamado chamado) {

    }

    // MÉTODO PARA EDITAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void editarRequisicao(Chamado chamado) {

    }

    // MÉTODO PARA EXCLUIR UMA REQUISIÇÃO E RETORNAR O CHAMADO ASSOCIADO
    public Chamado excluirRequisicao(Chamado chamado) {

        return chamado;
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
