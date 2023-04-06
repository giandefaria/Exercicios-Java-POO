/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio07JavaPOO;

/**
 *
 * @author User
 */
public class Funcionario {
    
    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private double salarioFuncionario;
    
    public Funcionario(String nomeFuncionario, String sobrenomeFuncionario, double salarioFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }

    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        if(salarioFuncionario >= 0){
            this.salarioFuncionario = salarioFuncionario;
        } else {
            this.salarioFuncionario = 0;
        }
    }
    
    
    
}
