
package com.mycompany.Model;

public class Docente extends Funcionario {
    public Docente(){
        super();
    }
    public String getDetalhesDocente() {
        return "Nome: "+getNome()+"\nCargo: "+getCargo()+"\nEmail: "+getEmail();
    }
}
