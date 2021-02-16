package Aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplosEstudados {
    public static void main(String[] args) throws IOException {
       // printarNomeCompleto( "Jesse", "Caetano" );
       // printarSoma( 7,11 );
       // printarSoma_1( 1,2,3,4,5,6,7,8,9,10);
        printarSoma_2Inferencia( 1,2,3,4,5,6,7,8,9,10);
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {
        var url = new URL( "https://docs.oracle.com/javase/10/language/" );
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()) );
        System.out.println(bufferedReader.lines().collect( Collectors.joining()).replaceAll( ">",">\n" ));
    }

    public static void printarNomeCompleto(String   nome, String sobrenome){

       var nomeCompleto = String.format( "%s %s", nome,sobrenome );
      // System.out.println(nomeCompleto);



    }
    public static void printarSoma(int a, int b){
        var soma = a+b;
        System.out.println(soma);
    }
    public static void printarSoma_1(int... numeros){
        int soma;
        if(numeros.length> 0){
            soma=0;
            for(var numero : numeros){
                soma+=numero;
            }
            System.out.println("A soma é "+ soma);
        }

    }
    // com inferencia
    public static void printarSoma_2Inferencia(int... numeros){
        int soma;
        if(numeros.length> 0){
            soma=0;
            for(int numero=0; numero<numeros.length;numero++){
                soma+=numeros[numero];
            }
            System.out.println("A soma é "+ soma);
        }

    }

}
