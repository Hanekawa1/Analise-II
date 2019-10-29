package proxy;

public class PlayerFree implements Player{
    @Override
    public void play(){
        System.out.println("Festival Radioca...");
        new PlayerMusica().play();
    }
}
