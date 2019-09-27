package state;

public class Normal implements Estado{
    
    @Override
    public void atira(){
        System.out.println("Atira normal");
    }
    
    @Override
    public void move(){
        System.out.println("Move normal");
    }
}
