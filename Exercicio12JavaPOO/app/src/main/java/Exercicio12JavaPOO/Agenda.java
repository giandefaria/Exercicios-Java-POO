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
    
    private Pessoa pessoa[] = new Pessoa[10]; //crio  um vetor do tipo Pessoa, com 10 indices no máximo
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
        System.out.println("Altura: " + pessoa[index].getAltura() + "\n");
        
    }
    
    public void removerPessoa(String nome){
        int indice = buscarPessoa(nome);
        if(indice != 0){
            pessoa[indice] = new Pessoa(); //objeto vazio
        } else {
            System.out.println("Vetor nao encontrado");        
        }
    }

    public int buscarPessoa(String nome) {
        int indiceNoVetor = 0;
        
        for (int i = 1; i < pessoa.length; i++) {
            try{
                if(pessoa[i].getNome() == nome){
                    indiceNoVetor = i;
                } 
            } catch(Exception e){
                //System.out.println("Indice do vetor nao existe");
            }
        }
        if(indiceNoVetor == 0){
            return 0;
        } else {
            return indiceNoVetor;
        }
    }
    
    public void imprimirAgenda(){
        for (int i = 1; i < pessoa.length; i++) {
            try{
                imprimirPessoa(i);
            } catch(Exception e){
                //System.out.println("Indice do vetor nao existe");
            }
        }  
    }
    
}
