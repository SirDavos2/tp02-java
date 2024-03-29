package testedavid;
import testedavid.example.PedidoPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealizaPedidoTest {

    @Test
    public void testPedido1() {
        PedidoPizza pedido1 = new PedidoPizza("Calabresa e mocoto", "média", 2, true);
        double totalEsperado = (25.0 * 2) + 5.0; // preço médio * quantidade + taxa de entrega
        assertEquals(totalEsperado, pedido1.calcularTotal());
    }

    @Test
    public void testPedido2() {
        PedidoPizza pedido2 = new PedidoPizza("Salame com churros", "grande", 1, false);
        double totalEsperado = 30.0; // preço grande * quantidade
        assertEquals(totalEsperado, pedido2.calcularTotal());
    }

    // Adicione mais testes para outros pedidos com diferentes cenários
}