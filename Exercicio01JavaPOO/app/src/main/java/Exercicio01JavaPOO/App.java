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
        
        //objeto pessoa do tipo pessoa
        Pessoa pessoa = new Pessoa("Gian", "27/11/1994", 1.71f);
        pessoa.imprimirDados();
        pessoa.idade();
        
    }
}
