package state;

public class Machucado implements Estado{
    
    @Override
    public void atira(){
        System.out.println("Atira com dificuldade");
    }
    
    @Override
    public void move(){
        System.out.println("Move devagarmente");
    }
}
