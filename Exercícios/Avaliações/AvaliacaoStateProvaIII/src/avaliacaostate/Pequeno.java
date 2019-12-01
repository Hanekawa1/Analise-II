package avaliacaostate;

public class Pequeno implements StatusAtual{
    
    @Override
    public void movimentacao(){
        System.out.println("Mário se move bem devagar...");
    }
    
    @Override
    public void ataque(){
        System.out.println("Mário precisa pular 2x para finalizar um inimigo...");
    }
    
    @Override
    public void pulo(){
        System.out.println("Mário pula bem baixinho...");
    }
}
