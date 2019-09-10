package relatorio;

public class PDF extends Relatorio{
    
    @Override
    protected void salvar(){
        System.out.println("Salvando como PDF...");
    }
}
