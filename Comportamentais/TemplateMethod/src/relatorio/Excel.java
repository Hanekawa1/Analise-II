package relatorio;

public class Excel extends Relatorio{
    
    @Override
    protected void salvar(){
        System.out.println("Salvando como Excel...");
    }
}
