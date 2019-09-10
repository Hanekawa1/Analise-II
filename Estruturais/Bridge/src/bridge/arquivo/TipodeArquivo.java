package bridge.arquivo;

import bridge.IModoDeExportacao;

public abstract class TipodeArquivo {
    
    private IModoDeExportacao modoDeExportacao;
    
    public void gerarArquivo(){
        buscar();
        exportar(); 
        finalizar();
    }
    
    public void buscar(){
        System.out.println("Buscando..."); 
    }
    
    private void finalizar(){
        modoDeExportacao.finalizar();
    }
    
    protected abstract void exportar();

    public IModoDeExportacao getModoDeExportacao() { return modoDeExportacao; }

    public void setModoDeExportacao(IModoDeExportacao modoDeExportacao) { this.modoDeExportacao = modoDeExportacao; }   
}
