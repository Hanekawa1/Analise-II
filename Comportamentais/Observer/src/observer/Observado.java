package observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {
    
   protected List<Observador> observadores = new ArrayList<>();
    
    public void addObservador(Observador observador) {
        this.observadores.add(observador);
    }
    
    protected void notificaTodos() {
        for(Observador o: observadores){
            o.notifica();           
        }
    }
    
    
}
