/*
Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão
e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que
implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote
java.lang.
 */
package Exercicio13JavaPOO;

public class App {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        System.out.println("A soma de 10 + 5 é igual a: " + calculadora.soma(10, 5));
        System.out.println("A subtração de 10 - 5 é igual a: " + calculadora.subtracao(10, 5));
        System.out.println("A divisao de 10 dividido 5 é igual a: " + calculadora.divisao(10, 5));
        System.out.println("A multiplicacao de 10 vezes 5 é igual a: " + calculadora.multiplicacao(10, 5));
        
        System.out.println("A raiz quadrada de 4 é: " + calculadora.raizQuadrada(4));
        System.out.println("Dois elevado a quinta potencia é: " + calculadora.potencia(2, 5));
        
    }
}
