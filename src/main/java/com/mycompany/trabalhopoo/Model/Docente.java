
package com.mycompany.trabalhopoo.Model;

public class Docente extends Funcionario {
    private Chamado novo_chamado;

    // CONSTRUTOR PADRÃO VAZIO
    public Docente() {
        super();
    }

    // MÉTODO PARA EXCLUIR UM CHAMADO
    public Chamado excluirChamado(Chamado chamado) {
        // NÃO PODEMOS FAZER ESSA PARTE AGORA, POIS AJUSTES SERÃO FEITOS EM BREVE
        return chamado;
    }

    // MÉTODO PARA EDITAR A DESCRICAO DE UM CHAMADO
    public void editarChamado(Data data_chamado, String local, String objeto, String novaDescricao, Chamado chamado) {
        chamado.setDataChamado(data_chamado);
        chamado.setLocal(local);
        chamado.setObjeto(objeto);
        chamado.setNovaDescricao(novaDescricao);
    }

    // GETTER PARA OBTER O NOVO CHAMADO
    public Chamado getNovo_chamado() {
        return novo_chamado;
    }

    // SETTER PARA DEFINIR O NOVO CHAMADO
    public void setNovo_chamado(Chamado chamado) {
        this.novo_chamado = chamado;
    }
}
