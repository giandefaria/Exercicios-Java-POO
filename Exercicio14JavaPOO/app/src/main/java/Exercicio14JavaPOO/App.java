/*
Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve
conter quatro atributos:
a. número (String);
b. descrição (String);
c. quantidade comprada de um item (int);
d. preço por item (double).
A classe deve ter um construtor e os métodos getters e setters. Além disso, forneça um método chamado
getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for
positivo, ele deve ser alterado para 0. Se o preço por item não for positivo, ele deve ser alterado para 0.
Escreva uma nova classe chamada FaturaTeste (que contenha o método main) que demonstre as
capacidades da classe Fatura.
 */
package Exercicio14JavaPOO;

public class App {

    public static void main(String[] args) {
        
        Fatura fatura = new Fatura(50, "Presunto", 2, 14.50);
        
        System.out.println("Número do item: " + fatura.getNumeroItem());
        System.out.println("Nome do item: " + fatura.getDescricaoItem());
        System.out.println("Valor total da fatura: R$ " + fatura.getTotalFatura());
        
    }
}
