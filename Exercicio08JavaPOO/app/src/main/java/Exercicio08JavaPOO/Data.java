/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio08JavaPOO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private boolean verifica = true;
    
    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        //validando ano
        if(ano <= 2023 && ano >= 1800){
            this.ano = ano;
        } else {
            this.verifica = false;
        }
        
        //validando mes
        if(mes > 0 && mes <= 12) {
            this.mes = mes;                    
        } else {
            this.verifica = false;
        }
        
        //validando o dia
        if(mes == 1 || (mes % 2 == 0 && mes != 2)) { //meses com 31 dias
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
            } else {
                this.verifica = false;
            }                        
        } else if ( mes == 2) { //mes de fevereiro. 29 dias se bissexto
            if(isBissexto(ano)){
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;                
                } else{
                    this.verifica = false;
                }
            } else {
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;                
                } else{
                    this.verifica = false;
                }          
            }           
        } else { //demais meses 30 dias
            if (dia > 0 && dia <= 30) {
                this.dia = dia;
            } else {
                this.verifica = false;
            }
        }
        
        if(verifica == false) {
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
        
    }
    
    public int comparaDatas (int diaOutraClasse, int mesOutraClasse, int anoOutraClasse) throws ParseException {
        
        SimpleDateFormat formatoPadrao = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dateA = formatoPadrao.parse(this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println(dateA);
        
        Date dateB = formatoPadrao.parse(diaOutraClasse + "/" + mesOutraClasse + "/" + anoOutraClasse);
        System.out.println(dateB);

        
        return 0;
        //talvez  utilizar classe Data para comparação
        //return 0;//iguais
        //return 1;//data dessa classe maior que da outra
        //return -1;//data da outra classe maior
    }
    
    private void formatarData() throws ParseException{
         
        String converte = this.dia + "/" + this.mes + "/" + this.ano;
        SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = originalFormat.parse(converte);
        System.out.println(date);
                  
    }
    
    public boolean isBissexto(int ano){
        if(ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    public String getMesPorExtenso(){
        
        String mesPorExtenso;
        
        switch(this.mes){
            case 1 -> mesPorExtenso = "janeiro";
            case 2 -> mesPorExtenso = "fevereiro";
            case 3 -> mesPorExtenso = "março";
            case 4 -> mesPorExtenso = "abril";
            case 5 -> mesPorExtenso = "maio";
            case 6 -> mesPorExtenso = "junho";
            case 7 -> mesPorExtenso = "julho";
            case 8 -> mesPorExtenso = "agosto";
            case 9 -> mesPorExtenso = "setembro";
            case 10 -> mesPorExtenso = "outubro";
            case 11 -> mesPorExtenso = "novembro";
            case 12 -> mesPorExtenso = "dezembro";
            default -> mesPorExtenso = "mes invalido";
        }
        
        return mesPorExtenso;
    }

    public int getAno() {
        return ano;
    }
    
    
}
