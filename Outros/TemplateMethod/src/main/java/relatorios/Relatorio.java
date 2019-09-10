package relatorios;

public abstract class Relatorio {
    
    private void buscar(){
        System.out.println("Buscando...");
    }
    
    private void calcular(){
        System.out.println("Calculando...");
    }
    
    protected abstract void exportar();
    
    public void gerar(){
        buscar();
        calcular();
        exportar();
    }
}