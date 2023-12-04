package com.mycompany.View;

import java.util.List;
import java.util.Scanner;

import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;
import com.mycompany.Model.Requisicao;
import com.mycompany.Model.TecAdm;

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
                System.out.println("1. Mostrar Lista de Chamados");
                System.out.println("2. Mostrar Lista de Requisições");
                System.out.println("3. Criar Requisição");
                System.out.println("4. Editar Requisição");
                System.out.println("5. Excluir Requisição");
                System.out.println("6. Finalizar chamado");
                System.out.println("7. Feedback do chamado");
                System.out.println("0. Sair");
                System.out.println("*******************************************************************");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        List<Chamado> listaChamados = tecAdm.getChamados();
                        System.out.println("Lista de Chamados:");
                        for (Chamado chamado : listaChamados) {
                            System.out.println(chamado);
                        }
                        break;
                    case 2:
                        List<Requisicao> listaRequisicoes = tecAdm.getRequisicoes();
                        System.out.println("Lista de Requisições:");
                        for (Requisicao requisicao : listaRequisicoes) {
                            System.out.println(requisicao);
                        }
                        break;
                    case 3:
                        try {

                            System.out.println("Informe o ID do chamado para gerar uma requisicao:");
                            int idChamado = scanner.nextInt();
                            scanner.nextLine();
                            
                            System.out.println("Informe a data da requisição (no formato DIA/MÊS/ANO):");
                            String dataRequisicaoInput = scanner.nextLine();

                            System.out.println("Informe o local da requisição:");
                            String localRequisicao = scanner.nextLine();

                            System.out.println("Informe o objeto da requisição:");
                            String objetoRequisicao = scanner.nextLine();

                            System.out.println("Escolha o status da requisição");
                            System.out.println("1. Pendente");
                            System.out.println("2. Andamento");
                            System.out.println("3. Concluido");

                            int statusInt = scanner.nextInt();
                            String statuString;
                            scanner.nextLine();
                            switch (statusInt) {
                            case 1:
                                statuString = "Pendente";
                                break;
                            case 2:
                                statuString = "Andamento";
                                break;
                            case 3:
                                statuString = "Concluido";
                                break;
                        
                            default:
                                statuString = null;
                                break;
                            }

                            System.out.println("Defina o nivel de urgencia da requisição");
                            System.out.println("1. Imediato");
                            System.out.println("2. Relevante");
                            System.out.println("3. Pouco relevante");

                            int urgenciaInt = scanner.nextInt();
                            scanner.nextLine();
                            String urgenciaString;
                            switch (urgenciaInt) {
                            case 1:
                                urgenciaString = "Imediato";
                                break;
                            case 2:
                                urgenciaString = "Relevante";
                                break;
                            case 3:
                                urgenciaString = "Pouco relevante";
                                break;
                        
                            default:
                                urgenciaString = null;
                                break;
                            }

                            if (Data.verificarData(dataRequisicaoInput)) {
                                Data dataRequisicao = new Data(dataRequisicaoInput);
                                tecAdm.criarRequisicao(idChamado, dataRequisicao, localRequisicao, objetoRequisicao, statuString, urgenciaString);
                                System.out.println("Requisição criada com sucesso!");
                            } else {
                                System.out.println("Data inválida. Tente novamente.");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao criar requisição: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Informe o ID da requisição a ser editada:");
                            int idRequisicaoEditar = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Informe a nova data da requisição (no formato DIA/MÊS/ANO):");
                            String novaDataInput = scanner.nextLine();

                            System.out.println("Informe o novo local da requisição:");
                            String novoLocalRequisicao = scanner.nextLine();

                            System.out.println("Informe o novo objeto da requisição:");
                            String novoObjetoRequisicao = scanner.nextLine();

                            System.out.println("Informe o novo status da requisição:");
                            String novoStatusRequisicao = scanner.nextLine();

                            System.out.println("Informe o novo nível de urgência da requisição:");
                            String novoNivelUrgenciaRequisicao = scanner.nextLine();

                            if (Data.verificarData(novaDataInput)) {
                                Data novaData = new Data(novaDataInput);
                                tecAdm.editarRequisicao(idRequisicaoEditar, novaData, novoLocalRequisicao,
                                        novoObjetoRequisicao, novoStatusRequisicao, novoNivelUrgenciaRequisicao);
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
                            System.out.println("Informe o ID do chamado para excluir a requisição:");
                            int idChamadoExcluirRequisicao = scanner.nextInt();
                            scanner.nextLine();
                            tecAdm.excluirRequisicao(idChamadoExcluirRequisicao);
                            System.out.println("Requisição excluída com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao excluir requisição: " + e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Informe o ID do chamado a ser finalizado:");
                            int idChamado = scanner.nextInt();
                            scanner.nextLine();
                            tecAdm.finalizarChamado(idChamado);
                            System.out.println("Chamado finalizado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao finalizar chamado: " + e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            System.out.println("Informe o ID do chamado para obter feedback:");
                            int idChamadoFeedback = scanner.nextInt();
                            scanner.nextLine();
                            String feedback = tecAdm.feedbackChamado(idChamadoFeedback);
                            System.out.println("Feedback do chamado:\n" + feedback);
                        } catch (Exception e) {
                            System.out.println("Erro ao obter feedback do chamado: " + e.getMessage());
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
