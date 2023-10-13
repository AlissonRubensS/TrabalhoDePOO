
package com.mycompany.trabalhopoo.Model;

public class Requisicao {
    private int id;
    private Data data_requisicao;
    private String local;
    private String objeto;
    private String status;
    private String nivel_urgencia;

    // GETTER PARA OBTER O ID
    public int getId() {
        return id;
    }

    // SETTER PARA DEFINIR O ID
    public void setId(int id) {
        this.id = id;
    }

    // GETTER PARA OBTER A DATA DE REQUISIÇÃO
    public Data getData_requisicao() {
        return data_requisicao;
    }

    // SETTER PARA DEFINIR A DATA DE REQUISIÇÃO
    public void setData_requisicao(Data data_requisicao) {
        this.data_requisicao = data_requisicao;
    }

    // GETTER PARA OBTER O LOCAL
    public String getLocal() {
        return local;
    }

    // SETTER PARA DEFINIR O LOCAL
    public void setLocal(String local) {
        if (local != null) {
            this.local = local;
        }
    }

    // GETTER PARA OBTER O OBJETO
    public String getObjeto() {
        return objeto;
    }

    // SETTER PARA DEFINIR O OBJETO
    public void setObjeto(String objeto) {
        if (objeto != null) {
            this.objeto = objeto;
        }
    }

    // GETTER PARA OBTER O STATUS
    public String getStatus() {
        return status;
    }

    // SETTER PARA DEFINIR O STATUS COM VALIDAÇÃO
    public void setStatus(String status) {
        if ("Pendente".equals(status) || "Andamento".equals(status) || "Concluido".equals(status)) {
            this.status = status;
        }
    }

    // GETTER PARA OBTER O NÍVEL DE URGÊNCIA
    public String getNivelUrgencia() {
        return nivel_urgencia;
    }

    // SETTER PARA DEFINIR O NÍVEL DE URGÊNCIA
    public void setNivelUrgencia(String nivel_urgencia) {
        this.nivel_urgencia = nivel_urgencia;
    }
}
