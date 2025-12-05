package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class NewExemploGenericEntry {

    public static void main(String[] args){
        GenericEntry<String, Long> entry = new GenericEntry<>("Teste", 7L);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<>(10L, 50);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
