package observer;

public class Termometro {
    private Observador observador;
    private Double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        observador.notifica();
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }
}
