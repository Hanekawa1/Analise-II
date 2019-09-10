package strategyfactory;

public class Sistema {
    
    private Idioma idioma;
    
    public void mensagemSair(){
        idioma.sair();
    }

    public Idioma getIdioma() { return idioma; }
    public void setIdioma(Idioma idioma) { this.idioma = idioma; }
    
}
