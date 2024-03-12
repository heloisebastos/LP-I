import java.util.Arrays;


public class Pedido {
	private String nomeCliente;

	ItemPedido itens[];	
	
	public double getTotal() {
		double total = 0;
		for (int i = 0; i < itens.length; i++) {
			if(itens[i]!= null) {
				total = total + itens[i].getSubTotal();
			}
		}
		return total;
	}
	
	public void adicionaPedido(ItemPedido item) {
	 
		for (int i = 0; i < itens.length; i++) {
		 if (itens[i]== null) {
			 itens[i]= item;
		   }
		}
	}
	

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public String toString() {
		return "Pedido [nomeCliente=" + nomeCliente + ", itens=" + Arrays.toString(itens) + ", getTotal()=" + getTotal()
				+ "]";
	}

	
	



	
	
}
