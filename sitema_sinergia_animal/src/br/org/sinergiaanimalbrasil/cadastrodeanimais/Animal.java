package br.org.sinergiaanimalbrasil.cadastrodeanimais;

public abstract class Animal {
	private String nome;
	private String matricula; 

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String emitirsom();

	

}
