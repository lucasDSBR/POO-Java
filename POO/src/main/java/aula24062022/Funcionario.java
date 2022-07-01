/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula24062022;

/**
 *
 * @author lucas
 */
public class Funcionario {
    //declaração de	atributos
	String departamento, RG, estado;
        private String nome;
	double salario;
	boolean	estadoNaEmpresa;
	Data dataEntrada;

        public void setNome(String data) {
            nome = data;
        }

        public String getNome() {
            return nome;
        }
        
	
	//definição	de	métodos
	void bonus(double valor) {
		salario	+= valor;
	}
	
	void trabalhandoFerias() {
		estadoNaEmpresa = false;
	}

	void situacaoNoTrabalho() {
	
		if(estadoNaEmpresa)
			estado = "Trabalhando";
		else
			estado = "De Férias";
	}
	
	void informacoes() {
		System.out.println("Nome: "+getNome()+"\n"+"Departamento: "+departamento+"\n"
	+"Ingresso: "+dataEntrada.getDia()+"/ "+dataEntrada.getMes()+"/ "+dataEntrada.getAno()+"\n"
	+"RG: "+RG+"\n"+"Salário: "+salario+"\n"+"Situação de Trabalho: "+estado+"\n");

	}
}
