/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author lucas
 */
public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1;
    
    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao*3000);
        }
    }
}
