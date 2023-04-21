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
    
    private int indice = 0;
    DadosGeraisAgendamento dadosAgendamento[] = new DadosGeraisAgendamento[99];
    
    public CriarAgenda(){
       
    }
    
    public void novoAgendamento(){
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Informe o tipo de agendamento: 1 - reuniao, 2 - pagamento, 3 - entrega de projeto");
            int tipo = leitor.nextInt();
            
            switch(tipo){
                case 1 -> {
                    
                }
                case 2 -> {
                
                }
                case 3 -> {
                
                }
                default -> System.out.println("Valor inválido");
            }
            
            System.out.println("Deseja criar um novo agendamento?");  
        }
        
    }
    
}
