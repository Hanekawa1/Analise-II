package pkg3patterns;

public class ClasseFactory {
    public Classe fabricaClasse(String classe){
        if(classe.equalsIgnoreCase("Mago")){
            return new Mago();
        } else if(classe.equalsIgnoreCase("Guerreiro")){
            return new Guerreiro();
        } else if (classe.equalsIgnoreCase("Cacador")){
            return new Cacador();
        } else {
            return new Guerreiro();
        }
    }
}
