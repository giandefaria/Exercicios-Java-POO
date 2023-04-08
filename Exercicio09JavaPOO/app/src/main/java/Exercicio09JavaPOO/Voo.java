/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio09JavaPOO;

/**
 *
 * @author User
 */
public class Voo {
    private int maximoPassageiros = 100;
    private int numeroVoo;
    private int vagasOcupadas;
    private String poltrona[] = new String[maximoPassageiros]; //vetor com numero de posições igual máximo passageiros
    
    public Voo(int numeroVoo, int diaVoo, int mesVoo, int anoVoo) {
        this.numeroVoo = numeroVoo;
        Data dataVoo = new Data(diaVoo, mesVoo, anoVoo);
        
        criaVetorComPoltronasLivres();
    }

    private void criaVetorComPoltronasLivres() {
        for (int i = 1; i < poltrona.length; i++) {
            this.poltrona[i] = "livre";
        }
    }

    public String getPoltrona(int posicaoPoltrona) {
        return poltrona[posicaoPoltrona];
    }
    
    
}
