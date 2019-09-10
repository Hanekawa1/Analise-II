package strategyfactory;

public class StrategyFactory {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.setIdioma(new Ingles());
        sistema.mensagemSair();
        
        IdiomasFactory idiomasFactory = new IdiomasFactory();
        Idioma portugues = idiomasFactory.mensagem("BR");
        sistema.setIdioma(portugues);
        sistema.mensagemSair();
        
        Idioma japones = idiomasFactory.mensagem("JP");
        sistema.setIdioma(japones);
        sistema.mensagemSair();
    }
    
}
