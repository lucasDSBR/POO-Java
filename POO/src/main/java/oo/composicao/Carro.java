/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author lucas
 */
public class Carro {
    Motor motor = new Motor();
    
    void acelerar(){
        motor.fatorInjecao += 0.4;
    }
    
    void frear(){
        motor.fatorInjecao -= 0.4;
    }
    
    void ligar(){
        motor.ligado = true;
    }
    
    void desligar(){
        motor.ligado = false;
    }
    
    boolean estaLigado(){
        return motor.ligado;
    }
}
