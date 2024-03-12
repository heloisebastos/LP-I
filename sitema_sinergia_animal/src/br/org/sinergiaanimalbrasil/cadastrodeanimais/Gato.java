package br.org.sinergiaanimalbrasil.cadastrodeanimais;

public class Gato extends Animal {
	
	public Gato (String nome,String matricula){
		 setNome(nome);
		 setMatricula(matricula);	
	}
	
	@Override
	public String emitirsom() {
		return "Miauuuu";
		
	}

	@Override
	public String toString() {
		return "CPF" + getMatricula() + ", Nome=" + getNome() + " som:" +emitirsom()+"]";
	}

	
	
	
}
