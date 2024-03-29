package testedavid.example;

public class PedidoPizza {
    private String sabor;
    private String tamanho;
    private int quantidade;
    private boolean paraEntrega;

    public PedidoPizza(String sabor, String tamanho, int quantidade, boolean paraEntrega) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.paraEntrega = paraEntrega;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isParaEntrega() {
        return paraEntrega;
    }

    public void setParaEntrega(boolean paraEntrega) {
        this.paraEntrega = paraEntrega;
    }

    public double calcularTotal() {
        double precoUnitario;
        if (tamanho.equalsIgnoreCase("pequena")) {
            precoUnitario = 20.0;
        } else if (tamanho.equalsIgnoreCase("média")) {
            precoUnitario = 25.0;
        } else {
            precoUnitario = 30.0;
        }

        double precoTotal = precoUnitario * quantidade;
        if (paraEntrega) {
            precoTotal += 5.0; //
        }

        return precoTotal;
    }
}
