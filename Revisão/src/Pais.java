
public class Pais {

	private String codIso;
	private String nome;
	private String populacao;
	private String dimensao;
	
	public Pais (String codIso,String nome,String dimensao) {
	this.codIso = codIso;
	this.nome = nome;
	this.dimensao = dimensao;
	}

	public String getCodIso() {
		return codIso;
	}

	public void setCodIso(String codIso) {
		this.codIso = codIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPopulacao() {
		return populacao;
	}

	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}

	public String getDimensao() {
		return dimensao;
	}

	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	
	
}
