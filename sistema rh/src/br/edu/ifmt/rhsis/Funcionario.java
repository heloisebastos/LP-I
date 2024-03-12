package br.edu.ifmt.rhsis;

import util.Teclado;

public class Funcionario {
	private String nome1;
	private String matricula;
	private double salario;
	private int tipo;
	//private double calcularSalario;

	//construtor
	public Funcionario(String nome1,String matricula,int tipo,double salario){
		this.nome1=nome1;
		this.matricula=matricula;
		this.tipo=tipo;
		this.salario=salario;
	}
	
	/*public double buscarPorMatricula(int matricula) {
		int posicao=-1;
		
		for (int i=0;i <listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getMatricula().equals(matriculaAtual) ) { 
				posicao=i;
				break;
			}
		}
		return 0;
	}*/
	
	
	public double calcularSalario() {
		if (this.tipo ==1 ) {
			return this.salario*1.1;
			
		}
		else  {
			return this.salario+1200;
			
		}
		
	}


	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
 
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return "Funcionario [nome1=" + nome1 + ", matricula=" + matricula + ", salario=" + calcularSalario() + ", tipo=" + tipo+ "]";
	}
}
 