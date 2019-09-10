package factorymethod;

public class PizzaFactory {
       
    public Pizza fabricaPizza(String sabor){
        if(sabor.equalsIgnoreCase("Calabresa")){
            return new Calabresa();
        } else if (sabor.equalsIgnoreCase("Moda")){
            return new Moda();
        }
        return null;
    }
}
