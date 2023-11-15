
package com.mycompany.Model;

public class Docente extends Funcionario {
    private Chamado novo_chamado;

    // CONSTRUTOR PADRÃO VAZIO
    public Docente(Chamado chamado) {
        super();
        this.novo_chamado = chamado;
    }
    // GETTER PARA OBTER O NOVO CHAMADO
    public Chamado getNovo_chamado() {
        return novo_chamado;
    }

    // SETTER PARA DEFINIR O NOVO CHAMADO
    public void setNovo_chamado(Chamado chamado) {
        this.novo_chamado = chamado;
    }

    public String getDetalhes() {
        return "ID do Chamado: "+novo_chamado.getId()+"\nData do Chamado: "+novo_chamado.getDataChamado()+"\nObjeto: "+novo_chamado.getObjeto()+"\nLocal: "+novo_chamado.getLocal()+"\nDescricao: "+novo_chamado.getNovaDescricao();
    }
}
