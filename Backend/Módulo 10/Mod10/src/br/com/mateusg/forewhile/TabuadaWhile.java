package br.com.mateusg.forewhile;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class TabuadaWhile {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja gerar uma tabuada? Responda com sim.");
        String resposta = scan.next();

        while(resposta.equalsIgnoreCase("Sim")){
            System.out.print("Digite um número para gerar a tabuada: ");
            int num = scan.nextInt();
            for (int i = 0; i<=10; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número?");
            resposta = scan.next();
        }

        System.out.println("Obrigado.");
        scan.close();
    }
}
