
package com.mycompany.trabalhopoo.Model;

public class Docente extends Funcionario{
    private Chamado novo_chamado;
    
    public Chamado excluirChamado(Chamado id){
        return id;
    }
    public void editarChamado(Chamado id){
        
    }

    public Docente(){
        super();
    }

    public Chamado getNovo_chamado() {
        return novo_chamado;
    }

    public void setNovo_chamado(int id, Data data_chamado, String local, String objeto, String nova_descricao) {
        Chamado novo_chamado = new Chamado();
    }
    
    
}
