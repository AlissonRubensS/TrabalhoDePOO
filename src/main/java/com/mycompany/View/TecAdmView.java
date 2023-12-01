package com.mycompany.View;

import java.util.Scanner;
import com.mycompany.Model.TecAdm;
import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;

public class TecAdmView {

    private TecAdm tecAdm;
    private Scanner scanner;

    public TecAdmView(TecAdm tecAdm, Scanner scanner) {
        this.tecAdm = tecAdm;
        this.scanner = scanner;
    }

    public void mostrarOpcoes() {
        try {
            int opcao;

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
                        try {
                            tecAdm.finalizarChamado(tecAdm.getChamado());
                            System.out.println("Chamado finalizado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao finalizar chamado: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            String feedback = tecAdm.feedbackChamado(tecAdm.getChamado());
                            System.out.println("Feedback do chamado:\n" + feedback);
                        } catch (Exception e) {
                            System.out.println("Erro ao obter feedback do chamado: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            tecAdm.criarRequisicao(tecAdm.getChamado());
                            System.out.println("Requisição criada com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao criar requisição: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Informe a nova data da requisição (no formato DIA/MÊS/ANO):");
                        String novaDataInput = scanner.nextLine();

                        try {
                            if (Data.verificarData(novaDataInput)) {
                                Data novaData = new Data(novaDataInput);
                                tecAdm.editarRequisicao(novaData, "novoLocal", "novoObjeto", "novoNivelUrgencia", tecAdm.getChamado().getRequisicao());
                                System.out.println("Requisição editada com sucesso!");
                            } else {
                                System.out.println("Data inválida. Tente novamente.");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao editar requisição: " + e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            Chamado chamadoAtualizado = tecAdm.excluirRequisicao(tecAdm.getChamado());
                            tecAdm.setChamado(chamadoAtualizado);
                            System.out.println("Requisição excluída com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao excluir requisição: " + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (opcao != 0);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
