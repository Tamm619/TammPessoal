package br.com.mateusg.ifelse;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class ExemploAnimal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu animal: ");
        String texto = scan.next();
        String animal = exemploIf(texto);
        System.out.println(animal);
    }

    public static String exemploIf(String animal){
        String result;
        if (animal.equalsIgnoreCase("cachorro") || animal.equalsIgnoreCase("gato")){
            result = "animal domestico";
        } else if (animal.equalsIgnoreCase("tigre")){
            result = "animal selvagem";
        } else {
            result = "animal desconhecido";
        }
        return result;
    }
}
