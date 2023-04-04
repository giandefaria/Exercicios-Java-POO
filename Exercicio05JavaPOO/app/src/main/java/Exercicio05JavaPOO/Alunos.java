/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05JavaPOO;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Alunos {
    private int matricula;
    private String nome;
    private double notaProvaA;
    private double notaProvaB;
    private double notaTrabalho;
    
    Scanner leitor = new Scanner(System.in);
    
    public Alunos (int matricula, String nome, double notaProvaA, double notaProvaB, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        setNotaProvaA(notaProvaA);
        setNotaProvaB(notaProvaB);
        this.notaTrabalho = notaTrabalho;    
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProvaA() {
        return notaProvaA;
    }

    public void setNotaProvaA(double notaProvaA) {
        char repete = 's';
        while (repete == 's') {
            if(notaProvaA >= 0 && notaProvaA <= 2.5) {
                this.notaProvaA = notaProvaA;
                repete = 'n';
            } else {
                System.out.println("Nota inválida. Digite de 0 até 2.5");
                notaProvaA = leitor.nextFloat();
                repete = 's';
            }
        }
    }

    public double getNotaProvaB() {
        return notaProvaB;
    }

    public void setNotaProvaB(double notaProvaB) {
        char repete = 's';
        while (repete == 's') {
            if(notaProvaB >= 0 && notaProvaB <= 2.5) {
                this.notaProvaB = notaProvaB;
                repete = 'n';
            } else {
                System.out.println("Nota inválida. Digite de 0 até 2.5");
                notaProvaB = leitor.nextFloat();
                repete = 's';
            }
        }
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
    
    
}
