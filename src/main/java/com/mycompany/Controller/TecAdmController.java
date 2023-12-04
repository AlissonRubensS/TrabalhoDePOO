package com.mycompany.Controller;

import java.util.ArrayList;

import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;
import com.mycompany.Model.Requisicao;
import com.mycompany.Model.Funcionario;

public class TecAdmController {
    public static void cadastrar_chamado(Chamado chamado){
        File.write("src\\main\\java\\com\\mycompany\\Database\\Chamado.txt", chamado.toString());

    }

    public static void cadastrar_requisicao(Requisicao requisicao){
        File.write("src\\main\\java\\com\\mycompany\\Database\\Requisicoes.txt", requisicao.toString());

    }

    public static ArrayList<Chamado> carregar_chamado(){
        ArrayList<Chamado> listaChamados = new ArrayList<Chamado>();
        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Database\\Chamado.txt");

        for (String linha : linhas) {
            String[] aux = linha.split("-=-");

            Chamado chamado = new Chamado();
            chamado.setId(Integer.parseInt(aux[0]));

            Data data = new Data(aux[1]);
            chamado.setDataChamado(data);
            
            chamado.setLocal(aux[2]);
            chamado.setObjeto(aux[3]);
            chamado.setNovaDescricao(aux[4]);
            
            listaChamados.add(chamado);
        }
public Requisicao getRequisicao(int id){

    ArrayList <String> content = File.read("../Database/Requisicao.txt");
    for (int i = 0; i<content.size(); i++){
        String id2String[] = content.get(i).split("-=-");
        if (id==Integer.parseInt(id2String[0])) {
            for(String line : content){
                String[] aux = line.split("-=-");
                
                Requisicao tempreq = new Requisicao();
                tempreq.setId(Integer.parseInt(aux[0]));
                Data data = new Data(aux[1]);
                tempreq.setData_requisicao(data);

                tempreq.setLocal(aux[2]);
                tempreq.setObjeto(aux[3]);
                tempreq.setStatus(aux[4]);
                tempreq.setNivelUrgencia(aux[5]);

                return tempreq;
            }
        }
    }
    return null;
}
    public static ArrayList<Requisicao> carregar_requisicoes(){
        ArrayList<Requisicao> listaRequicicoes = new ArrayList<Requisicao>();
        ArrayList<String> linhas = File.read("src\\main\\java\\com\\mycompany\\Database\\Requisicoes.txt");

        for (String linha : linhas) {
            String[] aux = linha.split("-=-");
            Requisicao requisicao = new Requisicao();
            requisicao.setId(Funcionario.geraid());

            Data data = new Data(aux[1]);
            requisicao.setData_requisicao(data);
            
            requisicao.setLocal(aux[2]);
            requisicao.setObjeto(aux[3]);
            requisicao.setStatus(aux[4]);
            requisicao.setNivelUrgencia(aux[5]);
            
            listaRequicicoes.add(requisicao);

        }

        return listaRequicicoes;
    }
}
