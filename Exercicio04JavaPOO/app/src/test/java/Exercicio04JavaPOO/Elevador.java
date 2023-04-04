/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04JavaPOO;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Elevador {
    
    //atributos da classe
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;
    
    Scanner leitor = new Scanner(System.in);
    
    public Elevador (int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    
    }
    
    public void entraPessoa () {
        int quantidadePessoasEntrando = leitor.nextInt();
        if (quantidadePessoasEntrando < (this.capacidadeElevador - this.pessoasNoElevador)) {
            this.pessoasNoElevador += quantidadePessoasEntrando;
        } else {
            System.out.println("Elevador só possui capacidade para mais " 
                    + (this.capacidadeElevador - this.pessoasNoElevador) + " pessoas.");
        }
    }
    
    public void saiPessoa () {
        int quantidadePessoasSaindo = leitor.nextInt();
        if (this.pessoasNoElevador > 0 && quantidadePessoasSaindo <= this.pessoasNoElevador) {
            this.pessoasNoElevador -= quantidadePessoasSaindo;
            System.out.println("Sairam " + quantidadePessoasSaindo + " pessoas "
                    + "do elevador. Agora há " + this.pessoasNoElevador + " pessoas");       
        } else {
            System.out.println("Valor inválido. Nao há ninguém dentro do elevador "
                    + "ou a quantidade de pessoas saindo e maior que a quantidade "
                    + "de pessoas no elevador, sendo invalido o valor.");
        }
        
    }
    
}
