/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03JavaPOO;

/**
 *
 * @author User
 */
public class BombaCombustivel {
    
    private char tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;
    
    //calcula quantidade de combustivel pelo valor a ser abastecido
    public void abastecerPorValor(double valorParaAbastecer) {
        this.quantidadeCombustivel = valorParaAbastecer / this.valorPorLitro;
        System.out.println("Veículo abastecido com " + this.quantidadeCombustivel + " litros");
    }
    
    public void abastecerPorLitro (double quantidadeCombustivel)  {
        double valorASerPago = quantidadeCombustivel * this.valorPorLitro;
        System.out.println("Valor total a ser pago equivalente a "
                + quantidadeCombustivel + " litros de combustivel: R$ " + valorASerPago);
    }
    
    public void alterarValor(double novoValor) {
        this.valorPorLitro = novoValor;
        System.out.println("Novo valor por litro de combustivel: R$ " + novoValor);
    }
}
