package adapter;

public class Adapter {

    public static void main(String[] args) {
        
        //Cenário sem o Adapter
        CircleDrawv1 v1 = new CircleDrawv1();
        v1.desenha(5);
        
        //Cenário com o Adapter
        CircleDrawv1 velho = new Adaptador();
        velho.desenha(5);
    }  
}
