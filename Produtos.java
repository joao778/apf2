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
