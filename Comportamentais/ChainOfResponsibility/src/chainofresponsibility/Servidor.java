package chainofresponsibility;

public class Servidor extends Buscador{
    
    
    @Override
    public boolean buscar(){
        System.out.println("Buscando no servidor...");
        return true;
    }
}
