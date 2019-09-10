package bridge;

import bridge.arquivo.PDF;
import bridge.arquivo.TipodeArquivo;

public class Bridge {

    public static void main(String[] args) {
        TipodeArquivo t = new PDF();
        t.setModoDeExportacao(new Criptografado());
        t.gerarArquivo();
    }
    
}
