/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio14JavaPOO;

/**
 *
 * @author User
 */
public class Fatura {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeCompradaItem;
    private double precoDoItem;
    
    public Fatura(){
    }

    public Fatura(int numeroItem, String descricaoItem, int quantidadeCompradaItem, double precoDoItem) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeCompradaItem = quantidadeCompradaItem;
        this.precoDoItem = precoDoItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeCompradaItem() {
        return quantidadeCompradaItem;
    }

    public void setQuantidadeCompradaItem(int quantidadeCompradaItem) {
        this.quantidadeCompradaItem = quantidadeCompradaItem;
    }

    public double getPrecoDoItem() {
        return precoDoItem;
    }

    public void setPrecoDoItem(double precoDoItem) {
        this.precoDoItem = precoDoItem;
    }
    
    
    
}
