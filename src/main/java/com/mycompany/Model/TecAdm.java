package com.mycompany.Model;

public class TecAdm extends Funcionario{
    private Chamado chamado;

    // MÉTODO PARA FINALIZAR UM CHAMADO
    public void finalizarChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
    }

    // MÉTODO PARA FORNECER FEEDBACK A UM CHAMADO
    public String feedbackChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE

        return "Feedback do chamado";
    }

    // MÉTODO PARA EDITAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void editarRequisicao(Data data_requisicao, String local, String objeto, String nivel_urgencia, Requisicao requisicao) {
        requisicao.setData_requisicao(data_requisicao);
        requisicao.setLocal(local);
        requisicao.setObjeto(objeto);
        requisicao.setStatus(nivel_urgencia);
        requisicao.setNivelUrgencia(nivel_urgencia);
    }

    // MÉTODO PARA CRIAR UMA REQUISIÇÃO COM BASE EM UM CHAMADO
    public void criarRequisicao(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE        
    }

    // MÉTODO PARA EXCLUIR UMA REQUISIÇÃO E RETORNAR O CHAMADO ASSOCIADO
    public Chamado excluirRequisicao(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
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
