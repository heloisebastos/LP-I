package produto;

public class Main {
	static Produto[] listaProduto = new Produto[10];
	static TipoProduto[] listaTipoProduto = new TipoProduto[10];
	static Pedido[] listaPedidos = new Pedido[10];

	public static void main(String[] args) {
		Main main = new Main();
		main.menu();
	}

	public void menu() {

		while (true) {
			int op = Teclado.lerInteiro("(1)Cad Tipo (2)Cad Prod (3)Pedido (8)Sair");
			switch (op) {
			case 1:
				cadastrarTipoProduto();
				break;
			case 2:
				cadastrarProduto();
				break;
			case 3:
				realizarPedido();
				break;
			case 8:
				System.out.println("..:: Adeus ::..");
				System.exit(0);

			default:
				break;
			}
		}
	}
	public void realizarPedido() {
		Pedido pedido = new Pedido();
		int op = 1;
		while (op != 2) {
			op = Teclado.lerInteiro("(1)Adicionar Item (2)Fechar Pedido");
			switch (op) {
			case 1:
				ItemPedido itemPedido = getItem();
				pedido.adicionarItem(itemPedido);
				break;
			case 2:
				pedido.fecharPedido();
				for (int i = 0; i < listaPedidos.length; i++) {
					if (listaPedidos[i] == null) {
						listaPedidos[i] = pedido;
					}
				}
				break;

			default:
				break;
			}
		}
	}

	public ItemPedido getItem() {
		Produto produto = getProduto();
		int quantidade = Teclado.lerInteiro("Digite a quantidade de produtos");
		ItemPedido itemPedido = new ItemPedido(produto, quantidade);
		return itemPedido;
	}

	private void cadastrarTipoProduto() {
		int codigo = Teclado.lerInteiro("Digite o código");
		String descricao = Teclado.lerString("Digite a descrição");

		TipoProduto novoTipoProduto = new TipoProduto(codigo, descricao);

		for (int i = 0; i < listaTipoProduto.length; i++) {
			if (listaTipoProduto[i] == null) {
				listaTipoProduto[i] = novoTipoProduto;
				break;
			}
		}
		menu();
	}

	public void cadastrarProduto() {
		TipoProduto tipo = getTipoProduto();
		int codigo = Teclado.lerInteiro("Digite o código do produto");
		String descricao = Teclado.lerString("Digite a descrição");
		float preco = Teclado.lerFloat("Digite o preço do produto");
		int quantidade = Teclado.lerInteiro("Digite a quantidade do produto");

		Produto novoProduto = new Produto(tipo, codigo, descricao, preco, quantidade);

		for (int i = 0; i < listaProduto.length; i++) {
			if (listaProduto[i] == null) {
				listaProduto[i] = novoProduto;
				break;
			}
		}
		menu();
	}

	private void listarProdutos() {
		for (int i = 0; i < listaProduto.length; i++) {
			if (listaProduto[i] != null) {
				System.out.println(listaProduto[i]);
			}
		}
	}

	private TipoProduto getTipoProduto() {
		listarTipoProduto();
		int codigoTipoProduto = Teclado.lerInteiro("Digite o Código do Tipo de Produto");
		TipoProduto tipoProduto = null;

		for (int i = 0; i < listaTipoProduto.length; i++) {
			if (listaTipoProduto[i] != null && listaTipoProduto[i].getCodigo() == codigoTipoProduto) {
				tipoProduto = listaTipoProduto[i];
				break;
			}
		}

		return tipoProduto;
	}

	private void listarTipoProduto() {
		for (int i = 0; i < listaTipoProduto.length; i++) {
			if (listaTipoProduto[i] != null) {
				System.out.println(listaTipoProduto[i]);
			}
		}
	}

	private Produto getProduto() {
		listarProdutos();
		int codigoProduto = Teclado.lerInteiro("Digite o código do produto");
		Produto produto = null;
		for (int i = 0; i < listaProduto.length; i++) {
			if (listaProduto[i] != null && listaProduto[i].getCodigo() == codigoProduto) {
				produto = listaProduto[i];
				break;
			}
		}
		return produto;
	}
}
