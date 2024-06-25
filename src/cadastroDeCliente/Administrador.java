/**
 * @author ferreiraluizga
 */
package cadastroDeCliente;

public class Administrador {
    private String user;
    private String email;
    private String senha;
    
    public Administrador(String user, String email, String senha){
        this.user = user;
        this.email = email;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
