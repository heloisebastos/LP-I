
public class MainLista {

	static Contato[] listaContato = new Contato[10];

	public static void main(String[] args) {
		while(true) {
		int op = Teclado.lerInteiro("\nOpcao: 1- Cadastrar 2- Consultar 3- Exluir 4- Alterar 5- Sair\n");
			switch(op) {
			case 1: 
				cadastrar();
				break;
			case 2:
				consultar();
				break;
			case 3:
				excluir();
				break;
				
			case 4:
				MenuAlterar();
				break;
				
			case 5:
				System.exit(0);
			
			}
		}

	}

	private static void cadastrar() {

		String nome = Teclado.lerString("\nNome: \n");
		String telefone = Teclado.lerString("\nTelefone: \n");
		String email = Teclado.lerString("\nEmail: \n");

		Contato c = new Contato(nome, telefone, email);

		for (int i = 0; i < listaContato.length; i++) {

			if (listaContato[i] == null) {
				listaContato[i] = c;
				break;
			}
		}

	}

	private static void consultar() {
		String consultarNome= Teclado.lerString("Digite o nome que deseja consultar: ");
		boolean s= true;
	
		for (int i = 0; i <= listaContato.length; i++) {

			if (listaContato[i].getNome().equals(consultarNome)) {
				s= false;
				System.out.println(listaContato[i].toString());
				
			}
		
		}
		if(s){
		
			System.out.println("\nNome nao encontrado.\n");
		}
	}
	
	
	
	private static void excluir() {
	
			String numeroExluir= Teclado.lerString("Para excluir digite o numero do telefone do contato: ");
			int posicaoExclusao = 0;
			for (int i = 0; i < listaContato.length; i++) {

				if (listaContato[i].getTelefone().equals(numeroExluir)) {
					
					posicaoExclusao= i;
					break;
				}
			}
		
			listaContato[posicaoExclusao] = null;
			
			System.out.println("\nContato excluido\n");
			
			for (int i = 0; i < listaContato.length; i++) {
				if (listaContato[i] != null) {
					System.out.println("\nLista de Contatos: \n"+ listaContato[i].toString());
				}
			}
		}
		
	
	private static void MenuAlterar() {
		
		while(true) {
			int opAlterar = Teclado.lerInteiro("\nAlterar: 1- Nome 2- Telefone 3- Email 4- Sair\n");
				switch(opAlterar) {
				case 1: 
					AltNome();
					break;
				case 2:
					AltTelefone();
					break;
				case 3:
					AltEmail();
					break;
				case 4:
					System.exit(0);
				
				}
			}	
	}
	
	private static void AltNome() {
		int posicaoAlterar ;
		String nomeAlterar= Teclado.lerString("Digite o nome que deseja alterar: ");
		for (int i = 0; i < listaContato.length; i++) {
			if (listaContato[i]!= null) {
			if (listaContato[i].getNome().equals(nomeAlterar)) {
				posicaoAlterar= i;
				break;
			}
		}
		
		if (posicaoAlterar!=null) {
			String nomeAlterado= Teclado.lerString("Digite o nome para alterar: ");
			listaContato[posicaoAlterar].setNome(nomeAlterado);
			
			System.out.println("\nNome alterado\n");
			
			
		}else {
				System.out.println("Nome nao encontrado");
			}
	}
		}		
	
	private static void AltTelefone() {

		String telefoneAlterar= Teclado.lerString("Digite o telefone que deseja alterar: ");
		String telefoneAlterado= Teclado.lerString("Digite o telefone para alterar: ");
		
		int posicaoAlterar = 0;
		for (int i = 0; i < listaContato.length; i++) {

			if (listaContato[i].getNome().equals(telefoneAlterar)) {
				
				posicaoAlterar= i;
				break;
			}
		}
	
		listaContato[posicaoAlterar].setNome(telefoneAlterado);
		
		System.out.println("\nTefone alterado\n");
		
		for (int i = 0; i < listaContato.length; i++) {
			if (listaContato[i] != null) {
				System.out.println("\nLista de Contatos: \n"+ listaContato[i].toString());
			}
		}
	}
	
	
	private static void AltEmail() {

		String emailAlterar= Teclado.lerString("Digite o email que deseja alterar: ");
		String emailAlterado= Teclado.lerString("Digite o email para alterar: ");
		
		int posicaoAlterar = 0;
		for (int i = 0; i < listaContato.length; i++) {

			if (listaContato[i].getEmail().equals(emailAlterar)) {
				
				posicaoAlterar= i;
				break;
			}
		}
	
		listaContato[posicaoAlterar].setEmail(emailAlterado);
		
		System.out.println("\nEmail alterado\n");
		
		for (int i = 0; i < listaContato.length; i++) {
			if (listaContato[i] != null) {
				System.out.println("\nLista de Contatos: \n"+ listaContato[i].toString());
			}
		}
	}
}