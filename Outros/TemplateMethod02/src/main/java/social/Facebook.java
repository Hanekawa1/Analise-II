package social;

public class Facebook extends Postagem{
    
    @Override
    public void login(){
        System.out.println("Logado como facebook");
    }
    
    @Override
    public void logout(){
        System.out.println("Deslogado como facebook");
    }
}
