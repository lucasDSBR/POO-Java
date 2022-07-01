/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01072022;

/**
 *
 * @author lucas
 */
public class ContaCorrente extends ContaBancaria {
    
    Double Taxa = 1.4;
    
    public double Depositar(double valor){
        Saldo += valor - Taxa;
        return 0;
    };
    
    public String DadosConta(){
        return String.format("Olá $s, você pode ver os dados da sua conta a seguir:\n\n"
                + "Nome do titular: $s\n CPF: $s\n Endereço: $s\n Telefone: " , 
                NomeTitular, NomeTitular, CPF, Endereco, Telefone);
    };
}
