package state;

public class Personagem {
    private Estado estado;
    private int life = 100;

    public void setEstado(Estado estado) { this.estado = estado; }
    
    public void atirar(){
        this.estado.atira();
    }
    
    public void andar(){
        this.estado.move();
    }
    
    public void caiuNoBuraco(){
        this.estado = new Machucado();
    }
    
    public void sofrerDano(int dano){
        this.life -= dano;
        if(this.life < 10){
            this.estado = new Machucado();
        }
    }
    
    public void pegaEstrela(){
        this.life = 100;
        this.estado = new Invencivel();
    }
}
