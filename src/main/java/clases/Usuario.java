package clases;


import com.mongodb.DB;
import com.mongodb.DBObject;

public class Usuario {
    private String idUsuario;

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
