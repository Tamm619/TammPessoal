package br.com.mateusg;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mateus Gonçalves
 */
public class ExemplosFilter {

    public static void main(String[] args) {

        List<Pessoa> lista = Pessoa.populaPessoa();
        lista.stream()
                .map(n -> n.getNome().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(lista);


        
    }
}
