package bridge;

public class Zip implements IModoDeExportacao{
    @Override
    public void finalizar(){
        System.out.println("Exportando em .zip...");
    }
}
