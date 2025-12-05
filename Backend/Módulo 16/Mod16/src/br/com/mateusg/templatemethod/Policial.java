package br.com.mateusg.templatemethod;

/**
 * @author Mateus Gonçalves
 */
public class Policial extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("== Prendendo Bandido ==");
    }

}
