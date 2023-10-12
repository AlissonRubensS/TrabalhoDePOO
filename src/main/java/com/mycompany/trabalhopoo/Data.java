/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author Adailton
 */
public class Data {
    private String data;
    private int dia;
    private int mes;
    private int ano;
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        String aux[] = data.split("/");
        if (aux.length < 3) {
            return;
        }
        
        int dia = 0, mes = 0, ano = 0;
        dia = (aux[0].length() == 1)?Character.getNumericValue(aux[0].charAt(0)) : Character.getNumericValue(aux[0].charAt(0)) * 10 + Character.getNumericValue(aux[0].charAt(1));
        mes = (aux[1].length() == 1)?Character.getNumericValue(aux[1].charAt(0)) : Character.getNumericValue(aux[1].charAt(0)) * 10 + Character.getNumericValue(aux[1].charAt(1));
        ano = (aux[2].length() == 4)?Character.getNumericValue(aux[2].charAt(0)) * 1000 + Character.getNumericValue(aux[2].charAt(1)) * 100 + Character.getNumericValue(aux[2].charAt(2)) * 10 + Character.getNumericValue(aux[2].charAt(3)): 0 ;
        
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1920) {
            this.data = data;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public Data(String data) {
        this.setData(data);
    }
    
    public Data(){
        super();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano >= 1920){
            this.ano = ano;
        }
    }
    
    
    
}
