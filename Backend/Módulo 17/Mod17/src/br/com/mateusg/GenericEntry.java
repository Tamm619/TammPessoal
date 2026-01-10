package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class GenericEntry<T, E> {

    private T data;

    private E codigo;

    public GenericEntry(T data, E codigo){
        this.data = data;
        this.codigo = codigo;
    }

    public E getCodigo() {
        return this.codigo;
    }

    public T getData(){
        return this.data;
    }
}
