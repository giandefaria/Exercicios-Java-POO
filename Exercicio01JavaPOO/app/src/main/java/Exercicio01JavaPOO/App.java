/*
 Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */
package Exercicio01JavaPOO;

import java.text.ParseException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        String nome;
        String dataNascimento;
        float altura;
        char desejaContinuar = 's';

        Scanner leitor = new Scanner(System.in);

        while (desejaContinuar == 's' || desejaContinuar == 'S') {

            System.out.println("Digite o nome: ");
            nome = leitor.nextLine();

            System.out.println("Digite a data de nascimento no formato 'dd/mm/yyyy': ");
            dataNascimento = leitor.nextLine();

            System.out.println("Digite a altura: ");
            altura = leitor.nextFloat();

            //objeto pessoa do tipo pessoa
            Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
            pessoa.imprimirDados();
            pessoa.idade();

            System.out.println("Deseja continar? S - Sim, N - Não");
            desejaContinuar = leitor.next().charAt(0);
            leitor.nextLine();
        }

    }
}
