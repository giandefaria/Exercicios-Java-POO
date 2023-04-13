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

    public Carro(double quantidadeGasolinaTanque) {
        adicionaGasolinaTanque(quantidadeGasolinaTanque);
    }
        

    public double getQuantidadeGasolinaTanque() {
        return quantidadeGasolinaTanque;
    }

    public void adicionaGasolinaTanque(double quantidadeGasolina) {
        double espacoGasolinaTanque = this.capacidadeMaximaTanqueGasolina - this.quantidadeGasolinaTanque;
        
        if(quantidadeGasolina <= espacoGasolinaTanque) {
            this.quantidadeGasolinaTanque = this.quantidadeGasolinaTanque + quantidadeGasolinaTanque;
            System.out.println("Carro abastecido com " + quantidadeGasolina + " litros de gasolina");
            System.out.println("Atual quantidade de gasolina no tanque: " + getQuantidadeGasolinaTanque() + " litros");
        } else{
            this.quantidadeGasolinaTanque = this.quantidadeGasolinaTanque + espacoGasolinaTanque;
            System.out.println("Capacidade máxima do tanque atingida. Carro abastecido com " + (espacoGasolinaTanque) + " litros");
            System.out.println("Atual quantidade de gasolina no tanque: " + getQuantidadeGasolinaTanque() + " litros");
        }
    }
    
    
    
}
