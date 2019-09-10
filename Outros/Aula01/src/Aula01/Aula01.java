package Aula01;

public class Aula01 {

    public static void main(String[] args) {
        Animal a = new Gato();
        Animal b = new Cachorro();
        Animal c = new Caranguejo();
        Animal d = new CachorroPulador();
 
        a.som();
        a.movimentar();
        
        b.som();
        b.movimentar();
        
        c.som();
        c.movimentar();
        
        d.som();
        d.movimentar();
    }
}
