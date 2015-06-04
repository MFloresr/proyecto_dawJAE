package clases;

import formularios.frmLogin;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;

//import com.google.gson.Gson;
//import jdk.nashorn.api.scripting.JSObject;

public class Principal {

    public static void main(String args[]) throws Exception {
        frmLogin miLogin = new frmLogin();
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        //Driver driver = new Driver();

        //GETP http = new GETP();

        System.out.println("Testing 1 - Send Http GET request");
        //http.sendGet();

        System.out.println("\nTesting 2 - Send Http POST request");
        //http.sendPost();TODO

    }



    private final String USER_AGENT = "Mozilla/5.0";
    // HTTP POST request
    private void sendPost() throws Exception {

        String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
        //curl -i 'http://url.com' -X POST -H "Content-Type: application/json" -H "Accept: application/json" -d '{"auth": { "passwordCredentials": {"username": "adm", "password": "pwd"},"tenantName":"adm"}}'
        //curl -X POST -H "Content-Type: application/json" -H "Cache-Control: no-cache" -H "Postman-Token: 6166d49e-aaaf-6bb0-9495-b3a6be3423c4" -d '{"nombre":"Torres"}' http://192.168.1.43:3000/categorias
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
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
        System.out.println(response.toString());

    }
}
