
package com.mycompany.Model;

public class Chamado {
    private int id;
    private Data data_chamado;
    private String local;
    private String objeto;
    private String nova_descricao;

    public Chamado() {
        super();
    }
    public Chamado(Chamado chamado){
        if(chamado!=null){
            this.id = chamado.id;
            this.data_chamado = chamado.data_chamado;
            this.local = chamado.local;
            this.objeto = chamado.objeto;
            this.nova_descricao = chamado.nova_descricao;
        }
    }

    // CONSTRUTOR QUE RECEBE OS DADOS DO CHAMADO COMO ARGUMENTO
    public Chamado(int id, Data data_chamado, String local, String objeto, String nova_descricao) {
        this.setId(id);
        this.setDataChamado(data_chamado);
        this.setLocal(local);
        this.setObjeto(objeto);
        this.setNovaDescricao(nova_descricao);
    }

    public String toString(){
        return (id + "-=-" + data_chamado + "-=-" + local + "-=-" + objeto + "-=-" + nova_descricao);
    }

    // MÉTODO GETTER PARA OBTER O IDENTIFICADOR DO CHAMADO
    public int getId() {
        return id;
    }

    // MÉTODO SETTER PARA DEFINIR O IDENTIFICADOR DO CHAMADO
    public void setId(int id) {
        this.id = id;
    }

    // MÉTODO GETTER PARA OBTER A DATA DO CHAMADO
    public Data getDataChamado() {
        return data_chamado;
    }

    // MÉTODO SETTER PARA DEFINIR A DATA DO CHAMADO

    public void setDataChamado(Data data_chamado) {
        this.data_chamado = data_chamado;
    }

    // MÉTODO GETTER PARA OBTER O LOCAL DO CHAMADO

    public String getLocal() {
        return local;
    }

    // MÉTODO SETTER PARA DEFINIR O LOCAL DO CHAMADO

    public void setLocal(String local) {
        if (local != null) {
            this.local = local;
        }
    }

    // MÉTODO GETTER PARA OBTER O OBJETO DO CHAMADO

    public String getObjeto() {
        return objeto;
    }

    // MÉTODO SETTER PARA DEFINIR O OBJETO DO CHAMADO

    public void setObjeto(String objeto) {
        if (objeto != null) {
            this.objeto = objeto;
        }
    }

    // MÉTODO GETTER PARA OBTER A NOVA DESCRIÇÃO DO CHAMADO

    public String getNovaDescricao() {
        return nova_descricao;
    }

    // MÉTODO SETTER PARA DEFINIR A NOVA DESCRIÇÃO DO CHAMADO

    public void setNovaDescricao(String nova_descricao) {
        if (nova_descricao != null) {
            this.nova_descricao = nova_descricao;
        }
    }

    public String getDetalhes() {
        return "ID do Chamado: "+getId()+"\nData do chamado: "+getDataChamado().getDia()+"/"+getDataChamado().getMes()+"/"+getDataChamado().getAno()+"\nLocal: "+getLocal()+"\nObjeto: "+getObjeto()+"\nDescricao: "+getNovaDescricao();
    }
    public Requisicao getRequisicao() {
        return null;
    }
    public void setStatus(String string) {
    }
    public void setRequisicao(Requisicao novaRequisicao) {
    }
    
}
