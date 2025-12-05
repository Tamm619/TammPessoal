package br.com.mateusg;

import br.com.mateusg.interfaces.CanetaEsferografica;
import br.com.mateusg.interfaces.Giz;
import br.com.mateusg.interfaces.ICaneta;
import br.com.mateusg.interfaces.Lapis;

/**
 * @author Mateus Gonçalves
 */
public class ClasseTeste {

    public static void main(String[] args){
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("TamM");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("TamM em Giz");
        caneta.escreverComumATodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("TamM em Lapis");
        caneta.escreverComumATodas();
        System.out.println(lapis.getCor());

    }
}
