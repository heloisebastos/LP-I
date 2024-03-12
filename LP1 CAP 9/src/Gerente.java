
public class Gerente extends Funcionario{
		private int	senha;
		private int	numeroDeFuncionariosGerenciados;
		
		public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		public int getNumeroDeFuncionariosGerenciados() {
			return numeroDeFuncionariosGerenciados;
		}
		public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
			this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
		}

		public	boolean	autentica(int senha) {
			if	(this.senha	==	senha){
				System.out.println("Acesso	Permitido!");
			    return true;
			}else{
				  System.out.println("Acesso	Negado!");
				  return false;
		     }
		}
		
		public	double	getBonificacao() {
			//chama o metodo da super classe,roda o metodo e soma mais 1000;
			return super.getBonificacao()+1000;
			//return this.salario	*0.15;
		}

			
			
}
