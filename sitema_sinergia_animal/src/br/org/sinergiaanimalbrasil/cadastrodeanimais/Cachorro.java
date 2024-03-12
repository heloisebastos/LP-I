package br.org.sinergiaanimalbrasil.cadastrodeanimais;

public class Cachorro extends Animal {
	
	public Cachorro (String nome,String matricula){
		 setNome(nome);
		 setMatricula(matricula);	
	}
	
	@Override
	public String emitirsom() {
		return "Au,au,au";
	}

	@Override
	public String toString() {
		return "CPF =" + getMatricula() + ",Nome=" + getNome() + " som:" +emitirsom()+"]";
	}

	

	
	
	
	


}
