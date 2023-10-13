package com.mycompany.trabalhopoo.Model;

class CPF {
    private int cpf[] = new int[11];
    
    public CPF(String cpf){
        this.setCpf(cpf);
    }
    
    public CPF(){
        super();
    }
    
    public boolean isCpfValido(String cpf){
        if (cpf.length() != 11) {
            return false;
        }
        
        int[] digitos = new int[11];
        digitos = this.cpfString2Array(cpf);
        int soma1 = 0, soma2 = 0;
        
        for(int i = 0; i < 9; i++){
            soma1 = soma1 + (digitos[i] * (10-i));
        }
        for(int j = 0; j < 10; j++){
            soma2 += digitos[j] * (11-j);
        }
        
        int resto1 = soma1%11, resto2 = soma2%11;
        int d1 = (resto1 == 0 || resto1 == 1)? 0: 11 - resto1;
        int d2 = (resto2 == 0 || resto2 == 1)? 0: 11 - resto2;
        return (digitos[9] == d1 && digitos[10] == d2);
    }
    
    public int[] cpfString2Array(String cpf){
        int aux[] = new int[11];
        for (int i = 0; i < 11; i++) {
            aux[i] = Character.getNumericValue(cpf.charAt(i));
        }
        return aux;
    }

    public int[] getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf){
        if (cpf.length() == 11 && this.isCpfValido(cpf)) {
            this.cpf = this.cpfString2Array(cpf);
        }
    }
}
