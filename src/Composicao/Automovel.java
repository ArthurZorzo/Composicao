/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicao;

/**
 *
 * @author IFSC
 */
public class Automovel {
    //Classe automovel é composta por direcao e motor
    private Motor motor;
    private Direcao direcao;
    
    //Construtores
    public Automovel(){
        motor = new Motor();
        direcao = new Direcao();
    }
    
    public Automovel(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }
    
    public void ligarPelaPrimeiraVez(){
        motor = new Motor();
    }
    
    public void ligarPelaPrimeiraVez(int potencia){
        motor = new Motor(potencia);
    }
    
    void imprimeAutomovel(){
        System.out.println("Potencia: "+motor.getPotencia()); 
        System.out.println("cor: "+direcao.getCor());
    }
}
