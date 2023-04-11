/*
Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */
package Exercicio12JavaPOO;

public class App {


    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();       
        agenda.armazenarPessoa("Gian", 28, 1.71);
        agenda.armazenarPessoa("Joao", 22, 1.79);
        agenda.armazenarPessoa("Carlos", 35, 1.68);
        
        agenda.imprimirAgenda();
        
        agenda.removerPessoa("Carlos");
 
        System.out.println("Indice da pessoa no vetor: " + agenda.buscarPessoa("Gian") + "\n");
        
        agenda.imprimirAgenda();
        agenda.imprimirPessoa(1);
    }
}
