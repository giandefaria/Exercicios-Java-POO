/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio12JavaPOO;

/**
 *
 * @author User
 */
public class Agenda {
    
    /*private String nome[] = new String[10];
    private int idade[] = new int[10];
    private double altura[] = new double[10];*/
    private Pessoa pessoa[] = new Pessoa[10];
    private int indiceLista = 1;
    
    public Agenda(){
    
    }
       
    public void armazenarPessoa(String nome, int idade, double altura){
        
        if(indiceLista <= 10){
            pessoa[indiceLista] = new Pessoa(); //instanciando a classe Pessoa no indice do vetor pessoa, criando um objeto
            pessoa[indiceLista].adicionaPessoa(nome, idade, altura); //preenchendo o objeto 
            this.indiceLista++;
        } else {
            System.out.println("Não há mais espaço no vetor");
        }
    }
    
    public void imprimirPessoa(int index){
        System.out.println("Nome: " + pessoa[index].getNome());
        System.out.println("Idade: " + pessoa[index].getIdade());
        System.out.println("Altura: " + pessoa[index].getAltura());
    }
    
}
