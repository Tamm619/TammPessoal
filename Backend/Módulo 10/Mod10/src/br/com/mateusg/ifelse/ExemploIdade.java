package br.com.mateusg.ifelse;

import java.util.Scanner;

/**
 * @author Mateus Gonçalves
 */
public class ExemploIdade {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        String IdadeSt = getIdade(idade);
        System.out.println(IdadeSt);

    }

    public static String getIdade(int idade){
        if (idade >=0 && idade <=5){
            return "Você é um bebê";
        } else if (idade >=6 && idade <=11){
            return "Você é uma criança";
        } else if (idade <=12 && idade <=17){
            return "Você é um adolescente";
        } else{
            return "Você é um adulto";
        }
    }
}
