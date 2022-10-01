//Esta sera mi superclase, hare mis metodos get, set y constructor por costumbre

package redsocial;

public class RedSocial {
    //atributos
    public String usuario;
    public String password;
    
    //Get y Set
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Constructor
    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
}
