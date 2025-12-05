package br.com.mateusg.forewhile;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class TabuadaDoWhile {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.print("Digite um número para gerar a tabuada: ");
            int num = scan.nextInt();
            for (int i = 0; i<=10;i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }
            System.out.println("Deseja gerar outra tabuada?");
            resposta = scan.next();
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Obrigado.");
    }
}
