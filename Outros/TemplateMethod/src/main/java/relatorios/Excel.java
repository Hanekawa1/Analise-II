package relatorios;

public class Excel extends Relatorio{
    
    @Override
    protected void exportar(){
        System.out.println("Exportando Excel...");
    }
}
