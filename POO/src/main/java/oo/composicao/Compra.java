/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Compra {
    
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();
    
    void adicionarItem(Item item){
        itens.add(item);
    }
    
    double obterVAlorTotal(){
        double total = 0;
        
        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
