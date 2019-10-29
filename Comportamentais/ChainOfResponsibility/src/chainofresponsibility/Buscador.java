package chainofresponsibility;

public abstract class Buscador {
   
    private Buscador proximo;
    
    public abstract boolean buscar();
    
    protected void buscarEmSequencia(){
        if(buscar()){
            System.out.println("Achou");
        } else {
            if(this.proximo == null){
                System.out.println("Fila acabou");
            }
            
            System.out.println("Nada ainda...");
            this.proximo.buscarEmSequencia();
        }
    }

    public Buscador getProximo() {
        return proximo;
    }

    public void setProximo(Buscador proximo) {
        this.proximo = proximo;
    }
    
    
}
