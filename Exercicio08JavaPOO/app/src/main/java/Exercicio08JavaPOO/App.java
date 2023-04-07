/*
Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
 */
package Exercicio08JavaPOO;

public class App {


    public static void main(String[] args) {
        
        Data data = new Data(10, 2, 2024);
        System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
        
    }
}
