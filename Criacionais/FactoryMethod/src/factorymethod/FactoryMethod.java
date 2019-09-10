package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();
        Pizza p = pf.fabricaPizza("Calabresa");
        p.sabor();
    }
    
}
