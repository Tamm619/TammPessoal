package br.com.mateusg.testes;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mateus Gonçalves
 */
public class PrimeiroTeste {

    @Test
    public void primeiroTest() {
        String nome = "Mateus";
        Assert.assertEquals("Mateus", nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "Mateus";
        Assert.assertNotEquals("Mateus1", nome);
    }
}
