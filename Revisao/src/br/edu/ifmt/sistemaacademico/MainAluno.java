package br.edu.ifmt.sistemaacademico;
import util.Teclado;


public class MainAluno {
	static Aluno[] listaAluno= new Aluno[10];
	public static void main(String[] args) {
		while(true) {
			int opcao=Teclado.lerInteiro("1-Cadastrar\n2-Alterar\n3-Excluir\n4-Consultar\n5-lista atual\n6-lançar notas\n7-Sair");
			switch(opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				alterar();
				break;
			case 3:
				excluir();
				break;
			case 4:
				consultar();
				break;
			case 5:
				listaAtual();
				break;
			case 6:
				nota();
				break;	
			case 7:
				System.exit(0);
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

	private static void alterar () {
		while (true) {
			int opcao = Teclado.lerInteiro("Digite\n1-Alterar nome\n2-Alterar matricula\n3-Voltar menu principal");
			switch(opcao) {


			case 1:
				alterarNome();
				break;
			case 2 :
				alterarMatricula();
				break;
			case 3:
				main(null);
				break;

			}
		}
	}

	private static void alterarNome() {
		String nomeAtual =Teclado.lerString("Digite o nome que deseja alterar"); 
		int posicao=-1;
		//encontrar matricula
		for (int i=0;i < listaAluno.length;i++) {
			if (listaAluno[i]!= null && listaAluno[i].getNome().equals(nomeAtual) ) {
				posicao=i;
				break;
			}
		}

		if (posicao>=0) {
			listaAluno[posicao].setNome(Teclado.lerString("Digite o novo nome"));
			System.out.println("\nNome alterado com sucesso!\n");
			System.out.println(listaAluno[posicao].toString());
		}else {
			System.out.println("Nome nao encontrada");
		}
	}


	private static void alterarMatricula() {
		String matriculaAtual =Teclado.lerString("Digite a matricula que deseja alterar");
		int posicao=-1;
		//String novoMatricula=Teclado.lerString("Digite a nova matricula");
		for (int i=0;i <listaAluno.length;i++) {
			if (listaAluno[i]!= null && listaAluno[i].getMatricula().equals(matriculaAtual) ) { 
				posicao=i;
				break;
			}
		}
		if (posicao>=0) {
			listaAluno[posicao].setMatricula(Teclado.lerString("Digite a nova matricula"));
			System.out.println("\nNome alterado com sucesso!\n");
			System.out.println(listaAluno[posicao].toString());
		}else {
			System.out.println("Matricula nao encontrada");
		}
	}

	private static void excluir() {
		String matricula = Teclado.lerString("Digite a matricula para exclusao ");
		int posicao=-1;
		for (int i=0;i <listaAluno.length;i++) {
			if (listaAluno[i]!= null && listaAluno[i].getMatricula().equals(matricula)) {
				posicao=i; 
				break;
			} 
		}
		if(posicao>=0) {
			listaAluno[posicao]=null;
			System.out.println("Dados excluido");
		}else {
			System.out.println("Dado nao encontrado");
		}
	}


	private static void consultar() {
		String buscarNome =Teclado.lerString("Digite o nome que deseja buscar"); 
		boolean key=true;

		for (int i=0;i < listaAluno.length;i++) {
			if (listaAluno[i]!= null) {
				if (listaAluno[i].getNome().equals(buscarNome)) {
					key=false;
					System.out.println(listaAluno[i].toString());
				}

			}
		}

		if (key) {
			System.out.println("Nome não encontrado\n");
		}

	}

	private static void listaAtual() {
		System.out.println("\nlista de alunos atual\n");
		for (int i=0;i<listaAluno.length;i++) {
			if (listaAluno[i]!= null) {
				System.out.println(listaAluno[i].toString());
			}
		}
	}

	private static void nota() {
		String matricula =Teclado.lerString("Digite a matricula"); 

		for (int i=0;i < listaAluno.length;i++) {
			Aluno novoAluno = listaAluno[i];
			if (novoAluno != null && novoAluno.getMatricula().equals(matricula)) {
				for (int j=0;j <4;j++) {
					double nota = Teclado.lerDouble("Digite a nota"+(j+1)+":");
					novoAluno.getNota()[j]= nota;
				}
				System.out.println("Nota lançada com sucesso");
				break;
			}
		}
	}


}
