package Aula01;

public class Caranguejo extends Animal{
    
    @Override
    public void som(){
        System.out.println("Glub glub");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Para um lado e para o outro");
    }
}
