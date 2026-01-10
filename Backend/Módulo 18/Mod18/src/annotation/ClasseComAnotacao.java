package annotation;

/**
 * @author Mateus Gonçalves
 */
@PrimeiraAnotacao(value = "Mateus", bairros = "NovaTatui")
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Mateus", bairros = {"Teste", "Teste1"}, valores = 30d)
    private String nome;

}
