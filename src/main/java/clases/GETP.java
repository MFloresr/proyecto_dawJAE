package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Mario on 04/06/2015.
 */
public class GETP {
    private final String USER_AGENT = "Mozilla/5.0";
    private String url = "";
    private URL obj = null;
    private String httpMetodo;


/*    public GETP(String url, String httpMetodo){
        this.url = url;
        this.httpMetodo = httpMetodo;
    }*/
    public String sendGet(String url, String httpMetodo) throws Exception {
        /*try{
            obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(httpMetodo);
            con.setRequestProperty("Accept", "application/json");
            if (con.getResponseCode() != 200){
                throw new RuntimeException("Failed : HTTP error code : " + con .getResponseCode());
            }
            BufferedReader in = new BufferedReader(new InputStreamReader((con.getInputStream())));
            String inputLine;
            System.out.println("Output from Server .... \n");
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                return inputLine;
            }
            con.disconnect();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }*/

        //String url = "http://www.google.com/search?q=mkyong";

        //String url = "http://192.168.1.43:3000/productos/555f3dc0d9af4acb49f87d9d";
        //String url = "http://192.168.15.84:3000/categorias";

        obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod(httpMetodo);

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();


        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());
        return response.toString();
    }
}
