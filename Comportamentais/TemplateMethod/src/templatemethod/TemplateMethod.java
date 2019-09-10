package templatemethod;

import relatorio.Relatorio;
import relatorio.PDF;
import relatorio.Excel;


public class TemplateMethod {

    public static void main(String[] args) {
        Relatorio r = new PDF();
        Relatorio r2 = new Excel();
        r.gerar();
        System.out.println("\n");
        r2.gerar();
        
    }
    
}
