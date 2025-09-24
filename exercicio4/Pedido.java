package exercicio4;

public class Pedido {

    private int codigoPedido;
    private ItemPedido itempedido;

    public Pedido(int codigoPedido, ItemPedido itempedido){ // CRIANDO UM CONTRUTOR, ou seja, TEM QUE TE PARAMETROS
        this.codigoPedido = codigoPedido;
        this.itempedido = itempedido;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public ItemPedido getItempedido() {
        return itempedido;
    }

    public void setItempedido(ItemPedido itempedido) {
        this.itempedido = itempedido;
    }

}
