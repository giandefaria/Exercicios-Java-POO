/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05JavaPOO;

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
    
    public Alunos (int matricula, String nome, double notaProvaA, double notaProvaB, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProvaA = notaProvaA;
        this.notaProvaB = notaProvaB;
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
                repete = 's';
            }
        }
    }

    public double getNotaProvaB() {
        return notaProvaB;
    }

    public void setNotaProvaB(double notaProvaB) {
        this.notaProvaB = notaProvaB;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
    
    
}