/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
public class Chamado {
    private int id;
    private Data data_chamado;
    private String local;
    private String objeto;
    private Categoria tipo_chamdo;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData_chamado() {
        return data_chamado;
    }

    public void setData_chamado(Data data_chamado) {
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

    public Categoria getTipo_chamdo() {
        return tipo_chamdo;
    }

    public void setTipo_chamdo(Categoria tipo_chamdo) {
        this.tipo_chamdo = tipo_chamdo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
