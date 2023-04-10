/*
Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor. Crie uma
classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um método que retorne o
valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.
 */
package Exercicio11JavaPOO;

public class App {


    public static void main(String[] args) {
        
        Ingresso ingresso = new Ingresso();
        ingresso.setValorIngresso(20.50);
        System.out.println("O valor do ingresso comum e: R$ " + ingresso.getValorIngresso());
        
        IngressoVip ingressoVip = new IngressoVip();
        ingressoVip.setValorIngresso(20.50);
        ingressoVip.setValorAdicional(0.50);
        System.out.println("Valor do ingresso vip e: R$ " + ingressoVip.valorIngressoVip());
        
        //Segundo algoritmo do código
        
        double valorIngresso = 30.00;
        double valorAdicionalIngressoVip = 0.50;
        
        Ingresso ingresso2 = new Ingresso(valorIngresso);
        System.out.println("O valor do ingresso comum do segundo filme e: R$ " + ingresso2.getValorIngresso());
        
        IngressoVip ingressoVip2 = new IngressoVip(valorIngresso, valorAdicionalIngressoVip);
        System.out.println("Valor do ingresso vip do segundo filme e: R$ " + ingressoVip2.valorIngressoVip());
               
    }
}
