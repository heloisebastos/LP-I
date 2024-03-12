public class ProfessorDaFaculdade extends EmpregadoDaFaculdade	{
	private int	horasDeAula;
	
 
	public	double	getGastos() {
		return this.getSalario()	+	this.horasDeAula	*	10;
}
 
	public	String	getInfo() {
		/*"super. " acessa	 o	 método	 da	 super classe para não ter	de	 copiar	todo o conteúdo,nos apenas chamamos e 
		concatenamos 	com	a	informação	das	horas	de	aula*/
		String	informacaoBasica	=	super.getInfo();
		String	informacao	=	informacaoBasica	+	"	horas	de	aula:	"+	this.horasDeAula;
		return	informacao;
}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
								

}