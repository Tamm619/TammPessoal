package br.com.mateusg.observer;

/**
 * @author Mateus Gonçalves
 */
public class Demo {

    public static void main(String[] args){
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
