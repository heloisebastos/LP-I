package br.edu.ifmt.sistemaacademico.atvavaliativa;
import util.Teclado;

public class MainSistema {
	/*Cadastro, Alteração, 
	Exclusão, Consulta e Sair do programa.*/
	static Sistema listaAluno[]=new Sistema[10];
	
	public static void main (String[]args)  {
		while (true){
			int opcao=Teclado.lerInteiro("1-Cadastrar\n2-Alterar\n3-Excluir\n4-Consultar\n5-lista atual\n6-lançar notas\n7-Sair");
			switch(opcao) {
			case 1:
				cadastrarAluno();
				break;
			/*case 2 :
				break;
			case 3:
				break;
			case 4 :
				break;
			case 5:
				break;*/
			case 6 :
				System.exit(0);
				break;
			}
		}
	}
	
	private static void cadastrarAluno() {
		String nome=Teclado.lerString("Digite o nome: ");
		String matricula=Teclado.lerString("Digite a matricula: ");
		
		Sistema novoAluno = new Sistema(nome,matricula);
		
		for (int i=0;i<=listaAluno.length;i++) {
			if (listaAluno.length [i]== null) {
				listaAluno[i]=novoAluno;
				break;
			}
		}
	}
	
	private static void cadastrar() {
		String nome =Teclado.lerString("Digite o nome"); 
		String matricula=Teclado.lerString("Digite a matricula");
		
		Aluno novoAluno = new Aluno(nome,matricula);
		
		for (int i=0;i <= listaAluno.length;i++) {
			if (listaAluno[i]== null) {
				listaAluno[i]= novoAluno;
				break;
			}
			
		}
	}
	
	

}
	
	

