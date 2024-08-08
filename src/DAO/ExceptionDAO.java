package dao;

public class ExceptionDAO extends Exception {
    
    // mensagens de erro de conexão
    public ExceptionDAO(String mensagem) {
        super(mensagem);
    }
    
}
