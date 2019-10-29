package proxy;

public class Proxy {

    public static void main(String[] args) {
        Player p = new PlayerFree();
        p.play();
        
        Player p2 = new PlayerMusica();
        p2.play();
    } 
}
