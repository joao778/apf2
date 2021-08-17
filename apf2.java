import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Produtos {

    private List<Produto> listaProdutos;

    public Produtos (Produto... listaProdutos) {
        this.listaProdutos = new ArrayList<>(Arrays.asList(listaProdutos));
    }

    public Produtos () {
        this.listaProdutos = new ArrayList<>();
    }

    public void colocaNaLista (Produto prod) {
        if (!listaProdutos.contains(prod)) {
            listaProdutos.add(prod);
        }
    }

    public void retiraDaLista (Produto prod) {
        if (!listaProdutos.contains(prod)){
            listaProdutos.remove(prod);
        }
    }

    public String calcularProduto (int qtdProd, Produto prod) {
        if (listaProdutos.contains(prod)) {
            Quantidade qtd = new Quantidade(qtdProd,prod);
            return String.format("O custo e lucro total " +
                    "do produto %s" +
                    " ficará, respectivamente: %.2f / %.2f",
                    prod.getNomeProduto(),
                    qtd.custoTotal(), qtd.lucroTotal());
        }
        throw new IllegalArgumentException("Produto não existe na lista!");
    }
}

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

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto("bolsa", 3.20, 1.25);
        Produto p2 = new Produto("toalha", 5.67, 2.75);
        Produto p3 = new Produto("pano", 1.89, 0.20);

        Produtos lista = new Produtos(p1, p2);

        String resultado = lista.calcularProduto(3,p1);
        System.out.println(resultado);

        //Lança um erro, pois produto p3 não existe na lista -->
        lista.calcularProduto(5, p3);
    }
}

