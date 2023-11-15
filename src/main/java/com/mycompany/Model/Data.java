
package com.mycompany.Model;

public class Data {
    private String data; // STRING QUE ARMAZENA A DATA NO FORMATO "DIA/MÊS/ANO"
    private int dia;
    private int mes;
    private int ano;

    // CONSTRUTOR QUE ACEITA UMA DATA COMO ARGUMENTO NO FORMATO "DIA/MÊS/ANO"
    public Data(String data) {
        this.setData(data);
    }

    // CONSTRUTOR PADRÃO VAZIO
    public Data() {
        super();
    }

    // MÉTODO PARA VERIFICAR SE UMA DATA É VÁLIDA
    public boolean verificarData(String data) {
        String aux[] = data.split("/");
        if (aux.length < 3) {
            return false; // A DTA DEVE CONTER DIA, MÊS E ANO
        }

        int d = 0, m = 0, a = 0;
        d = (aux[0].length() == 1) ? Character.getNumericValue(aux[0].charAt(0))
                : Character.getNumericValue(aux[0].charAt(0)) * 10 + Character.getNumericValue(aux[0].charAt(1));
        m = (aux[1].length() == 1) ? Character.getNumericValue(aux[1].charAt(0))
                : Character.getNumericValue(aux[1].charAt(0)) * 10 + Character.getNumericValue(aux[1].charAt(1));
        a = (aux[2].length() == 4)
                ? Character.getNumericValue(aux[2].charAt(0)) * 1000 + Character.getNumericValue(aux[2].charAt(1)) * 100
                        + Character.getNumericValue(aux[2].charAt(2)) * 10 + Character.getNumericValue(aux[2].charAt(3))
                : 0;

        return (d >= 1 && d <= 31 && m >= 1 && m <= 12 && a >= 1920); // VERIFICA SE A DATA É VÁLIDA
    }

    // MÉTODO GETTER PARA OBTER A DATA ATUAL
    public String getData() {
        return data;
    }

    // MÉTODO SETTER PARA DEFINIR A DATA, VERIFICANDO SE É VÁLIDA
    public void setData(String data) {
        if (this.verificarData(data)) {
            this.data = data;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    // MÉTODO GETTER PARA OBTER O DIA DA DATA ATUAL
    public int getDia() {
        return dia;
    }

    // MÉTODO SETTER PARA DEFINIR O DIA, GARANTIDO QUE ESTEJA DENTRO DA FAIXA VÁLIDO
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    // MÉTODO GETTER PARA OBTER O MÊS DA DATA ATUAL
    public int getMes() {
        return mes;
    }

    // MÉTODO SETTER PARA DEFINIR O MÊS, GARANTIDO QUE ESTEJA DENTRO DA FAIXA VÁLIDA
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    // MÉTODO GETTER PARA OBTER O ANO DA DATA ATUAL
    public int getAno() {
        return ano;
    }

    // MÉTODO SETTER PARA DEFINIR O ANO, GARANTINDO QUE ESTEJA DENTRO DA FAIXA
    // VÁLIDA
    public void setAno(int ano) {
        if (ano >= 1920) {
            this.ano = ano;
        }
    }
}
