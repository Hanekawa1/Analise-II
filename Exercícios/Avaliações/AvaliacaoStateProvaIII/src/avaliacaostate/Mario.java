package avaliacaostate;

public class Mario {
    public StatusAtual status;

    public StatusAtual getStatus() {
        return status;
    }

    public void setStatus(StatusAtual status) {
        this.status = status;
    }
    
    public void exibeStatus(){
        status.movimentacao();
        status.ataque();
        status.pulo();
    }
}
