package clases;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoIterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Mario on 02/06/2015.
 */

public class Driver {
    public Driver(){
        /**** Connect to MongoDB ****/
        // Since 2.10.0, uses MongoClient
        LogManager.getLogManager().reset();
        Logger globalLogger = Logger.getLogger(java.util.logging.Logger.GLOBAL_LOGGER_NAME);
        globalLogger.setLevel(java.util.logging.Level.OFF);

        MongoClient mongo = new MongoClient("192.168.35.137", 27017);


        /**** Get database ****/
        // if database doesn't exists, MongoDB will create it for you
        DB db = mongo.getDB("mean-dev");

        /**** Get collection / table from 'testdb' ****/
        // if collection doesn't exists, MongoDB will create it for you
        //DBCollection table = db.getCollection("users");
        Set<String> tables = db.getCollectionNames();
        for (String coll :tables){
            System.out.println(coll);
        }


       /* //get the conection
        db = (DB) mongoclient.getDatabase("Tienda-online");
        table = db.getCollection("Categorias");*/

    }
}
