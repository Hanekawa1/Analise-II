package strategyprova;

public class MaoDireita implements IModoDeSegurarArma{
    
    @Override
    public void pegaArma(){
        System.out.println("Segurando arma com a mão Direita.");
    }
}
