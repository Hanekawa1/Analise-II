package composite;

public class Composite {

    public static void main(String[] args) {

        Produto shampoo = new Simples(3.50d, "Shampoo para cabelos secos");
        Produto condicionador = new Simples(8.50d, "Condicionador legal");
        Produto kit = new Composto(shampoo, condicionador);
        //System.out.println(kit.getDescricao() + " R$" + kit.getPreco());

        Produto sabonete = new Simples(0.5d, "Sabonete Dove");
        Produto cesta = new Composto(sabonete, kit);
        // System.out.println(cesta.getDescricao() + " R$" + cesta.getPreco());

        CupomFiscal cupom = new CupomFiscal();
        cupom.adicionaProduto(shampoo);
        cupom.adicionaProduto(kit);
        cupom.adicionaProduto(condicionador);

        cupom.imprimeCupom();
        System.out.println("Total: R$ " + cupom.calculaPreco());
        //cupom.i2();
    }
}
