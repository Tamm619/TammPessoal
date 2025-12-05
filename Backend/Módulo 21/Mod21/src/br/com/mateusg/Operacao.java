package br.com.mateusg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * @author Mateus Gonçalves
 */
public class Operacao {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Multiplicando todos os numeros por 5: ");
        realizaOperacao(list, (n) -> n * 5);
    }

    public static void realizaOperacao(List<Integer> list, IntFunction<Integer> function){
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}
