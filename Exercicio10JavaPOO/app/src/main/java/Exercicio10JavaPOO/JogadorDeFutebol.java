/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio10JavaPOO;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author User
 */
public class JogadorDeFutebol {
    private String nome;
    private Data dataDeNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    
    public JogadorDeFutebol(String nome, int diaNascimento, int mesNascimento, int anoNascimento, String nacionalidade, double altura, double peso){
        this.nome = nome;
        setDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        
    }
    
    public long idade(){
        LocalDate dataNascimento = LocalDate.of(dataDeNascimento.getAno(), dataDeNascimento.getMes(), dataDeNascimento.getDia());
        LocalDate dataAtual = LocalDate.now(ZoneId.of("America/Sao_Paulo")); //uso horario de sao paulo como base
        //System.out.println(dataNascimento);
        //System.out.println(dataAtual);
        
        long diferencaAnosEntreDatas = ChronoUnit.YEARS.between(dataNascimento, dataAtual);
        //System.out.println("Idade: " + diferencaAnosEntreDatas);
        return diferencaAnosEntreDatas;
        
    }
    
    public void tempoParaAposentadoria(){
        System.out.println("Se defensor, faltam " + (40 - idade()) + " anos para se aposentar" );
        System.out.println("Se meio-campo, faltam " + (38 - idade()) + " anos para se aposentar" );
        System.out.println("Se atacante, faltam " + (35 - idade()) + " anos para se aposentar" );
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
