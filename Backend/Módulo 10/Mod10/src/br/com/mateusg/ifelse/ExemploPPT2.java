package br.com.mateusg.ifelse;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class ExemploPPT2 {

    public static void main (String[] args){

        int result = 3;
        if(result > 1){
            System.out.println("Oi");
        }else {
            System.out.println("Não");
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        if(numero > 0 && numero < 5){
            System.out.println("Seu número está entre 1 - 4");
        } else if(numero >= 5 && result < 8){
            System.out.println("Seu número está entre 5 - 7");
        } else{
            System.out.println("Seu número não está entre as alternativas");
        }
        scan.close();
    }
}
