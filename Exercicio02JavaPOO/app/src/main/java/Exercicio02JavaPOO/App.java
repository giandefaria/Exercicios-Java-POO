/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package Exercicio02JavaPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int numeroConta;
        String nomeCorrentista;
        double saldo;
        
        char desejaContinuar = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            
            System.out.println("Informe o numero da conta: ");
            numeroConta = leitor.nextInt();
            
            System.out.println("Informe o nome do correntista: ");
            nomeCorrentista = leitor.nextLine();
            
            
            ContaCorrente contaCorrente = new ContaCorrente(numeroConta, nomeCorrentista);
            System.out.println("Numero da conta: " + contaCorrente.getNumeroConta());
            System.out.println("Nome do conrrentista: " + contaCorrente.getNomeCorrentista());
            System.out.println("Saldo da conta: R$ " + contaCorrente.getSaldo());
        
        }
    }
}
