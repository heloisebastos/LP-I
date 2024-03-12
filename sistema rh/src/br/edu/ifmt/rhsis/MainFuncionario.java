package br.edu.ifmt.rhsis;
import java.util.InputMismatchException;

import util.Teclado;
public class MainFuncionario {
	static Funcionario[] listaFuncionario= new Funcionario[10];
	public static void main(String[] args) {
		while(true) {
			try{
			int opcao=Teclado.lerInteiro("\nIFMT sistema do RH\n1-Cadastrar\n2-Alterar\n3-Excluir\n4-Consultar\n5-lista atual\n6-Sair");
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
				System.exit(0);
				break;	
			}
		 }catch(InputMismatchException ime) {
			   System.out.println("opcao invalida ");
		   }finally{
				main(null);
			}
	     }	
	}
	
	private static void cadastrar() {
		String nome =Teclado.lerString("Digite o nome"); 
		String matricula=Teclado.lerString("Digite a matricula");
		
		int tipo=Teclado.lerInteiro("Digite tipo do funcionario");
		
		Double salario=Teclado.lerDouble("Digite o salario funcionario");
		
		Funcionario novoFuncionario = new Funcionario(nome,matricula,tipo,salario);
		
		for (int i=0;i <= listaFuncionario.length;i++) {
			if (listaFuncionario[i]== null) {
				listaFuncionario[i]= novoFuncionario;
				break;
			}
		}		
	}
	
		private static void alterar () {
		while (true) {
			int opcao = Teclado.lerInteiro("Digite\n1-Alterar nome\n2-Alterar matricula\n3-Alterar salario\n4-Alterar Tipo\n5-Voltar menu principal");
			switch(opcao) {
			case 1:
				alterarNome();
				break;
			case 2 :
				alterarMatricula();
				break;
			case 3 :
				alterarSalario();
				break;
			case 4:
				alterarTipo();
				break;
			case 5:
				main(null);
				break;

			}
		}
	}

	private static void alterarNome() {
		String nomeAtual =Teclado.lerString("Digite o nome que deseja alterar"); 
		int posicao=-1;
		
		for (int i=0;i < listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getNome1().equals(nomeAtual) ) {
				posicao=i;
				break;
			}
		}

		if (posicao>=0) {
			listaFuncionario[posicao].setNome1(Teclado.lerString("Digite o novo nome"));
			System.out.println("\nNome alterado com sucesso!\n");
			System.out.println(listaFuncionario[posicao].toString());
		}else {
			System.out.println("Nome nao encontrada");
		}
	}


	private static void alterarMatricula() {
		String matriculaAtual =Teclado.lerString("Digite a matricula que deseja alterar");
		int posicao=-1;
		
		for (int i=0;i <listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getMatricula().equals(matriculaAtual) ) { 
				posicao=i;
				break;
			}
		}
		if (posicao>=0) {
			listaFuncionario[posicao].setMatricula(Teclado.lerString("Digite a nova matricula"));
			System.out.println("\nNome alterado com sucesso!\n");
			System.out.println(listaFuncionario[posicao].toString());
		}else {
			System.out.println("Matricula nao encontrada");
		}
	}
	
	private static void alterarSalario() {
		
		String matriculaAtual =Teclado.lerString("Digite a matricula para alterar o salario");
		int posicao=-1;
		for (int i=0;i <listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getMatricula().equals(matriculaAtual) ) { 
				posicao=i;
				break;
		      }
	       }
			if (posicao>=0) {
			//setSalario("Digite o salario funcionario");
			listaFuncionario[posicao].calcularSalario();
			System.out.println("\nSalario alterado com sucesso!\n");
			System.out.println(listaFuncionario[posicao].toString());
		}else {
				System.out.println("Matricula nao encontrada");
		   }
	}
		
	
	private static void alterarTipo() {
		String nomeAtual =Teclado.lerString("Para alterar o tipo digite o nome  "); 
		int posicao=-1;
		
		for (int i=0;i < listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getNome1().equals(nomeAtual) ) {
				posicao=i;
				break;
			}
		}

		if (posicao>=0) {
			listaFuncionario[posicao].setTipo(Teclado.lerInteiro("Digite o novo tipo"));
			System.out.println("\nTipo alterado com sucesso!\n");
			System.out.println(listaFuncionario[posicao].toString());
		}else {
			System.out.println("Nome nao encontrada");
		}
		
		
	}
	private static void excluir() {
		String matricula = Teclado.lerString("Digite a matricula para exclusao ");
		int posicao=-1;
		for (int i=0;i <listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null && listaFuncionario[i].getMatricula().equals(matricula)) {
				posicao=i; 
				break;
			} 
		}
		if(posicao>=0) {
			listaFuncionario[posicao]=null;
			System.out.println("Dados excluido");
		}else {
			System.out.println("Dado nao encontrado");
		}

		
	}
	
	
	private static void consultar() {
		String buscarNome =Teclado.lerString("Digite o nome que deseja buscar"); 
		boolean key=true;

		for (int i=0;i < listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null) {
				if (listaFuncionario[i].getNome1().equals(buscarNome)) {
					key=false;
					System.out.println(listaFuncionario[i].toString());
				}
			}
		}

		if (key) {
			System.out.println("Nome não encontrado\n");
		}
	}
	
	private static void listaAtual() {
		System.out.println("\nlista de funcionarios atual\n");
		for (int i=0;i<listaFuncionario.length;i++) {
			if (listaFuncionario[i]!= null) {
				System.out.println(listaFuncionario[i].toString());
			}
		}
		
	}
  
}
