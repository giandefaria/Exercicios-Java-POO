/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.
 */
package Exercicio06JavaPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        String descricaoItem;
        int numeroItem;
        int quantidade;
        double precoItem;
        
        char desejaContinuar = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            System.out.println("Informe a descrição do produto: ");
            descricaoItem = leitor.nextLine();
            
            System.out.println("Informe o numero de cadastro do item:");
            numeroItem = leitor.nextInt();
            
            System.out.println("Informe a quantidade do item comprado:");
            quantidade = leitor.nextInt();
            
            System.out.println("Informe o preco unitario do item:");
            precoItem = leitor.nextDouble();
            
            Invoice fatura = new Invoice(numeroItem, descricaoItem, quantidade, precoItem);
            
            System.out.println("Valor total da fatura = R$ " + fatura.getInvoiceAmount());
            
            System.out.println("Deseja emitir uma nova fatura? S - Sim, N - Não");
            desejaContinuar = leitor.next().charAt(0);
            leitor.nextLine();
        }
        
        
    }
}
