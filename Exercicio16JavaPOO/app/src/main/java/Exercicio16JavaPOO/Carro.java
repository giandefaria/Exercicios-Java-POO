/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio16JavaPOO;

/**
 *
 * @author User
 */
public class Carro {
    
    private double capacidadeMaximaTanqueGasolina = 50;
    private double quantidadeGasolinaTanque;
    private int quilometrosPorLitro = 15;

    public double getQuantidadeGasolinaTanque() {
        return quantidadeGasolinaTanque;
    }

    public void adicionaGasolinaTanque(double quantidadeGasolinaTanque) {
        this.quantidadeGasolinaTanque = this.quantidadeGasolinaTanque + quantidadeGasolinaTanque;
    }
    
    
    
}
