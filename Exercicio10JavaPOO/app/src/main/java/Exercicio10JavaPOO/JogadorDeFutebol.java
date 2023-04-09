/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10JavaPOO;

/**
 *
 * @author User
 */
public class JogadorDeFutebol {
    private String nome;
    private Data dataDeNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    
    public JogadorDeFutebol(String nome, int diaNascimento, int mesNascimento, int anoNascimento, String nacionalidade, float altura, float peso){
        this.nome = nome;
        this.dataDeNascimento = new Data(diaNascimento, mesNascimento, anoNascimento);
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        
    }
    
}
