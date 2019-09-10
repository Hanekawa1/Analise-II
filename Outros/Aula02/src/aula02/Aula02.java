package aula02;

public class Aula02 {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco e = new Endereco();
        
        e.setRua("Major Gote");
        p.setEndereco(e);
        System.out.println(p.getRua());
    }    
}
