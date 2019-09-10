package strategyprova;

public class MaoEsquerda implements IModoDeSegurarArma{
    
    @Override
    public void pegaArma(){
        System.out.println("Segurando arma com a mão Esquerda.");
    }
}
