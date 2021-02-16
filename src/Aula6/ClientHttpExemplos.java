package Aula6;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHttpExemplos {
    public static void main(String[] args) throws IOException, InterruptedException {

        connectAndPrintURLJavaOracle();
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
      // usando este código para implementar o Http client
     /*   try {
            var url = new URL( "https://docs.oracle.com/javase/10/language/" );
            var urlConnection = url.openConnection();

           try( var bufferedReader = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()))) {
               System.out.println( bufferedReader.lines().collect( Collectors.joining() ).replaceAll( ">", ">\n" ));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri( URI.create( "https://docs.oracle.com/javase/10/language/" ))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

           HttpResponse<String> response = httpClient.send( request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code :: "+ response.statusCode());
        System.out.println("Headers :: " + response.headers());
        System.out.println(response.body());
    }
}
