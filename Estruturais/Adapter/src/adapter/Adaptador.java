package adapter;

public class Adaptador extends CircleDrawv1{
    
    @Override
    public void desenha(int raio){
        CircleDrawv2 novaVersao = new CircleDrawv2();
        novaVersao.desenhaColorido(raio, "preto");
    }
}
