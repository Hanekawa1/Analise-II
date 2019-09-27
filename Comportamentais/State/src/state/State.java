package state;

public class State {

    public static void main(String[] args) {
        Personagem Caitlyn = new Personagem();
        Caitlyn.setEstado(new Normal());
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.setEstado(new Machucado());
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.setEstado(new Normal());
                
        //O método "caiuNoBuraco" troca o estado sem o cliente fazer isso na mão
        Caitlyn.caiuNoBuraco();
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.setEstado(new Normal());
        
        //O método vai tirando vida do personagem, para que a troca de estado
        //seja alterada de acordo com o comportamento dele no jogo, sem que
        //o cliente troque manualmente o estado do personagem
        Caitlyn.sofrerDano(10);
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.sofrerDano(75);
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.sofrerDano(10);
        Caitlyn.atirar();
        Caitlyn.andar();
        
        Caitlyn.pegaEstrela();
        Caitlyn.atirar();
        Caitlyn.andar();
        
    }   
}
