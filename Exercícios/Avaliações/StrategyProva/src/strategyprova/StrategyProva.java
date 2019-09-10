package strategyprova;

//Altera o comportamento do método em tempo de execução.
public class StrategyProva {

    public static void main(String[] args) {
        
        Player p = new Player();
        
        p.setModoDeSegurarArma(new MaoDireita());
        p.segurarArma();
        
        p.setModoDeSegurarArma(new MaoEsquerda());
        p.segurarArma();
    }
}
