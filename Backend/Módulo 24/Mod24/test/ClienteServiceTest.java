import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

/**
 * @author Mateus Gonçalves
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteService service = new ClienteService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
