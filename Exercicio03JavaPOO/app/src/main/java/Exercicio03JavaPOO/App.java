/*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 */
package Exercicio03JavaPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        char tipoCombustivel;
        double valorLitro;
        double quantidadeNaBomba;
        int opcao;
        
        char desejaContinuar = 'S';
        
        Scanner leitor = new Scanner(System.in);
        
        BombaCombustivel bombaCombustivel = new BombaCombustivel('G', 5.23, 1000);
        
        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            
            System.out.println("""
                               Digite a opcao desejada: 
                               1 - Abastecer por valor, 
                               2 - abastecer por quantidade de litros, 
                               3 - alterar valor do litro do combustivel, 
                               4 - alterar tipo de combustivel, 
                               5 - alterar quantidade registrada de combustivel disponivel na bomba""");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1 ->{
                    bombaCombustivel.abastecerPorValor();
                }
                case 2 -> {
                    bombaCombustivel.abastecerPorLitro();
                }
                case 3 -> {
                    bombaCombustivel.alterarValor();
                }
                case 4 -> {
                    bombaCombustivel.alterarCombustivel();
                }
                default -> System.out.println("Valor invalido");   
            }   
            System.out.println ("Quantidade restante de combustível na bomba: " 
                + bombaCombustivel.getQuantidadeCombustivelNaBomba());
            System.out.println("Deseja continuar? S - Sim, N - Nao");
            desejaContinuar = leitor.next().charAt(0);
        }      
    }
}
