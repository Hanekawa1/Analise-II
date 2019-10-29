package strategy;

public class Compra {
    private ModoDeEntrega modoDeEntrega;

    public void modoEntrega(){
        this.modoDeEntrega.entrega();
    }
    
    public ModoDeEntrega getModoDeEntrega() {
        return modoDeEntrega;
    }

    public void setModoDeEntrega(ModoDeEntrega modoDeEntrega) {
        this.modoDeEntrega = modoDeEntrega;
    }  
}
