package produto;

public class ItemPedido {
	
	private Produto produto;
	private int quantidade;
	
	public ItemPedido(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	

	public Produto getProduto() {
		return produto;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		return "ItemPedido [produto=" + produto.getDescricao() + ", preço = " + produto.getPreco() +
				", quantidade=" + quantidade + ", total = "+ getTotal() +"]";
	}
	
	public float getTotal() {
		return produto.getPreco() * quantidade;
	}

}
