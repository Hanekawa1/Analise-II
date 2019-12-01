package avaliacaostate;


public class Normal implements StatusAtual{
        
    @Override
    public void movimentacao(){
        System.out.println("Mário se move normalmente.");
    }
    
    @Override
    public void ataque(){
        System.out.println("Mário finaliza com um pulo.");
    }
    
    @Override
    public void pulo(){
        System.out.println("Mário pula normalmente.");
    }
}
