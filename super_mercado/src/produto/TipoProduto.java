package produto;

public class TipoProduto {
	
	private int codigo;
	private String descricao;
	
	public TipoProduto(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "TipoProduto [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
}
