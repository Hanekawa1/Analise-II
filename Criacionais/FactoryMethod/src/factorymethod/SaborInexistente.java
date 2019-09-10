
package factorymethod;

public class SaborInexistente extends Pizza{
    
    @Override
    public void sabor(){
        System.out.println("Sabor inexistente");
    }
    
    @Override
    public boolean isValid(){
        return false;
    }
}
