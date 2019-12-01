
package builder;

public class Builder {

    public static void main(String[] args) {

        Pessoa p = new PessoaBuilder()
                .comNome("Wender")
                .temIdade(22)
                .build();
        System.out.println(p.getNome() + p.getIdade());
    }
    
}
