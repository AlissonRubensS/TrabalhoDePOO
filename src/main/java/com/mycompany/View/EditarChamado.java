package com.mycompany.View;

import java.util.Scanner;
import com.mycompany.Model.Chamado;
import com.mycompany.Model.Data;

public class EditarChamado {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        System.out.println("*******************************************************************");
        System.out.println("Bem-vindo(a) a opção de edição de chamados!");
        System.out.println("1. Criar chamado");
        System.out.println("2. Visualizar chamado");
        System.out.println("3. Editar chamado");
        System.out.println("4. Sair");
        System.out.println("*******************************************************************");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        Chamado chamado = null;

        switch (opcao) {
            case 1:
                criarChamado();
                break;
            case 2:
                visualizarChamado(chamado);
                break;
            case 3:
                editarChamado();
                break;
            case 4:
                System.out.println("Saindo do sistema. Até logo!");
                fecharScanner();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibirMenu();
        }
    }

   public static void criarChamado() {
    
    Chamado novoChamado = new Chamado(); 
    System.out.println("Digite os detalhes do novo chamado:");
    
    System.out.println("ID do novo chamado:");
    novoChamado.setId(scanner.nextInt());
    scanner.nextLine(); 

    System.out.println("Data do Chamado (no formato DIA/MÊS/ANO):");
    String dataChamadoInput = scanner.nextLine();

    Data dataChamado = new Data(dataChamadoInput);;
    novoChamado.setDataChamado(dataChamado);

    System.out.println("Novo chamado criado com sucesso!");
    exibirMenu();
}

    public static void visualizarChamado(Chamado chamado) {
        
        System.out.println("Detalhes do chamado:");
        System.out.println("ID: " + chamado.getId());
        System.out.println("Data do Chamado: " + chamado.getDataChamado());
        System.out.println("Local: " + chamado.getLocal());
        System.out.println("Objeto: " + chamado.getObjeto());
        System.out.println("Nova Descrição: " + chamado.getNovaDescricao());

        exibirMenu();
    }

    public static void editarChamado() {
        System.out.println("Digite o número do chamado que deseja editar:");
        int numeroChamado = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Realize as edições necessárias no chamado " + numeroChamado + ":");
    
        System.out.println("Chamado " + numeroChamado + " editado com sucesso!");
        exibirMenu();
    }

    public static void fecharScanner() {
        scanner.close();
    }
}
