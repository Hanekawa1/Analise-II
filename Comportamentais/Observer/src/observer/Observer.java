package observer;

public class Observer {

    public static void main(String[] args) {
        Termometro t = new Termometro();
        Display d = new Display();
        App a = new App();
        t.setObservador(a);
        t.setTemperatura(100d);
        t.setTemperatura(105d);
    }
    
}
