package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    public static void main(String[] args) {
        Termometro t = new Termometro();
        Barometro b = new Barometro();
        
        Display display = new Display();
        App app = new App();
        
        t.addObservador(display);
        t.addObservador(app);
        
        t.setTemperatura(100d);
        t.setTemperatura(105d);
        
        b.addObservador(new Display());
        b.setPressao(20d);
        
        /*
        List<String> list = new ArrayList<>();
        List<Pessoa> lista = new ArrayList<>();
    
        list.add("a");
        list.add("b");
        list.add("c");
            
        System.out.println("Tamanho " + list.size());
            
        for(int i = 0; i < list.size(); i++){
            System.out.println("Elemento " + list.get(i));
        }
            
        for(String item: list){
            System.out.println("Elemento " + item);
        }
        
        lista.add(new Pessoa("Wender"));
        lista.add(new Pessoa("Leogado"));
        lista.add(new Pessoa("Gustavo"));
        
        for(Pessoa item: lista){
            System.out.println(item.getNome());
        }
        */
    } 
}
