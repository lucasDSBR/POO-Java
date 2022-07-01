/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01072022;

/**
 *
 * @author lucas
 */
public class Teste {
    public static void main (String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.CPF = "039203902";
        conta1.Endereco = "Endereço tal tal";
        conta1.NomeBanco = "Bradesco";
        conta1.NomeTitular = "Lucas Silva";
        
        System.out.print("Teste");
        conta1.DadosConta();
    }
}
