/*
O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa
finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento,
entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o
compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como
agendar, remover e alterar compromissos e exibir compromissos por participante e por data.
*ideia, criar classe DadosGeraisAgendamento, que conterá a data, o nome do participanete, telefone, descrição;
*a classe NovoAgendamento herdara a outra classe, e nela terá um sistema que perguntará o tipo de compromisso, perguntando se deseja criar outro ao final.
 */
package Exercicio17JavaPOO;

public class App {


    public static void main(String[] args) {
       CriarAgenda joao = new CriarAgenda();
       //fazer novo agendamento
       joao.novoAgendamento();
       //exibir dados do agendamento
       joao.exibirTodosAgendamentos();
       //alterar dados do agendamento
       
    }
}
