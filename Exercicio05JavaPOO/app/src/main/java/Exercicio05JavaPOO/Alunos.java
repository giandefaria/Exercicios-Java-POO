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
    
    //construtor
    public Alunos (int matricula, String nome, double notaProvaA, double notaProvaB, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        setNotaProvaA(notaProvaA);
        setNotaProvaB(notaProvaB);
        setNotaTrabalho(notaTrabalho);
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Media final do aluno: " + mediaFinalAluno());
        System.out.println("Nota necessaria na prova final: " + notaNecessariaProvaFinal());
    }
    
    public double mediaFinalAluno() {
        double mediaFinal = (this.notaProvaA + this.notaProvaB + this.notaTrabalho);
        return mediaFinal;
    }
    
    public double notaNecessariaProvaFinal(){
        double mediaFinal = mediaFinalAluno();
        if(mediaFinal < 4) {
            return (4 - mediaFinal);
        } else {
            return 0;
        }
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
                System.out.println("Nota da primeira prova invalida. Digite de 0 até 2.5");
                notaProvaA = leitor.nextDouble();
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
                System.out.println("Nota da segunda prova invalida. Digite de 0 até 2.5");
                notaProvaB = leitor.nextDouble();
                repete = 's';
            }
        }
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        char repete = 's';
        while (repete == 's') {
            if(notaTrabalho >= 0 && notaTrabalho <= 2) {
                this.notaTrabalho = notaTrabalho;
                repete = 'n';
            } else {
                System.out.println("Nota inválida do Trabalho. Digite de 0 até 2");
                notaTrabalho = leitor.nextDouble();
                repete = 's';
            }
        }
    }
    
    
}
