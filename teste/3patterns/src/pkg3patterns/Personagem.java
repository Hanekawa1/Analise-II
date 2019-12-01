package pkg3patterns;

public class Personagem {
    private String nome;
    private String sexo;
    private Raca raca;
    private Classe classe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public void Identidade(){
        this.dados();
        this.getRaca().stats();
        this.getClasse().habilidades();       
    }
    
    public void dados(){
        System.out.println
            ("Nome: " + this.getNome() + "\n"
            +"Sexo: " + this.getSexo());
    }
}
