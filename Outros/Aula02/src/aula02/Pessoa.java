package aula02;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    
    public String getRua(){
        return this.endereco.getRua();
    }
}
