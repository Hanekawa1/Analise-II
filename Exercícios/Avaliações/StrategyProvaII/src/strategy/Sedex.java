package strategy;

public class Sedex implements ModoDeEntrega{
    @Override
    public void entrega(){
        System.out.println("Entrega via Sedex.");
    }
}
