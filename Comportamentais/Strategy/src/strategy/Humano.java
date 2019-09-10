package strategy;

public class Humano {
    private IModoDeComer modoDeComer;
    
    //Modo default, sem argumentos
    public Humano(){
        this.modoDeComer = new Garfo();
    }
    
    //Modo com argumentos, necessita argumento para criação
    public Humano(IModoDeComer modoDeComer){
        this.modoDeComer = modoDeComer;
    }
    
    public void setModoDeComer(IModoDeComer modoDeComer){ this.modoDeComer = modoDeComer; }
    
    public void comer(){
        this.modoDeComer.come();
    }    
}
