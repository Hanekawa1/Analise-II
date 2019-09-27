package state;

public class Invencivel implements Estado{
    
    @Override
    public void atira(){
        System.out.println("Atira rápido");
    }
    
    @Override
    public void move(){
        System.out.println("Move correndo");
    }
    
}
