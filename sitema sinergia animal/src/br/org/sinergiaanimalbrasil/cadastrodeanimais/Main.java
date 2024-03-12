package br.org.sinergiaanimalbrasil.cadastrodeanimais;

import java.util.InputMismatchException;

public class Main {
	static Animal [] listaAnimal = new Animal [10];
	
	public static void main(String[] args) {
		while(true) {
			try {
				int opcao=Teclado.lerInteiro("\nEscolha um opção \n1-Cadastrar\n2-Alterar\n3-Consultar\n4-Excluir\n5-Sair");
			switch(opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				alterar();
			case 3 :
				consultar();
			case 4:
				excluir();
			case 5:
				System.exit(0);
				break;
			/*case 6:
				listaatual();*/
			
			 }
			}catch(InputMismatchException ime) {
				   System.out.println("opcao invalida,digite novamente ");
				   main(null);
			   }
		   }
	    }
	
		private static void cadastrar() {
		 String nome =Teclado.lerString("Digite o nome do animal:"); 
		 String matricula=Teclado.lerString("Digite o cpf do animal :");
		 int opcao=Teclado.lerInteiro("Para cadastrar escolha 1- Cachorro 2- Gato");
		 if (opcao==1) {
			Cachorro novoCao = new Cachorro(nome,matricula);
			 for (int i = 0; i < listaAnimal.length; i++) {
				 if (listaAnimal[i]==null) {
					listaAnimal[i]=novoCao;
					break;
					}
				  }
			  }else {
					Gato novoGato = new Gato (nome,matricula);
					for (int i = 0; i < listaAnimal.length; i++) {
						if (listaAnimal[i]==null) {
							listaAnimal[i]=novoGato;
							break;
						}
					}
			}
		}
		
		private static void alterar() {
			while (true) {
				try {
					int opcao = Teclado.lerInteiro("Digite\n7-Alterar nome\n8-Alterar matricula\n9-Voltar menu principal");
				switch(opcao) {
				case 7:
					alterarNome();
					break;
				case 8:
					alterarMatricula();
					break;
				case 9:
					main(null);
					break;

				}
				}catch(InputMismatchException ime) {
					   System.out.println("opcao invalida,digite novamente ");
				   }finally{
						alterar();
					}
				
			}
			
		}
		private static void alterarNome() {
			try {
			String nomeAtual =Teclado.lerString("Digite o nome que deseja alterar"); 
			int posicao=-1;
			
			for (int i=0;i < listaAnimal.length;i++) {
				if (listaAnimal[i]!= null && listaAnimal[i].getNome().equals(nomeAtual) ) {
					posicao=i;
					break;
				}
			}

			if (posicao>=0) {
				listaAnimal[posicao].setNome(Teclado.lerString("Digite o novo nome"));
				System.out.println("\nNome alterado com sucesso!\n");
				System.out.println(listaAnimal[posicao].toString());
			}else {
				System.out.println("Nome nao encontrado,digite novamente ou volte ao menu principal");
			}
			
			}finally{
				alterar();
			}
			
		}
		private static void alterarMatricula() {
			try {
			String matriculaAtual =Teclado.lerString("Digite a matricula que deseja alterar");
			int posicao=-1;
			
			for (int i=0;i <listaAnimal.length;i++) {
				if (listaAnimal[i]!= null && listaAnimal[i].getMatricula().equals(matriculaAtual) ) { 
					posicao=i;
					break;
				}
			}
			if (posicao>=0) {
				listaAnimal[posicao].setMatricula(Teclado.lerString("Digite a nova matricula"));
				System.out.println("\n Matricula alterada com sucesso!\n");
				System.out.println(listaAnimal[posicao].toString());
			}else {
				System.out.println("Matricula nao encontrada,digite novamete ou volte ao menu principal");
			}}finally{
				alterar();
			}
			
		}
		
		
		private static void consultar() {
			String buscarNome =Teclado.lerString("Digite o nome que deseja buscar"); 
			boolean key=true;

			for (int i=0;i < listaAnimal.length;i++) {
				if (listaAnimal[i]!= null) {
					if (listaAnimal[i].getNome().equals(buscarNome)) {
						key=false;
						System.out.println(listaAnimal[i].toString());
					}
				}
			}

			if (key) {
				System.out.println("Nome não encontrado digite novamente\n");
			}
			
		}
		
		private static void excluir() {
			try{
			String matricula = Teclado.lerString("Digite a matricula para exclusao ");
			int posicao=-1;
			for (int i=0;i <listaAnimal.length;i++) {
				if (listaAnimal[i]!= null && listaAnimal[i].getMatricula().equals(matricula)) {
					posicao=i; 
					break;
				} 
			}
			if(posicao>=0) {
				listaAnimal[posicao]=null;
				System.out.println("Dados excluido");
			}else {
				System.out.println("Dado nao encontrado");
			}
			}finally{
				main(null);
			}

		}
		
		/*private static void listaatual() {
			System.out.println("\nlista de animais \n");
			for (int i=0;i<listaAnimal.length;i++) {
				if (listaAnimal[i]!= null) {
					System.out.println(listaAnimal[i].toString());
				}
			}
					
		}*/

}


