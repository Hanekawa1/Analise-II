package composite;

public class Simples implements Produto {

    private Double preco;
    private String descricao;

    public Simples(Double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

}
