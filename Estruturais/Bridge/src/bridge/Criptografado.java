package bridge;

public class Criptografado implements IModoDeExportacao{
    @Override
    public void finalizar(){
        System.out.println("Exportando arquivo criptgrafado...");
    }
}
