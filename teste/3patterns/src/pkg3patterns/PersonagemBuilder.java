package pkg3patterns;

public class PersonagemBuilder {
    private Personagem personagem;
    
    public PersonagemBuilder(){
        personagem = new Personagem();
    }
    
    public PersonagemBuilder comNome(String nome){
        personagem.setNome(nome);
        return this;
    }
    
    public PersonagemBuilder doSexo(String sexo){
        personagem.setSexo(sexo);
        return this;
    }
    
    public PersonagemBuilder deRaca(String raca){
        RacaFactory racaFactory = new RacaFactory(); 
        personagem.setRaca(racaFactory.fabricaRaca(raca));
        return this;
    }
    
    public PersonagemBuilder deClasse(String classe){
        ClasseFactory classeFactory = new ClasseFactory();
        personagem.setClasse(classeFactory.fabricaClasse(classe));
        return this;
    }
    
    public Personagem build(){
        return personagem;
    }
}
