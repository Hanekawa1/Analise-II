package strategy;

public class Strategy {

    public static void main(String[] args) {
        Compra televisao = new Compra();
        
        televisao.setModoDeEntrega(new Sedex());     
        televisao.modoEntrega();
        
        televisao.setModoDeEntrega(new PAC());
        televisao.modoEntrega();
        
        televisao.setModoDeEntrega(new Transportadora());
        televisao.modoEntrega();
        
    }
    
}
