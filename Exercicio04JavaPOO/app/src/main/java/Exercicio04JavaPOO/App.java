/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes métodos:
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
 */
package Exercicio04JavaPOO;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        int capacidadePessoasElevador;
        int totalAndares;
        char realizarNovaAcao = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a capacidade de pessoas no elevador:");
        capacidadePessoasElevador = leitor.nextInt();
        
        System.out.println("Informe a quantidade de andares que o predio tera");
        totalAndares = leitor.nextInt();
        
        Elevador elevador = new Elevador(capacidadePessoasElevador, totalAndares);
        
        while (realizarNovaAcao == 's') {
            
            System.out.println("""
                               Selecione o que deseja fazer:
                               1 - para pessoas entrando no elevador;
                               2 - para pessoas saindo do elevador;
                               3 - para informar a quantidade de andares que o elevador deve subir;
                               4 - para informar a quantidade de andares que o elevador deve descer;
                               5 - nada a fazer;
                               """);
            int opcao = leitor.nextInt();
            
            switch(opcao){
                case 1 -> elevador.entraPessoa();
                case 2 -> elevador.saiPessoa();
                case 3 -> elevador.subirAndarElevador();
                case 4 -> elevador.descerAndarElevador();
                default -> System.out.println  ("nada a fazer");
            }
            
            System.out.println("Deseja realizar alguma outra ação? S - Sim, N - Nao");
            realizarNovaAcao = leitor.next().charAt(0);
        }   
        
    }
}
