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
    }
}
