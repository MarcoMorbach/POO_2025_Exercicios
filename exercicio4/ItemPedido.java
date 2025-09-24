package exercicio4;

public class ItemPedido {
	
	private float quantidade;
	private Produto produto;
	
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getSubtotal() {
		
		return produto.getPreco() * quantidade;
	}
	


}
