/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package Exercicio02JavaPOO;

public class App {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(2050, "Gian", 5200.00);
        System.out.println("Numero da conta: " + contaCorrente.getNumeroConta());
        System.out.println("Nome do conrrentista: " + contaCorrente.getNomeCorrentista());
        System.out.println("Saldo da conta: R$ " + contaCorrente.getSaldo());
    }
}
