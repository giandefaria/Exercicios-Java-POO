/*
 Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
 */
package Exercicio05JavaPOO;

import java.util.Scanner;

public class App {
//para aprovação, precisa nota 4. Caso não atinga, a prova final o aluno deverá atingir a nota faltante para completar 4.
    public static void main(String[] args) {
            
            char desejaCadastrarNovoAluno = 's';
            int matricula;
            String nome;
            double notaProvaA;
            double notaProvaB;
            double notaTrabalho;
            
            Scanner leitor = new Scanner(System.in);
            
            while(desejaCadastrarNovoAluno == 's' || desejaCadastrarNovoAluno == 'S') {
                
                System.out.println("Digite a matricula do aluno: ");
                matricula = leitor.nextInt();
                leitor.nextLine();
                
                System.out.println("Digite o nome do aluno: ");
                nome = leitor.nextLine();
                
                System.out.println("Digite a nota da primeira prova do aluno: ");
                notaProvaA = leitor.nextDouble();
                
                System.out.println("Digite a nota da segunda prova do aluno: ");
                notaProvaB = leitor.nextDouble();
                
                System.out.println("Digite a nota do trabalho do aluno: ");
                notaTrabalho = leitor.nextDouble();
                
                Alunos alunos = new Alunos(matricula, nome, notaProvaA, notaProvaB, notaTrabalho);
            
                System.out.println("Deseja cadastrar as notas de outro aluno? S - Sim, N - Nao");
                desejaCadastrarNovoAluno = leitor.next().charAt(0);
            }
        
    }
}
