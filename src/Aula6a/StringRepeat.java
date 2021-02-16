package Aula6a;

public class StringRepeat{
    public static void main(String[] args) {
     //   metodo1(); foram necessários 5 linhas para escrever o método
        System.out.println("Jesse".repeat( 10 ));// neste apenas uma linha resolve

    }
    private static void metodo1(){
        String nome = "Jesse";
        String aux = "";
        for (int i = 0; i < 10; i++) {
            aux += nome;
        }
        System.out.println( aux );
    }
}
