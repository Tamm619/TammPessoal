package br.com.mateusg;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Mateus Gonçalves
 */

public class CriandoStreams {

    public static void main(String[] args) {

        Stream<String> stream = List.of("Mateus", "Gonçalves").stream();


        Stream<String> set = Set.of("Mateus", "Gonçalves").stream();


        Map<String, String> map = Map.of("Mateus","Gonçalves");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> values = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asdasd");
    }
}
