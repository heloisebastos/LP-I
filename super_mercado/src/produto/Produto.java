package produto;

public class Produto {
	private TipoProduto tipo;
	private int codigo;
	private String descricao;
	private float preco;
	private int quantidade;
	
	public Produto(TipoProduto tipo, int codigo, String descricao, float preco, int quantidade) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public TipoProduto getTipo() {
		return tipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public float getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [tipo=" + tipo.getDescricao() + ", codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco
				+ ", quantidade=" + quantidade + "]";
	}
	
	
	
	
}
