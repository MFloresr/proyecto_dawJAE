package clases;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.util.List;


public class Datos {


/*
    MongoClient mongoClient = new MongoClient( "192.168.35.136" , 27017 );

    DB db = mongoClient.getDB( "test" );
    List dbs = mongoClient.getDatabaseNames();
    System.out.println(dbs);

    MongoClient MongoConexion = new MongoClient("192.168.35.136", 27017);
    public Datos() miColecion = db.getCollection("Tienda-online");*/
    private Usuario MisUsuarios[] = new Usuario[0];

    public Datos(){
        
    }
    public boolean validarUsuario(String usuario, String clave){
        if (usuario.equalsIgnoreCase("mario") && clave.equals("123456")){

            return true;
        }else{
            return false;
        }

    }
}
