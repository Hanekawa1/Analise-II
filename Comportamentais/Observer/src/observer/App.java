package observer;

public class App implements Observador{
    
   @Override
   public void notifica(){
       System.out.println("sou um app e algo mudou");
   } 
}
