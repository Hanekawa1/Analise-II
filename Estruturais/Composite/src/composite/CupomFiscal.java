package composite;

import java.util.List;
import java.util.ArrayList;

public class CupomFiscal {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void imprimeCupom() {
        System.out.println("Descrição do Produto - Preço");
        for (Produto produto : produtos) {
            System.out.println(produto.getDescricao() + " - R$" + produto.getPreco());
        }
    }
    
    public Double calculaPreco() {
        Double preco = 0d;
        for (Produto produto : produtos) {
            preco += produto.getPreco();
        }
        return preco;
    }

    public String concatenaDescricao() {
        String descricao = "";
        for (Produto produto : produtos) {
            descricao += produto.getDescricao();
        }
        return descricao;
    }



    public void i2() {
        produtos.forEach(System.out::println);
    }
}
