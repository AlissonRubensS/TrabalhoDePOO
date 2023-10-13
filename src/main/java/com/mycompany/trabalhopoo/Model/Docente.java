
package com.mycompany.trabalhopoo.Model;

public class Docente extends Funcionario {
    private Chamado novo_chamado;

    // CONSTRUTOR PADRÃO VAZIO
    public Docente() {
        super();
    }

    // MÉTODO PARA EXCLUIR UM CHAMADO
    public Chamado excluirChamado(Chamado chamado) {

        return chamado;
    }

    // MÉTODO PARA EDITAR A DESCRICAO DE UM CHAMADO
    public void editarChamado(Chamado chamado, String novaDescricao) {

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
