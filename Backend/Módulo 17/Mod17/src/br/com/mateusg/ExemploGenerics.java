package br.com.mateusg;

import br.com.mateusg.fruta.Banana;
import br.com.mateusg.fruta.Fruta;
import br.com.mateusg.fruta.Maca;
import br.com.mateusg.fruta.Morango;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateus Gonçalves
 */
public class ExemploGenerics {

    public static void main(String[] args){
        List<String> lista = new ArrayList();
        //Se uma classe usa <> é porque ela é/usa Generics
        lista.add("Ola");
        lista.add("10");
        imprimir(lista);

        String primeiroSt = pegarPrimeiraLista(lista);
        System.out.println(primeiroSt);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        frutas.add(new Maca());
        frutas.add(new Morango());
        imprimirFrutas(frutas);
    }

    public static void imprimirFrutas(List<Fruta> listaFruta){
        for (Fruta fruta : listaFruta){
            System.out.println(fruta);
        }
    }



//    public static void imprimir(List<String> lista){
//        for (String st : lista){
//            System.out.println(st);
//        }
//    }

    //Métodos usando Genéricos

    public static <T> void imprimir(List<T> lista){
        for(T st : lista){
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiraLista(List<T> lista){
        return lista.get(0);
    }
}
