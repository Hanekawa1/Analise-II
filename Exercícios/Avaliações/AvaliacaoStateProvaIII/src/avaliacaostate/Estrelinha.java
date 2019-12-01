package avaliacaostate;

public class Estrelinha implements StatusAtual{
    
    @Override
    public void movimentacao(){
        System.out.println("Mário se move muito rápido!!!");
    }
    
    @Override
    public void ataque(){
        System.out.println("Mário atropela os inimigos!!!");
    }
    
    @Override
    public void pulo(){
        System.out.println("Mário pula bastante alto!!!");
    }
}
