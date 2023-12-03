
package com.mycompany.Model;

public class Requisicao {
    private int id;
    private Data data_requisicao;    
    private String local;
    private String objeto;
    private String status;
    private String nivel_urgencia;

    public Requisicao(int id, Data data_requisicao, String local, String objeto, String status, String nivel_urgencia){
        this.setId(id);
        this.setData_requisicao(data_requisicao);
        this.setLocal(local);
        this.setObjeto(objeto);
        this.setStatus(status);
        this.setNivelUrgencia(nivel_urgencia);
    }

    public Requisicao() {
    }

    private void setId(int id2) {
    }

    // GETTER PARA OBTER O ID
    public int getIdRequisicao() {
        return id;
    }

    // SETTER PARA DEFINIR O ID
    public void setIdRequisicao(int id) {
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
        if ("Imediato".equals(nivel_urgencia) || "Relevante".equals(nivel_urgencia) || "Pouco relevante".equals(nivel_urgencia)) {
            this.nivel_urgencia = nivel_urgencia;
        }
    }

    public int getId() {
        return 0;
    }
}
