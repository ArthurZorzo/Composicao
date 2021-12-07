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
public class Composicao {
    public static void main(String[] args) {
        //Primeira forma
        /*Automovel uno = new Automovel();
        Automovel gol = new Automovel(1600);
        
        //Segunda forma
        Automovel carro = new Automovel();
        carro.ligarPelaPrimeiraVez();
        carro.ligarPelaPrimeiraVez(1600);
        
        //Terceira fomra
        Automovel moto = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1600);
        motor.setPotencia(1600);
        motor2.setPotencia(1600);
        */
        
        Automovel carro = new Automovel();
        Automovel carro2 = new Automovel(1600,"Verde");
        
        System.out.println("Carro 1: "); 
        carro.imprimeAutomovel();
        System.out.println("\n");
        System.out.println("Carro 2: ");
        carro2.imprimeAutomovel();
    }
}
