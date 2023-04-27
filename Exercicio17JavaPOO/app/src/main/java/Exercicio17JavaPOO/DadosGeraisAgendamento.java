/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio17JavaPOO;

/**
 *
 * @author User
 */
public class DadosGeraisAgendamento extends Data {
    
    private String tipo;
    private String nome;
    private String telefone;
    private String descricao;
    private String dataAgendamento;

    
    public DadosGeraisAgendamento(String tipo, String nome, String telefone, String descricao, int dia, int mes, int ano){
        super(dia, mes, ano);
        this.dataAgendamento = super.getDataFormatada();
        this.tipo = tipo;
        this.nome = nome;
        this.telefone = telefone;
        this.descricao = descricao;
    }
    
    public void informacoesAgendamento(){
        System.out.println("Data do agendamento: " + this.dataAgendamento);
        System.out.println("Tipo de agendamento: " + this.tipo);
        System.out.println("Nome do participante: " + this.nome);
        System.out.println("Telefone do participante: " + this.telefone);
        System.out.println("Descricao do agendamento: " + this.descricao);
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(int dia, int mes, int ano) {
        Data data = new Data(dia, mes, ano);
        this.dataAgendamento = data.getDataFormatada();
    }
    
     
    
}
