public class Produto {
	
	private String descricao;
	private double preco;
	private int estoque;
	private int codigoIde;
	
	public Produto(String nomeItem,double preco,int codigoIde,int estoque){
		this.descricao=nomeItem;
		this.preco=preco;
		this.codigoIde=codigoIde;
		this.estoque=estoque;
	}
	
	public String getNomeItem() {
		return descricao;
	}
	public void setNomeItem(String nomeItem) {
		this.descricao = nomeItem;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public int getCodigoIde() {
		return codigoIde;
	}
	public void setCodigoIde(int codigoIde) {
		this.codigoIde = codigoIde;
	}

	@Override
	public String toString() {
		return "[Item=" + descricao + ", preco=R$" + getPreco() + ", estoque=" + estoque + ", codigo="+ codigoIde+"]\n" ;
	}


	
}
