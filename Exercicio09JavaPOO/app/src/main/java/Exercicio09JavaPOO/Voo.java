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
    private int vagasOcupadas = 0;
    private String poltrona[] = new String[(maximoPassageiros + 1)]; //vetor com numero de posições igual máximo passageiros
    
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

    public String verificaPoltrona(int posicaoPoltrona) {
        if(posicaoPoltrona > 0 && posicaoPoltrona < this.poltrona.length){
            return poltrona[posicaoPoltrona];
        } else {
            return "Poltrona nao existente";
        }
    }
    
    public void ocupaPoltrona(int posicaoPoltrona){
        if(posicaoPoltrona > 0 && posicaoPoltrona < this.poltrona.length){
            if(verificaPoltrona(posicaoPoltrona) == "livre"){
                this.poltrona[posicaoPoltrona] = "ocupada";
                this.vagasOcupadas++;
                System.out.println("Operacao bem sucedida! Poltrona " + posicaoPoltrona + " reservada");
            } else {
                System.out.println("Poltrona ocupada! Escolha outra poltrona");
            }
        } else{
            System.out.println("Poltrona nao existente");
        }
    }
    
    public int poltronasVagas(){
        return this.maximoPassageiros - this.vagasOcupadas;
    }
    
}
