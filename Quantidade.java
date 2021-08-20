public class Quantidade {

    private final int qtdProd;
    private final Produto prod;

    public Quantidade (int qtdProd, Produto prod) {
        this.qtdProd = qtdProd;
        this.prod = prod;
    }

    public double lucroTotal (){
        return qtdProd*prod.getLucro();
    }

    public double custoTotal () {
        return qtdProd* prod.getCustoProduto();
    }
}
