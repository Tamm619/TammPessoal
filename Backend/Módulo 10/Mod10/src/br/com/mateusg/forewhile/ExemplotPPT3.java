package br.com.mateusg.forewhile;

/**
 * @author Mateus Gonçalves
 */
public class ExemplotPPT3 {

    public static void main(String[] args){

        for (int contador=1; contador<=1000; contador++){
            if (contador %5 != 0){
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
