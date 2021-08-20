public class Produto {

    private final String nomeProduto;
    private double valorProduto;
    private double custoProduto;

    public Produto(String nome, double valor, double custo) {
        nomeProduto = nome;
        valorProduto = valor;
        custoProduto = custo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public double getLucro () {
        return valorProduto - custoProduto;
    }
}
