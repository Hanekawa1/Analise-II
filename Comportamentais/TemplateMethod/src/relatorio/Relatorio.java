package relatorio;

public abstract class Relatorio {
    public void gerar(){
        buscar();
        calcular();
        salvar();
    }
    
    private void buscar(){
        System.out.println("Buscando...");
    }
    
    private void calcular(){
        System.out.println("Calculando...");
    }
    
    protected abstract void salvar();
}
