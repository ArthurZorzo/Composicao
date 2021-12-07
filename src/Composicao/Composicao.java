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
        Automovel carro = new Automovel();
        Automovel carro2 = new Automovel(1600,"Verde");
        
        System.out.println("Carro 1: "); 
        carro.imprimeAutomovel();
        System.out.println("\n");
        System.out.println("Carro 2: ");
        carro2.imprimeAutomovel();
    }
}
