/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author lucas
 */
public class CompraTeste {
    public static void main(String[] args){
        Compra c1 = new Compra();
        
        c1.nomeCliente = "Lucas Silva";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 12, 3.45));
        c1.itens.add(new Item("Caderno", 4, 18.45));
        
        System.out.println(c1.obterVAlorTotal());
    }
}
