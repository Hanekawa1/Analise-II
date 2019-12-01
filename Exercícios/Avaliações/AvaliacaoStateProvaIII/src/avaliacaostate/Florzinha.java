package avaliacaostate;

public class Florzinha implements StatusAtual{
    
    @Override
    public void movimentacao(){
        System.out.println("Mário se movimenta pegando fogo!!!");
    }
    
    @Override
    public void ataque(){
        System.out.println("Mário atira bolas de fogo!!!");
    }
    
    @Override
    public void pulo(){
        System.out.println("Mário pula um pouco mais alto que o normal!!!");
    }
}
