package testedavid.example;

public class RealizaPedido {
    public static void main(String[] args) {
        PedidoPizza pedido1 = new PedidoPizza("Calabresa e mocoto", "média", 2, true);
        PedidoPizza pedido2 = new PedidoPizza("Salame com churros", "grande", 1, false);

        double totalPedido1 = pedido1.calcularTotal();
        double totalPedido2 = pedido2.calcularTotal();

        System.out.println("Pedido 1:");
        System.out.println("Sabor: " + pedido1.getSabor());
        System.out.println("Tamanho: " + pedido1.getTamanho());
        System.out.println("Quantidade: " + pedido1.getQuantidade());
        System.out.println("Para entrega: " + pedido1.isParaEntrega());
        System.out.println("Total: R$" + totalPedido1);

        System.out.println("\nPedido 2:");
        System.out.println("Sabor: " + pedido2.getSabor());
        System.out.println("Tamanho: " + pedido2.getTamanho());
        System.out.println("Quantidade: " + pedido2.getQuantidade());
        System.out.println("Para entrega: " + pedido2.isParaEntrega());
        System.out.println("Total: R$" + totalPedido2);
    }
}