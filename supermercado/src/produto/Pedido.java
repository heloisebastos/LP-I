package produto;

import java.util.Arrays;

public class Pedido {
	
	ItemPedido[] itens = new ItemPedido[10];
	String pagamento;

	
	public void adicionarItem(ItemPedido itemPedido) {
		for (int i = 0; i < itens.length; i++) {
			if(itens[i]==null) {
				itens[i] = itemPedido;
				int novaQuantidade = itemPedido.getProduto().getQuantidade() - itemPedido.getQuantidade(); 
				itemPedido.getProduto().setQuantidade(novaQuantidade);
				break;
			}
		}
	}
	
	public void fecharPedido() {
		System.out.println("..:: Fechamento de Pedido ::..");
		for (int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				System.out.println(itens[i]);
			}
		}
		System.out.println("O total do pedido é: " + getTotalPedido());
		pagamento = Teclado.lerString("Pagamento em cartão ou dinheiro?");
		
		
	}
	
	public float getTotalPedido() {
		float totalPagamento = 0;
		for (int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				totalPagamento = totalPagamento + itens[i].getTotal();
			}
		}
		return totalPagamento;
	}


	@Override
	public String toString() {
		return "Pedido [itens=" + Arrays.toString(itens) + "]";
	}
	
	
}
