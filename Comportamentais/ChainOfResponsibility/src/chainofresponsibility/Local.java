package chainofresponsibility;

public class Local extends Buscador{
    
    private Buscador proximo;
    
    @Override
    public boolean buscar(){
        System.out.println("Buscando local...");
        return false;
    }
}
