/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10JavaPOO;

import java.time.LocalDate;
import java.time.ZoneId;

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
        setDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        
    }
    
    public void idade(){
        LocalDate dataNascimento = LocalDate.of(dataDeNascimento.getAno(), dataDeNascimento.getMes(), dataDeNascimento.getDia());
        LocalDate dataAtual = LocalDate.now(ZoneId.of("BET"));
        System.out.println(dataNascimento);
        System.out.println(dataAtual);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int diaNascimento, int mesNascimento, int anoNascimento) {
        this.dataDeNascimento = new Data(diaNascimento, mesNascimento, anoNascimento);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
