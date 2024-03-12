package br.edu.ufmt.system;
public class Aluno {
	private String nome;
	private String matricula;
	
	Aluno(String nome,String matricula){
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
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	

}
