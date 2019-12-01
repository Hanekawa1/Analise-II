package pkg3patterns;

public class Main {

    public static void main(String[] args) {
        Personagem a = new PersonagemBuilder()
                .comNome("Légolas")
                .doSexo("Masculino")
                .deRaca("Elfo")
                .deClasse("Cacador")
                .build();
        a.Identidade();
    }
    
}
