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
    
    public CriarAgenda(){
       
    }
    
    public void novoAgendamento(){
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
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
    
    public void informacoesAgendamento(){
        int i = 1;       
        while(i <= this.indice){ 
            System.out.println("Numero do agendamento: " + i);
            System.out.println("Data do agendamento: " + dadosAgendamento[indice].getDataAgendamento());
            System.out.println("Tipo de agendamento: " + dadosAgendamento[indice].getTipo());
            System.out.println("Nome do participante: " + dadosAgendamento[indice].getNome());
            System.out.println("Telefone do participante: " + dadosAgendamento[indice].getTelefone());
            System.out.println("Descricao do agendamento: " + dadosAgendamento[indice].getDescricao() + "\b");
            i++;
        }
    }
    
}
