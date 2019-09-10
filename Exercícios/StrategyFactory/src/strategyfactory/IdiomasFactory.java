package strategyfactory;

public class IdiomasFactory {
    
    public Idioma mensagem(String idioma){
        if(idioma.equalsIgnoreCase("BR")){
            return new Portugues();
        } else if (idioma.equalsIgnoreCase("JP")) 
            return new Japones();
        else {
            return new Ingles();
        }
    }
}
