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

import java.text.ParseException;

public class App {


    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        
        Data dataA = new Data(31, 12, 2019);
        System.out.println(dataA.getDia() + "/" + dataA.getMes() + "/" + dataA.getAno());
        System.out.println("Mes informado: " + dataA.getMesPorExtenso());
        
                
        Data dataB = new Data(29, 12, 2019);
        System.out.println(dataB.getDia() + "/" + dataB.getMes() + "/" + dataB.getAno());
        System.out.println("Mes informado: " + dataB.getMesPorExtenso());
        
        dataA.comparaDatas(dataB.getDia(), dataB.getMes(), dataB.getAno());

        Data objetoClonado = dataA.clone();
        System.out.println("Dia do objeto clonado: " + objetoClonado.getDia());
    }
}
