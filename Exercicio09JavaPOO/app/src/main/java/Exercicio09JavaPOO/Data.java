/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio09JavaPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Data implements Cloneable { //tenho que implementar a interface cloneable para poder clonar o objeto
    
    private int dia;
    private int mes;
    private int ano;
    private boolean verifica = true;
    
    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        validarAno(ano);
        
        validarMes(mes);
        
        validarDia(mes, dia, ano);
        
        if(verifica == false) {
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
        
    }

    private void validarDia(int mes1, int dia1, int ano1) {
        //validando o dia
        if (mes1 == 1 || (mes1 % 2 == 0 && mes1 != 2)) {
            //meses com 31 dias
            if (dia1 > 0 && dia1 <= 31) {
                this.dia = dia1;
            } else {
                this.verifica = false;
            }
        } else if (mes1 == 2) {
            //mes de fevereiro. 29 dias se bissexto
            if (isBissexto(ano1)) {
                if (dia1 > 0 && dia1 <= 29) {
                    this.dia = dia1;
                } else {
                    this.verifica = false;
                }
            } else {
                if (dia1 > 0 && dia1 <= 28) {
                    this.dia = dia1;
                } else {
                    this.verifica = false;
                }
            }
        } else {
            //demais meses 30 dias
            if (dia1 > 0 && dia1 <= 30) {
                this.dia = dia1;
            } else {
                this.verifica = false;
            }
        }
    }

    private void validarMes(int mes1) {
        //validando mes
        if (mes1 > 0 && mes1 <= 12) {
            this.mes = mes1;
        } else {
            this.verifica = false;
        }
    }

    private void validarAno(int ano1) {
        //validando ano
        if (ano1 <= 2023 && ano1 >= 1800) {
            this.ano = ano1;
        } else {
            this.verifica = false;
        }
    }
    
    public void comparaDatas (int diaOutraClasse, int mesOutraClasse, int anoOutraClasse) throws ParseException {
        
        SimpleDateFormat formatoPadrao = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dateA = formatoPadrao.parse(this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println(dateA);
        
        Date dateB = formatoPadrao.parse(diaOutraClasse + "/" + mesOutraClasse + "/" + anoOutraClasse);
        System.out.println(dateB);
        
        if ( dateA.compareTo(dateB) == 0 ){
            System.out.println("As datas sao iguais");
        } else if ( dateA.compareTo(dateB) > 0 ) {
            System.out.println("Data maior que a parametro");
        } else {
            System.out.println("Data menor que a parametro");   
        }
        
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
    
   @Override
    public Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }
    
}
