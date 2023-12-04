package com.mycompany.View;

import java.util.*;

import com.mycompany.Controller.DocenteController;
import com.mycompany.Model.*;

public class DocenteView {
     
    private Scanner scanner;
    private Docente docente;

    public DocenteView(Docente docente, Scanner scanner){
        this.docente = docente;
        this.scanner = scanner;
    }

    public void areaDocente(){
        int escolha;
        try{
            docente.setListaChamados(DocenteController.carregar_chamado());
            do{

            System.out.println("*******************************************************************");
            System.out.println("          AREA DO DOCENTE         ");
            System.out.println("        Bem-vindo, Professor!      ");
            System.out.println("\nO que deseja?");
            System.out.println("1. Criar Chamado");
            System.out.println("2. Exibir Chamado");
            System.out.println("3. Editar Chamado");
            System.out.println("4. Excluir Chamado");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();     
            scanner.nextLine();
            System.out.println("*******************************************************************");    

            switch (escolha) {
                case 1:
                    Chamado novChamado = new Chamado();
                
                    System.out.println("\nCRIANDO UM CHAMADO\nPREENCHA OS DADOS");
                    
                    int id_cham = Funcionario.geraid();
                    if(Docente.verificarID(id_cham)==true){
                        System.out.println("ID ja existente!\n");
                        break;
                    }
                    novChamado.setId(id_cham);
                    
                    System.out.print("Data: ");
                    String data = scanner.nextLine();
                    Data dt = new Data(data);
                    if(Data.verificarData(data)==false){
                            System.out.println("Data invalida!\n");
                            break;
                    }
                    novChamado.setDataChamado(dt);
                    
                    System.out.print("Local: ");
                    String local = scanner.nextLine();
                    novChamado.setLocal(local);
                    
                    System.out.print("Objeto: ");
                    String objeto = scanner.nextLine();
                    novChamado.setObjeto(objeto);
                    
                    System.out.print("Descricao: ");
                    String descricao = scanner.nextLine();
                    novChamado.setNovaDescricao(descricao);

                    docente.adicionarChamado(novChamado);
                    System.out.println("Chamado adicionado com sucesso!\n");
                    break;

                case 2:
                    
                    System.out.println("\nEXIBINDO UM CHAMADO\nPROCURAR O CHAMADO");

                    ArrayList<String> chamadosStrings = docente.listarChamado();
                    for (String chamadoString : chamadosStrings) {
                        System.out.println(chamadoString);
                    }

                    break;

                case 3:
                    
                    System.out.println("\nEDITANDO UM CHAMADO\nPROCURAR O CHAMADO");
                    System.out.print("ID do chamado: ");
                    int id_cham1 = scanner.nextInt();
                    scanner.nextLine();

                    if(docente.exibirChamado(id_cham1)==null){
                        System.out.println("Chamado inexistente!\n");
                    }else{
            
                        System.out.println("\n"+docente.exibirChamado(id_cham1).getDetalhes());

                        System.out.println("\nEsse eh o chamado que deseja?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.println("Escolha uma opcao: ");
                        int escolha1 = scanner.nextInt();
                        scanner.nextLine();

                        if(escolha1==1){
                            System.out.println("\nEDITANDO UM CHAMADO\nPREENCHA OS NOVOS DADOS");

                            System.out.print("Data: ");
                            String data1 = scanner.nextLine();
                            Data dt1 = new Data(data1);
                            if(Data.verificarData(data1)==false){
                                System.out.println("Data invalida!\n");
                                break;
                            }
                            Data novaData = dt1;

                            System.out.print("Local: ");
                            String local1 = scanner.nextLine();
                            String novaLocal = local1;

                            System.out.print("Objeto: ");
                            String objeto1 = scanner.nextLine();
                            String novoObjeto = objeto1;

                            System.out.print("Descricao: ");
                            String descricao1 = scanner.nextLine();
                            String novaDescricao = descricao1;

                            docente.editarChamado(id_cham1, novaData, novaLocal, novoObjeto, novaDescricao);
                            System.out.println("Chamado editado com sucesso!\n");
                        
                        }else if(escolha1==2) {
                            areaDocente();
                        }else{
                            System.out.println("Opcao invalida. Tente novamente.\n");
                            areaDocente();
                        }
                    }
                    break;
                case 4:

                    System.out.println("\nEXCLUINDO UM CHAMADO\nPROCURAR O CHAMADO");
                    System.out.print("ID do chamado: ");
                    int id_cham2 = scanner.nextInt();
                    scanner.nextLine();

                    if(docente.exibirChamado(id_cham2)==null){
                        System.out.println("Chamado inexistente!\n");
                    }else{

                        System.out.println(docente.exibirChamado(id_cham2).getDetalhes());

                        System.out.println("\nEsse eh o chamado que deseja?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.println("Escolha uma opcao: ");
                        int escolha2 = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(escolha2==1){

                            docente.excluirChamado(id_cham2);
                            System.out.println("Chamado excluido com sucesso!\n");

                        }else if(escolha2==2) {
                            return;
                        }else{
                            System.out.println("Opcao invalida. Tente novamente.\n");
                            return;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...\n");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.\n");
                    break;
            }
            }while(escolha!=0);
        }catch(Exception e){
            System.out.println("ERRO: "+e.getMessage());
        }
        
    }
}
