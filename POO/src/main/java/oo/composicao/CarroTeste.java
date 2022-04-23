/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author lucas
 */
public class CarroTeste {
    public static void main(String[] args){
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        
        c1.ligar();
        System.out.println(c1.estaLigado());
        
        
    }
}
