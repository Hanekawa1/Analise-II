package social;

public abstract class Postagem {
    public void post(){
        System.out.println("Postagem");
    }
    
    public abstract void login();
    public abstract void logout();
}
