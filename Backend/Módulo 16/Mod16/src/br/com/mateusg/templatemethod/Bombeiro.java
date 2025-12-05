package br.com.mateusg.templatemethod;

/**
 * @author Mateus Gonçalves
 */
public class Bombeiro extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("== Apagando Incendios ==");
    }
}
