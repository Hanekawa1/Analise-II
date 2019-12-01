package singleton;

public class Conexao {
    private static Conexao instancia;
    private String connectionString;
    
    public Conexao(String connectionString){
        this.connectionString = connectionString;
    }
    
    public static Conexao getInstancia(String connectionString){
        if(instancia == null){
            instancia = new Conexao(connectionString);
            return instancia;
        } else {
            return instancia;
        }
    }
    
    public void exibeConexao(){
        System.out.println(this.connectionString);
    }
}
