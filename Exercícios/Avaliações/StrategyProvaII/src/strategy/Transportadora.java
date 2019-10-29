package strategy;

public class Transportadora implements ModoDeEntrega{
    @Override
    public void entrega(){
        System.out.println("Entrega via transportadora.");
    }
}
