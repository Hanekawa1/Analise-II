package observer;

public class Barometro extends Observado {
    private Double pressao;

    public Double getPressao() {
        return pressao;
    }

    public void setPressao(Double pressao) {
        this.pressao = pressao;
        notificaTodos();
    }
    
}
