
package com.mycompany.trabalhopoo.Model;

public class Requisicao {
    private int id;
    private Data data_requisicao;
    private String local;
    private String objeto;
    private String status;
    private String nivel_urgencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData_requisicao() {
        return data_requisicao;
    }

    public void setData_requisicao(Data data_requisicao) {
        data_requisicao.setData(data_requisicao.getData());
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == "Pedente" || status == "Andamento" || status == "Concluido") {
            this.status = status;
        }
    }

    public String getNivelUrgencia() {
        return nivel_urgencia;
    }

    public void setNivelUrgencia(String nivel_urgencia) {
        this.nivel_urgencia = nivel_urgencia;
    }
}
