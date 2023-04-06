/*
A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
empregado.
 */
package Exercicio07JavaPOO;

public class App {

    public static void main(String[] args) {
        
        Funcionario funcionarioA = new Funcionario("Joao", "Ramos", 1320.50);
        Funcionario funcionarioB = new Funcionario("Carlos", "Quadros", 2000.00);
        
        System.out.println("Salario anual do funcionario Joao: R$ " + (funcionarioA.getSalarioFuncionario() * 12));
        System.out.println("Salario anual do funcionario Carlos: R$ " + (funcionarioB.getSalarioFuncionario() * 12));
        
        funcionarioA.setSalarioFuncionario(funcionarioA.getSalarioFuncionario() + (funcionarioA.getSalarioFuncionario() * 0.10));
        System.out.println("Salario reajustado do funcionario A: R$ " + funcionarioA.getSalarioFuncionario());
        
        funcionarioB.setSalarioFuncionario(funcionarioB.getSalarioFuncionario() + (funcionarioB.getSalarioFuncionario() * 0.10));
        System.out.println("Salario reajustado do funcionario B: R$ " + funcionarioB.getSalarioFuncionario());
    }
}
