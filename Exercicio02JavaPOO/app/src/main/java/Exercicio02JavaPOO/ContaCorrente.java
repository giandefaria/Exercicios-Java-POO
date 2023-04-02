/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02JavaPOO;

/**
 *
 * @author User
 */
public class ContaCorrente {
    
    //atributos
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo = 0;
    
    public ContaCorrente (int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
    
    }
    
    public void alterarNome(String nome) {
        this.nomeCorrentista = nome;
    }
    
    public void deposito(double deposito) {
        this.saldo = this.saldo + deposito;
    }
    
    public void valorSaque(double saque) {
        if (saque <= this.saldo) {
            this.saldo = this.saldo - saque;
            System.out.println("Você sacou o valor de R$ " + saque);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    //metodos de acesso
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
