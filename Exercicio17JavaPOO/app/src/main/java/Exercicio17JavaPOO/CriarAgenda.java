/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio17JavaPOO;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CriarAgenda {
    
    private int indice = 1;
    DadosGeraisAgendamento dadosAgendamento[] = new DadosGeraisAgendamento[99];
    Scanner leitor = new Scanner(System.in);
    public CriarAgenda(){
       
    }
    
    public void novoAgendamento(){
        
        char desejaRepetir = 's';
        
        
        while(desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Informe o tipo de agendamento: 1 - reuniao, 2 - pagamento, 3 - entrega de projeto");
            int tipo = leitor.nextInt();
            leitor.nextLine();
            
            if(tipo == 1 || tipo == 2 || tipo == 3) {
                System.out.println("Informe o nome do participante");
                String nome = leitor.nextLine();
                
                System.out.println("Informe o número de telefone");
                String telefone = leitor.nextLine();
                
                System.out.println("Descreva o agendamento");
                String descricao = leitor.nextLine();
                
                System.out.println("Digite o dia do agendamento");
                int dia = leitor.nextInt();
                
                System.out.println("Digite o mes do agendamento");
                int mes = leitor.nextInt();
                
                System.out.println("Digite o ano do agendamento");
                int ano = leitor.nextInt();
                leitor.nextLine();
                
                switch (tipo) {
                    case 1 -> dadosAgendamento[indice] = new DadosGeraisAgendamento("Reuniao", nome, telefone, descricao, dia, mes, ano);
                    case 2 -> dadosAgendamento[indice] = new DadosGeraisAgendamento("Pagamento", nome, telefone, descricao, dia, mes, ano);
                    default -> dadosAgendamento[indice] = new DadosGeraisAgendamento("Entrega de Projeto", nome, telefone, descricao, dia, mes, ano);
                }

                indice++;
            }else{
                System.out.println("Valor inválido");
            }
            
            System.out.println("Deseja criar um novo agendamento? S - sim, N - nao");
            desejaRepetir = leitor.nextLine().charAt(0);
            
        }
        
    }
    
    public void exibirTodosAgendamentos(){
        int i = 1;       
        while(i < this.indice){ 
            informacoesDoAgendamento(i);
            i++;
        }
    }

    private void informacoesDoAgendamento(int indice) {
        System.out.println("Numero do agendamento: " + indice);
        System.out.println("Data do agendamento: " + dadosAgendamento[indice].getDataAgendamento());
        System.out.println("Tipo de agendamento: " + dadosAgendamento[indice].getTipo());
        System.out.println("Nome do participante: " + dadosAgendamento[indice].getNome());
        System.out.println("Telefone do participante: " + dadosAgendamento[indice].getTelefone());
        System.out.println("Descricao do agendamento: " + dadosAgendamento[indice].getDescricao() + "\n");
    }
    
    public void alterarCompromisso() {
        exibirTodosAgendamentos();
        //perguntar o que deseja alterar e adicionar as opções
        System.out.println("Qual agendamento deseja alterar? ");
        int agendamentoSelecionado = leitor.nextInt();
        
        if(agendamentoSelecionado < this.indice){
            System.out.println("Agendamento " + agendamentoSelecionado + "selecionado");
            informacoesDoAgendamento(agendamentoSelecionado);
            System.out.println("""                               
                                O que deseja alterar? 
                                Digite 1 para alterar a data 
                                Digite 2 para alterar o Tipo de agendamento 
                                Digite 3 para alterar o nome do participante 
                                Digite 4 para alterar o telefone do participante 
                                Digite 5 para alterar a descricao do agendamento """);
            int escolha = leitor.nextInt();
            leitor.nextLine();
            int repete = 1;
            while(repete == 1){
                switch (escolha) {
                    case 1 -> {
                        System.out.println("Digite o dia");
                        int dia = leitor.nextInt();
                        System.out.println("Digite o mes");
                        int mes = leitor.nextInt();
                        System.out.println("Digite o ano");
                        int ano = leitor.nextInt();
                        dadosAgendamento[agendamentoSelecionado].setDataAgendamento(dia, mes, ano);
                        leitor.nextLine();
                    }
                    case 2 -> { 
                        System.out.println("Informe o tipo de agendamento: 1 - reuniao, 2 - pagamento, 3 - entrega de projeto");
                        int novoTipoAgendamento = leitor.nextInt();
                        leitor.nextLine();
                        switch(novoTipoAgendamento){
                            case 1 -> dadosAgendamento[agendamentoSelecionado].setTipo("Reuniao");
                            case 2 -> dadosAgendamento[agendamentoSelecionado].setTipo("Pagamento");
                            default -> dadosAgendamento[agendamentoSelecionado].setTipo("Entrega de Projeto");               
                        }
                    }
                    case 3 -> {
                        System.out.println("Digite o nome do participante:");
                        String novoParticipante = leitor.nextLine();
                        dadosAgendamento[agendamentoSelecionado].setNome(novoParticipante);
                    }
                    case 4 -> {
                        System.out.println("Digite o número de telefone do participante");
                        String novoTelefone = leitor.nextLine();
                        dadosAgendamento[agendamentoSelecionado].setTelefone(novoTelefone);                   
                    }
                    case 5 ->{
                        System.out.println("Digite a descrição do agendamento");
                        String novaDescricao = leitor.nextLine();
                        dadosAgendamento[agendamentoSelecionado].setDescricao(novaDescricao);
                    }

                    default -> { System.out.println("Valor inválido");}

                }   
            }
            informacoesDoAgendamento(agendamentoSelecionado);
        }else {
            System.out.println("Agendamento não existente. Digite outro número");
        }
    }
    
}
