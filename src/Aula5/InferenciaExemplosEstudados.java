package Aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplosEstudados {
    public static void main(String[] args) throws IOException {
        testar( "Jesse", "Caetano" );
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL( "https://docs.oracle.com/javase/10/language/" );
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()) );
        System.out.println(bufferedReader.lines().collect( Collectors.joining()).replaceAll( ">",">\n" ));
    }

    public static void testar(String   nome, String sobrenome){
        var nomeCompleto = String.format( "%s %s", nome,sobrenome );
        System.out.println(nomeCompleto);

    }
}
