/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio11JavaPOO;

/**
 *
 * @author User
 */
public class IngressoVip extends Ingresso {
    
    private double valorAdicional;
    
    public IngressoVip(){
        super();
    }
    
    public IngressoVip(double valorIngresso, double valorAdicional){
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }
    
    public double valorIngressoVip(){
        return getValorIngresso() + (getValorIngresso() * this.valorAdicional);
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
  
    
}
