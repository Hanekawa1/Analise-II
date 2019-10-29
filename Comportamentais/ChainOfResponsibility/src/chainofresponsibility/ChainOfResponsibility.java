package chainofresponsibility;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Buscador local = new Local();
        Buscador servidor = new Servidor();
        Buscador cloud = new Cloud();
        
        local.setProximo(cloud);
        cloud.setProximo(local);
        cloud.setProximo(servidor);
        local.buscarEmSequencia();
    }
    
}
