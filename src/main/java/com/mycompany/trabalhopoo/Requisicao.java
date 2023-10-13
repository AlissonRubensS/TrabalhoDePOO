/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
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
        this.data_requisicao = data_requisicao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNivelUrgencia() {
        return nivel_urgencia;
    }

    public void setNivelUrgencia(String nivel_urgencia) {
        this.nivel_urgencia = nivel_urgencia;
    }
}
