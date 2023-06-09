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

    public Elevador(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;

    }

    public void entraPessoa() {
        System.out.println("Informe a quantidade de pesssoas entrando no elevador");
        int quantidadePessoasEntrando = leitor.nextInt();
        if (quantidadePessoasEntrando < (this.capacidadeElevador - this.pessoasNoElevador)) {
            this.pessoasNoElevador += quantidadePessoasEntrando;
            System.out.println("Agora há " + this.pessoasNoElevador + " pessoas no elevador");
        } else {
            System.out.println("Elevador só possui capacidade para mais "
                    + (this.capacidadeElevador - this.pessoasNoElevador) + " pessoas.");
        }
    }

    public void saiPessoa() {
        System.out.println("Informe a quantidade de pessoas saindo do elevador");
        int quantidadePessoasSaindo = leitor.nextInt();
        if (this.pessoasNoElevador > 0 && quantidadePessoasSaindo <= this.pessoasNoElevador) {
            this.pessoasNoElevador -= quantidadePessoasSaindo;
            System.out.println("Sairam " + quantidadePessoasSaindo + " pessoas "
                    + "do elevador. Agora há " + this.pessoasNoElevador + " pessoas no elevador");
        } else {
            System.out.println("Valor inválido. Nao há ninguém dentro do elevador "
                    + "ou a quantidade de pessoas saindo e maior que a quantidade "
                    + "de pessoas no elevador, sendo invalido o valor.");
        }
    }

    public void subirAndarElevador() {
        System.out.println("Informe quantos andares quer que o elevador suba");
        int quantidadeAndaresParaElevadorSubir = 0;
        quantidadeAndaresParaElevadorSubir = leitor.nextInt();
        if (quantidadeAndaresParaElevadorSubir <= (this.totalAndares - this.andarAtual)) {
            this.andarAtual += quantidadeAndaresParaElevadorSubir;
            System.out.println("Você chegou ao andar " + this.andarAtual + "!");
        } else {
            System.out.println("Valor inválido. O predio possui apenas "
                    + this.totalAndares + " andares! Voce está no andar " + this.andarAtual);
        }
    }

    public void descerAndarElevador() {
        System.out.println("Informe quantos andares quer que o elevador desça");
        int quantidadeAndaresParaElevadorDescer = 0;
        quantidadeAndaresParaElevadorDescer = leitor.nextInt();
        if (quantidadeAndaresParaElevadorDescer <= this.andarAtual) {
            this.andarAtual -= quantidadeAndaresParaElevadorDescer;
            System.out.println("Você chegou ao andar " + this.andarAtual + "!");
        } else {
            System.out.println("Não existe andares abaixo do terreo."
                    + " Andar atual " + this.andarAtual);
        }
    }

}
