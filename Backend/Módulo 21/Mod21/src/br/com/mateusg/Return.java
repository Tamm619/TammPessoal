package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
@FunctionalInterface
public interface Return <T> {

    public T consumer(Object value);

}
