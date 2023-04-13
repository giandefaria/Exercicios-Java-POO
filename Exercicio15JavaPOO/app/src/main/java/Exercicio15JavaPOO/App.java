/*
Crie uma classe chamada Funcionário que inclui três atributos:
a. nome (String);
b. sobrenome (String);
c. salário mensal (double).
A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. Escreva uma classe
chamada FuncionarioTeste (que contenha o método main) que cria dois objetos da classe Funcionario e
exibe o salário de cada objeto. Então dê a cada Funcionario um aumento de 10% e exiba novamente o
salário anual de cada um deles. Introduza na classe Funcionario uma variável de classe capaz de
contabilizar o numero de funcionarios que passaram pela empresa até a data.
 */
package Exercicio15JavaPOO;

public class App {


    public static void main(String[] args) {
        
        Funcionario funcionarioA = new Funcionario("José", "Pereira", 1530.50);
        Funcionario funcionarioB = new Funcionario("Carlos", "Oliveira", 2332.28);
        
        funcionarioA.imprimirDadosFuncionario();
        funcionarioB.imprimirDadosFuncionario();
        
        funcionarioA.aumentoSalario(10);
        funcionarioB.aumentoSalario(10);
        
        funcionarioA.imprimirDadosFuncionario();
        funcionarioB.imprimirDadosFuncionario();
        
    }
}
