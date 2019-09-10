package social;

public class Twitter extends Postagem{
    @Override
    protected void login(){
        System.out.println("Logado como Twitter");
    }
    
    @Override
    protected void logout(){
        System.out.println("Deslogado como Twitter");
    }
}
