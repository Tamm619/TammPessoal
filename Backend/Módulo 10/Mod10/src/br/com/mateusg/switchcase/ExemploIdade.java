package br.com.mateusg.switchcase;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class ExemploIdade {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade){
        String result;
//        Pra isso o switch não é viável, pois teria q criar uma resposta para cada número
        switch(idade){
            case 0,1,2,3,4,5:
                result="Você é um bebe"; break;
            default:
                result="Você é um adulto"; break;
        }
        return result;
    }
}
