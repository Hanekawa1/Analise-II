package singleton;

public class Singleton {
    
    public static void main(String[] args) {
        Conexao conexao = new Conexao("mongodb+srv://localhost:27001/mongodb");
        conexao.getInstancia("mongodb+srv://localhost:27001/mongodb");
        conexao.exibeConexao();
        conexao.getInstancia("");
        conexao.exibeConexao();
    }
    
}
