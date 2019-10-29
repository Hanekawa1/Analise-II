package strategy;

public class PAC implements ModoDeEntrega{
    @Override
    public void entrega(){
        System.out.println("Entrega via PAC.");
    }
}
