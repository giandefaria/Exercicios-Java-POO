/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01JavaPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author User
 */
public class Pessoa {
    
    //atributos
    private String nome;
    private Date dataNascimento;
    private float altura;
    
    public Pessoa (String nome, String dataNascimento, float altura) throws ParseException {
        this.nome = nome;
        this.setDataNascimento(dataNascimento);
        this.altura = altura;
    }
    
    public void imprimirDados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);    
    }
    
    public void idade(){
        
        Duration dur = Duration.between(dataNascimento.toInstant(), Instant.now());
        System.out.println(dur.toDays() / 365);
    }
    
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
