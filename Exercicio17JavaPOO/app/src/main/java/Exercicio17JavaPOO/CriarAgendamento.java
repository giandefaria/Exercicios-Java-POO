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
public class CriarAgendamento extends DadosGeraisAgendamento {
    
    private int indice = 0;
    DadosGeraisAgendamento dadosAgendamento[] = new DadosGeraisAgendamento[99];
    
    public CriarAgendamento(){
        super();
    }
    
    public void novoAgendamento(){
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaRepetir == 's' || desejaRepetir == 'S'){
            
            
            System.err.println("Deseja criar um novo agendamento?");  
        }
        
    }
    
}
