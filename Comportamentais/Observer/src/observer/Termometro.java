package observer;

public class Termometro extends Observado{
    private Double temperatura;
    
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificaTodos();
    }
}
