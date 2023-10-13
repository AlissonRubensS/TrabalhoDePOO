
package com.mycompany.trabalhopoo.Model;

public class Chamado {
    private int id;
    private Data data_chamado;
    private String local;
    private String objeto;
    private String descricao;

    public Chamado(){
        super();
    }
    
    public Chamado(int id, Data data_chamado, String local, String objeto, String nova_descricao){
        this.setId(id);
        this.setDataChamado(data_chamado);
        this.setLocal(local);
        this.setObjeto(objeto);
        this.setDescricao(nova_descricao);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData_chamado() {
        return data_chamado;
    }

    public void setDataChamado(Data data_chamado) {
        this.data_chamado.setDia(data_chamado.getDia());
        this.data_chamado.setMes(data_chamado.getMes());
        this.data_chamado.setAno(data_chamado.getAno());
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if(local != null){
            this.local = local;
        }
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        if(objeto != null){
            this.objeto = objeto;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null){
            this.descricao = descricao;
        }
    }
}
