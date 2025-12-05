package br.com.mateusg.templatemethod;

/**
 * @author Mateus Gonçalves
 */
public class App {

    public static void main(String[] args){
        Trabalhador t1 = new Bombeiro();
        t1.executarRotina();
        System.out.println();
        Trabalhador t2 = new Policial();
        t2.executarRotina();
    }
}
