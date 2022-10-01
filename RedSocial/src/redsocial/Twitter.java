package redsocial;

import java.util.Date;

public class Twitter extends RedSocial {
    
    //Atributos
    public int id;
    public String noticia;
    public Date fecha;
    
    //Constructor
    public Twitter(int id, String noticia, Date fecha,String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }
    
    //Get y Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }
    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    
}
