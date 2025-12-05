package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class ExemploLambda {

    public static void main(String[] args) {

        Runnable lambda = () -> System.out.println("Executando lambda 1");
        new Thread(lambda).start();


        new Thread(() -> System.out.println("Teste")).start();

        MyEventConsumer testsolo = a -> imprimir(a);
        testsolo.consumer("TESTE");
    }

    private static void imprimir(Object o) {
        System.out.println(o);
    }


}
