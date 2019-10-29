package composite;

public class Composto implements Produto {

    private Produto produto1;
    private Produto produto2;

    public Composto(Produto produto1, Produto produto2) {
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    @Override
    public Double getPreco() {
        return this.produto1.getPreco() + this.produto2.getPreco();
    }

    @Override
    public String getDescricao() {
        return this.produto1.getDescricao() + " + " + this.produto2.getDescricao();
    }
}
