
public class MainPais {
	static Pais [] listaPaises = new Pais[6];
	
	public static void main (String[] args) {
		
		while (true) {
			opcao= Teclado.lerInteiro("0- Cadastrar paises 1- Verificação 2- Paises Limitrofes 3 - Densidade populacional 4- Lista de paises vizinhos 5- Sair");	
		switch (opcao) {
		case 0 :
			cadastrar();
		case 1 : 
			verificar()
			break;
		case 5 :
			System.exit(0);
			break;
		
		}
		
		}
	}

}

private static void cadastrar () {
	String codIso = Teclado.lerString ("Codigo ISO: ");
	String nome = Teclado.lerString("Nome do pais: ");
	String populacao = Teclado.lerString("População: ");
	String dimensao = Teclado.lerString("Dimesao: "); 
	
	Pais p = new Pais (codIso,nome,populacao);
	
	for (int i = 0; i < listaPaises.length; i++) {

		if (listaPaises[i] == null) {
			listaPaises[i] = p;
			break;
		}
	}


}

















