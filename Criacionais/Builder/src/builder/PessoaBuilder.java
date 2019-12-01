package builder;

public class PessoaBuilder{
    private Pessoa pessoa;
    
    public PessoaBuilder(){
        pessoa = new Pessoa();
    }
    
    public PessoaBuilder comNome(String nome){
        pessoa.setNome(nome);
        return this;
    }
    
    public PessoaBuilder temIdade(int idade){
        pessoa.setIdade(idade);
        return this;
    }
    
    public Pessoa build(){
        return pessoa;
    }
}
