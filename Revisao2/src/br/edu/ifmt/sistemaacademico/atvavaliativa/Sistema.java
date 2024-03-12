package br.edu.ifmt.sistemaacademico.atvavaliativa;

public class Sistema {
	private String nome;
	private String matricula;
	
	Sistema(String nome,String matricula){
		this.nome=nome;
		this.matricula=matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return "Sistema [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
}
