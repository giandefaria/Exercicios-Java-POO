/*
Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os
dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35
 */
package Exercicio10JavaPOO;

public class App {

    public static void main(String[] args) {
        
        JogadorDeFutebol jogadorDeFutebol = new JogadorDeFutebol("Suarez", 24, 01, 1987, "Uruguai", 1.82, 83);
        
        jogadorDeFutebol.idade();
    }
}
