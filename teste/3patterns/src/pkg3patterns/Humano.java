package pkg3patterns;

public class Humano extends Raca {
    
    @Override    
    public void stats(){
        System.out.println
        ("Classe: Humano\n"
        + "Inteligência: "+ this.getInteligencia() +"\n"
        + "Força: " + this.getForca() +"\n"
        + "Agilidade: "+ this.getAgilidade() +"\n");
    }
}
