package com.mycompany.View;

import java.util.*;
import com.mycompany.Model.*;

import com.mycompany.Controller.*;
import com.mycompany.Model.*;

public class DocenteView {
    private Docente docente; // Model
    Scanner scanner;
    
    public DocenteView(Docente docente){
        this.docente = docente;
    }

    public void areaDocente(){
        
        String usuarioCorreto = "docente", senhaCorreta = "246";
        System.out.println("AREA DO DOCENTE");
        
        do{
            
            System.out.print("\nDigite seu nome de usuário: ");
            String usuarioDig = scanner.nextLine();
            
            System.out.print("\nDigite sua senha: ");
            String senhaDig = scanner.nextLine();
            
            if (usuarioDig.equals(usuarioCorreto) && senhaDig.equals(senhaCorreta)) {
                int escolha;
                do{
                    System.out.println("Login bem-sucedido!\nBem-vindo, Professsor!");
                    System.out.println("\nO que deseja?");
                    System.out.println("1. Criar Chamado");
                    System.out.println("2. Editar Chamado");
                    System.out.println("3. Excluir Chamado");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opcao: ");
                    escolha = scanner.nextInt();                    
                   
                    if(escolha==1){
                        Chamado novChamado = new Chamado();
                        
                        System.out.println("\nCRIANDO UM CHAMADO\nPREENCHA OS DADOS");
                        
                        System.out.print("ID do seu chamado: ");
                        int id_cham = scanner.nextInt();
                        novChamado.setId(id_cham);
                        
                        System.out.print("Data: ");
                        String data = scanner.nextLine();
                        Data dt = new Data(data);
                        if(dt.verificarData(data)==false){
                            System.out.println("Data invalida!");
                            areaDocente();
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
                        areaDocente();
                    
                    }if(escolha==2){
                       
                        System.out.println("\nEDITANDO UM CHAMADO\nPROCURAR O CHAMADO");
                       
                        System.out.print("ID do chamado: ");
                        int id_cham = scanner.nextInt();
                        docente.exibirChamado(id_cham);
                        
                        System.out.print("Esse eh o Chamado que deseja?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.print("Escolha uma opcao: ");
                        int escolha1 = scanner.nextInt();
                        
                        if(escolha1!=1||escolha1!=2) {
                            
                            System.out.println("Opcao incorreta!\n");
                            areaDocente();
                        
                        }else if(escolha1==1){
                        
                            System.out.println("\nEDITANDO UM CHAMADO\nPREENCHA OS NOVOS DADOS");
                            
                            System.out.print("Data: ");
                            String data1 = scanner.nextLine();
                            Data dt1 = new Data(data1);
                            if(dt1.verificarData(data1)==false){
                                System.out.println("Data invalida!");
                                areaDocente();
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
                            
                            docente.editarChamado(id_cham, novaData, novaLocal, novoObjeto, novaDescricao);
                            System.out.println("Chamado editado com sucesso!\n");
                            areaDocente();
                        }else{
                            return;
                        }
                    }if(escolha==3){
                        
                        System.out.println("\nEXCLUINDO UM CHAMADO\nPROCURAR O CHAMADO");
                        
                        System.out.print("ID do chamado: ");
                        int id_cham = scanner.nextInt();
                        docente.exibirChamado(id_cham);
                        
                        System.out.print("Esse eh o Chamado que deseja?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.print("Escolha uma opcao: ");
                        int escolha1 = scanner.nextInt();
                        
                        if(escolha1!=1||escolha1!=2) {
                        
                            System.out.println("Opcao incorreta!\n");
                            return;
                        
                        }else if(escolha1==1){
                        
                            System.out.println("\nEXCLUINDO UM CHAMADO\nPREENCHA OS NOVOS DADOS");
                            Chamado d1 = docente.excluirChamado(id_cham);
                            System.out.println("Chamado editado com sucesso!\n");
                            System.out.println("Esse foi o Chamado excluido: ");
                            System.out.println(d1.getDetalhes()+"\n");
                            areaDocente();
                       
                        }else{
                            return;
                        }
                    }if(escolha==0){
                    
                        System.out.println("Saindo do programa...\n");
                        break;
                    
                    }else{
                    
                        System.out.println("Opção inválida.");
                        return;
                    
                    }
                }while(escolha!=0&&escolha!=1&&escolha!=2);
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
                return;
            }
        }while(true);
    }
}
