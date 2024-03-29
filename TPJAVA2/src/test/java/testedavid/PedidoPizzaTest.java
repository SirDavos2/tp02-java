package testedavid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import testedavid.example.PedidoPizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoPizzaTest {

    private PedidoPizza pedido;

    @BeforeEach
    public void setUp() {
        pedido = new PedidoPizza("Calabresa e mocoto", "média", 2, true);
    }

    @Test
    public void testCalcularTotalParaEntrega() {
        double totalEsperado = (25.0 * 2) + 5.0; // preço médio * quantidade + taxa de entrega
        assertEquals(totalEsperado, pedido.calcularTotal());
    }

    @Test
    public void testCalcularTotalSemEntrega() {
        pedido.setParaEntrega(false);
        double totalEsperado = 25.0 * 2; // preço médio * quantidade
        assertEquals(totalEsperado, pedido.calcularTotal());
    }

}
