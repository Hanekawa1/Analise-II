package template;

import relatorios.Relatorio;
import relatorios.PDF;

public class Template {
    public static void main(String[] args) {
        Relatorio r = new PDF();
        r.gerar();
    }
}
