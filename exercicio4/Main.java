package exercicio4;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Controle Remoto");
        p1.setPreco(100);

        ItemPedido i1 = new ItemPedido();
        i1.setQuantidade(100);
        i1.setProduto(p1);

        Pedido pd1 = new Pedido(1231312, i1);
        System.out.println(pd1.getCodigoPedido());
        System.out.println("Valor total do Pedido:");
        System.out.println(pd1.getItempedido().getSubtotal());


        
    
    }
}