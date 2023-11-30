package com.mycompany.View;

import java.util.Scanner;
import com.mycompany.Model.TecAdm;
import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;


public class TecAdmMenu {

    private TecAdm tecAdm;
    private Scanner scanner;

    public TecAdmMenu(TecAdm tecAdm, Scanner scanner) {
        this.tecAdm = tecAdm;
        this.scanner = scanner;
    }

    public void mostrarOpcoes() {
            int opcao;
        try{
            do {
                System.out.println("*******************************************************************");
                System.out.println("Escolha uma opção:");
                System.out.println("1. Finalizar chamado");
                System.out.println("2. Feedback do chamado");
                System.out.println("3. Criar Requisição");
                System.out.println("4. Editar Requisição");
                System.out.println("5. Excluir Requisição");
                System.out.println("0. Sair");
                System.out.println("*******************************************************************");

                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        tecAdm.finalizarChamado(tecAdm.getChamado());
                        break;
                    case 2:
                        String feedback = tecAdm.feedbackChamado(tecAdm.getChamado());
                        System.out.println(feedback);
                        break;
                    case 3:
                        tecAdm.criarRequisicao(tecAdm.getChamado());
                        break;
                        case 4:
                        System.out.println("Informe a nova data da requisição (no formato DIA/MÊS/ANO):");
                        String novaDataInput = scanner.nextLine();
                    
                        if (Data.verificarData(novaDataInput)) {
                            Data novaData = new Data(novaDataInput);
                            tecAdm.editarRequisicao(novaData, "novoLocal", "novoObjeto", "novoNivelUrgencia", tecAdm.getChamado().getRequisicao());
                        } else {
                            System.out.println("Data inválida. Tente novamente.");
                        }
                        break;
                    case 5:
                        Chamado chamadoAtualizado = tecAdm.excluirRequisicao(tecAdm.getChamado());
                        tecAdm.setChamado(chamadoAtualizado);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (opcao != 0);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
