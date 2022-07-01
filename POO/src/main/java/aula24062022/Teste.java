/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula24062022;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Teste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Funcionario f1	= new Funcionario();
        System.out.println("Funcionario 1");
        System.out.println("Insira o nome do funcionario");
        f1.setNome(entrada.next());
        f1.departamento	= "Engenharia";
        f1.dataEntrada	= new Data();
        System.out.println("Insira o dia do mês:");
        f1.dataEntrada.setDia(entrada.nextInt());
        System.out.println("Insira o mês:");
        f1.dataEntrada.setMes(entrada.nextInt());
        System.out.println("Insira o ano:");
        f1.dataEntrada.setAno(entrada.nextInt());
        f1.RG = "99997773333";
        f1.salario = 22000;
        f1.bonus(3500);
        f1.estadoNaEmpresa = true;
        f1.trabalhandoFerias();
        f1.situacaoNoTrabalho();
        f1.informacoes();

        
        System.out.println("Funcionario 2");
        Funcionario f2 = new Funcionario();
        System.out.println("Insira o nome do funcionario");
        f2.setNome(entrada.next());
        f2.salario = 15000;
        f2.departamento	= "Financeiro";
        f2.dataEntrada	= new Data();
        System.out.println("Insira o dia do mês:");
        f2.dataEntrada.setDia(entrada.nextInt());
        System.out.println("Insira o mês:");
        f2.dataEntrada.setMes(entrada.nextInt());
        System.out.println("Insira o ano:");
        f2.dataEntrada.setAno(entrada.nextInt());
        f2.RG = "98887773333";
        f2.bonus(00);
        f2.estadoNaEmpresa = true;
        f2.situacaoNoTrabalho();
        f2.informacoes();
    }
}
