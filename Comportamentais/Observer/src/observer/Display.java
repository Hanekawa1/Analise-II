package observer;

public class Display implements Observador{
    
    @Override
    public void notifica(){
        System.out.println("sou um display e mudou alguma coisa");
    }
}
