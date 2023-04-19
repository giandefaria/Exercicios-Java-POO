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
    
    private String nome;
    private String telefone;
    private String descricao;
    private String dataAgendamento;

    
    public DadosGeraisAgendamento(String nome, String telefone, String descricao, int dia, int mes, int ano){
        super(dia, mes, ano);
        this.dataAgendamento = super.getDataFormatada();
    }

 
    
}
