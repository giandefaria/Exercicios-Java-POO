/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio15JavaPOO;

/**
 *
 * @author User
 */
public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salarioMensal;

    public Funcionario(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    } 

    public void aumentoSalario(double porcentagemAumento){
        double aumento = porcentagemAumento / 100;
        this.salarioMensal = this.salarioMensal + (this.salarioMensal * aumento);
    }
    
    public void imprimirDadosFuncionario(){
        System.out.println("Nome: " + this.nome + " " + this.sobreNome);
        System.out.println("Salario: R$ " + this.salarioMensal + "\n");

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    
}
