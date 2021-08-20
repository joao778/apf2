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
