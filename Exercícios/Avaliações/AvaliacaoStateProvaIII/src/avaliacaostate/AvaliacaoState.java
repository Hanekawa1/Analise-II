package avaliacaostate;

public class AvaliacaoState {

    public static void main(String[] args) {
        Mario mario = new Mario();
        
        mario.setStatus(new Pequeno());
        mario.exibeStatus();
        System.out.println();
        
        mario.setStatus(new Estrelinha());
        mario.exibeStatus();
        System.out.println();
        
        mario.setStatus(new Florzinha());
        mario.exibeStatus();
        System.out.println();
        
        mario.setStatus(new Normal());
        mario.exibeStatus();
        
    }
    
}
