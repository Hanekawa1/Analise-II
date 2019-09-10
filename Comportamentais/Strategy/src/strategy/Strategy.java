package strategy;

public class Strategy {

    public static void main(String[] args) {
        Humano humano = new Humano(new Garfo());
        
        //Instância separada
        IModoDeComer garfo = new Garfo();
        humano.setModoDeComer(garfo);
        humano.comer();
        
        //Instância direta
        humano.setModoDeComer(new Hashi());
        humano.comer();
        
    }  
}
