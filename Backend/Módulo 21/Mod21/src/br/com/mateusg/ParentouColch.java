package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class ParentouColch {

    public static void main(String[] args) {

        //Lambda "padrão"
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };
        //Lambda um pouco mais simples
        MyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };
        //Lamba "minimalista"
        MyEventConsumer myEvent2 = s -> System.out.println(s);


        Return<String> ret = s -> {
            System.out.println(s);
            return "Ola";
        };
        ret.consumer(1);
    }
}
