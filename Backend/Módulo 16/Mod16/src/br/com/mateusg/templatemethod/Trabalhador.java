package br.com.mateusg.templatemethod;

/**
 * @author Mateus Gonçalves
 */
public abstract class Trabalhador {

    public void executarRotina(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
        dormir();
    }

    protected abstract void trabalhar();

    private void dormir() {
        System.out.println("== Descansar Dormindo ==");
    }

    private void voltarParaCasa() {
        System.out.println("== Voltando para Casa ==");
    }

    private void irAoTrabalho() {
        System.out.println("== Indo ao Trabalho ==");
    }

    private void levantar() {
        System.out.println("== Levantando da Cama ==");
    }

    private void iniciarRotina() {
        System.out.println("== Iniciando a Rotina ==");
    }

}
