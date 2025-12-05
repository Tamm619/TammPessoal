package br.com.mateusg.interfaces;

/**
 * @author Mateus Gonçalves
 */
public class Giz implements ICaneta{


    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
