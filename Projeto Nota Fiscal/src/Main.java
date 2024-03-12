import produto.ItemPedido;
import produto.Produto;
import produto.Teclado;

public class Main {
	static Produto[] listaProdutos= new Produto[20];
	static Pedido [] listaPedidos= new  Pedido[20];
	public static void main(String[] args) {
		
		while(true) {
			int opcao=Teclado.lerInteiro("\nSistema do Supermercado\n1-Cadastrar\n2-Fazer pedido\n3-Lista de Produtos\n4-Lista de Pedidos\n5-Consultar Pedido\n6-Sair");
			switch(opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				pedido();
				break;
			case 3:
				listaProdutos();
				break;
			case 4:
				listaPedidos();
				break;
			case 5:
				consultar();
			case 6:
				System.exit(0);
				break;	
			}
		}
	}
	
	private static void cadastrar() {
		String nomeItem =Teclado.lerString("Digite o nome do produto:");
		double preco =Teclado.lerDouble("Preço unitário do produto:");
		int codigoIde=Teclado.lerInteiro("Digite o código identificador:");
		int estoque =Teclado.lerInteiro("Digite a quantidade no estoque:");
		
		Produto novoProduto = new Produto (nomeItem,preco,codigoIde,estoque); 
		
		for (int i = 0;i<listaProdutos.length;i++){
			if (listaProdutos[i]==null) {
				listaProdutos[i]=novoProduto;
				break;
			}
		}
	}
	
	private static void pedido() {
		while (true) {
			int opcao =Teclado.lerInteiro("1-Fazer pedido\n2-Fechar pedido\n3-Voltar ao menu");
			switch (opcao){
				case 1:
					System.out.println("Seja bem vindo ao sistema de auto atendimento\n");
					Produto produto = getProduto();
					int quantidade = Teclado.lerInteiro("Digite a quantidade de produtos");
					ItemPedido itemPedido = new ItemPedido(produto, quantidade);				 
					break;
				case 2:
					break;
				case 3:
					main(null);
					break;
				
			}
	   }
	}
	
	
	
	private static void consultar() {
		String buscarNome =Teclado.lerString("Para buscar pedido digite o nome do cliente "); 
		boolean key=true;

		for (int i=0;i < listaPedidos.length;i++) {
			if (listaPedidos[i]!= null) {
				if (listaPedidos[i].getNomeCliente().equals(buscarNome)) {
					key=false;
					System.out.println(listaPedidos[i].toString());
				}
			}
		}

		if (key) {
			System.out.println("Pedido não encontrado\n");
		}
	}
	
	private static void listaProdutos() {
		System.out.println("Produtos do Supermercado");
		for (int i=0;i<listaProdutos.length;i++) {
			if (listaProdutos[i]!= null) {
				System.out.println(listaProdutos[i].toString());
			}
		}
		
	}
	
	private static void listaPedidos() {
		System.out.println("Pedidos do Supermercado");
		for (int i=0;i<listaPedidos.length;i++) {
			if (listaPedidos[i]!= null) {
				System.out.println(listaPedidos[i].toString());
			}
		}
	}
	
}

