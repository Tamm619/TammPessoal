package br.com.mateusg;

import java.util.*;

/**
 * @author Mateus Gonçalves
 */
public class ExemploArrayList {

    public static void main(String[] args){

        exemploListaSimples();
        exemploListaSimplesOrdemAlfabetica();
        exemploNumeros();
        exemploHash();
    }

    //Esse mesmo exemplo no TreeSet, já fica ordenado e não adiciona duplicado
    private static void exemploHash() {
        System.out.println("--*** Exemplo Hash ***--");
        Set<String> nomes = new HashSet<>();
        nomes.add("Mateus");
        nomes.add("Giovanna");
        nomes.add("Cristiane");
        nomes.add("Mateus");
        System.out.println(nomes);
        System.out.println();
    }

    private static void exemploNumeros() {
        System.out.println("--*** Exemplo Numeros ***--");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);
    }

    private static void exemploListaSimples(){
        System.out.println("--*** Exemplo Lista Simples ***--");
        List<String> lista = new ArrayList<>();
        lista.add("Mateus ama a Giovanna");
        lista.add("Giovanna ama o Mateus");
        System.out.println();
        System.out.println(lista);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void exemploListaSimplesOrdemAlfabetica(){
        System.out.println("--*** Exemplo Lista Simples Ordem Alfabetica ***--");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Mateus Gonçalves");
        lista.add("Giovanna Lara");
        lista.add("Cristiane");
        Collections.sort(lista);
        System.out.println();
        System.out.println(lista);
        System.out.println();
    }
}
