package pkg3patterns;

public class RacaFactory {
    public Raca fabricaRaca(String raca){
        if(raca.equalsIgnoreCase("Elfo")){
            return new Elfo();
        } else if(raca.equalsIgnoreCase("Humano")){
            return new Humano();
        } else if(raca.equalsIgnoreCase("Orc")){
            return new Orc();
        } else {
            return new Humano();
        }
    }
}
