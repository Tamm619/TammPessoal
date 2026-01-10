package br.com.mateusg.forewhile;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class TabuadaFor {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int num = scan.nextInt();
        for (int i = 0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
