/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio06JavaPOO;

/**
 *
 * @author User
 */
public class Invoice {
    
    private int numeroIten;
    private String descricaoItem;
    private int quantidade;
    private double precoItem;

    public Invoice(int numeroIten, String descricaoItem, int quantidade, double precoItem) {
        this.numeroIten = numeroIten;
        this.descricaoItem = descricaoItem;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public int getNumeroIten() {
        return numeroIten;
    }

    public void setNumeroIten(int numeroIten) {
        this.numeroIten = numeroIten;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    
}
