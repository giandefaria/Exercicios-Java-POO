/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03JavaPOO;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BombaCombustivel {
    
    private char tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivelNaBomba;
    
    Scanner leitor = new Scanner(System.in);
    
    //construtor
    public BombaCombustivel (char tipoCombustivel, double valorPorLitro, double quantidadeCombustivelNaBomba) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;    
    }
    
    //calcula quantidade de combustivel pelo valor a ser abastecido
    public void abastecerPorValor() {
        System.out.println("Digite o valor que deseja abaster em R$");
        double valor = leitor.nextDouble();
        double quantidadeDeCombustivel = valor / this.valorPorLitro;
        this.quantidadeCombustivelNaBomba = this.quantidadeCombustivelNaBomba - quantidadeDeCombustivel;
        System.out.println("Veículo abastecido com " + quantidadeDeCombustivel + " litros");
    }
    
    public void abastecerPorLitro ()  {
        System.out.println("Digite a quantidade de litros que deseja abastecer");
        double quantidade = leitor.nextDouble();
        double valorASerPago = quantidade * this.valorPorLitro;
        this.quantidadeCombustivelNaBomba = this.quantidadeCombustivelNaBomba - quantidade;
        System.out.println("Valor total a ser pago equivalente a "
                + quantidade + " litros de combustivel: R$ " + valorASerPago);
    }
    
    public void alterarValor() {
        System.out.println("Digite o novo valor do litro de combustivel");
        double novoValorLitro = leitor.nextDouble();
        this.valorPorLitro = novoValorLitro;
        System.out.println("Novo valor por litro de combustivel: R$ " + novoValorLitro);
    }
    
    public void alterarCombustivel() {
        System.out.println("Selecione o tipo de combustível: G - Gasolina, A - Alcool, D - Diesel");
        char alterarCombustivel = leitor.next().charAt(0);
        if (alterarCombustivel == 'G' || alterarCombustivel == 'g' ) {
            this.tipoCombustivel = alterarCombustivel;
            System.out.println("Tipo de combustivel: Gasolina");
        } else if (alterarCombustivel == 'A' || alterarCombustivel == 'a' ) {
            this.tipoCombustivel = alterarCombustivel;
            System.out.println("Tipo de combustivel: Alcool");
        } else if (alterarCombustivel == 'D' || alterarCombustivel == 'd' ) {
            this.tipoCombustivel = alterarCombustivel;
            System.out.println("Tipo de combustivel: Diesel");
        } else {
            System.out.println("Tipo de combustível invalido");
        }
    }
    
    public void alterarQuantidadeCombustivel (double novaQuantidadeCombustivelNaBomba) {
        this.quantidadeCombustivelNaBomba = novaQuantidadeCombustivelNaBomba;
    }
    
    //getters and setters

    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(char tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeCombustivelNaBomba() {
        return quantidadeCombustivelNaBomba;
    }

    public void setQuantidadeCombustivelNaBomba(double quantidadeCombustivelNaBomba) {
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }
    
    
}
