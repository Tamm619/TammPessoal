package br.com.mateusg;

import br.com.mateusg.dao.jdbc.ClienteDAO;
import br.com.mateusg.dao.jdbc.IClienteDAO;
import br.com.mateusg.domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Mateus Gonçalves
 */
public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("C" + System.currentTimeMillis());
        cliente.setNome("Mateus Gonçalves");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        //Integer qtdDel = dao.excluir(clienteBD);
        //assertNotNull(qtdDel == 1);
    }

    @Test
    public void atualizarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("02");
        cliente.setNome("Mateus");

        dao.cadastrar(cliente);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);

        // muda alguma coisa
        clienteBD.setNome("Mateus Atualizado");

        Integer qtdAtualizada = dao.atualizar(clienteBD);
        assertTrue(qtdAtualizada == 1);

        Cliente clienteBD2 = dao.consultar(clienteBD.getCodigo());
        assertEquals("Mateus Atualizado", clienteBD2.getNome());
    }

    @Test
    public void buscarTodosTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        // cadastra alguns
        Cliente c1 = new Cliente();
        c1.setCodigo("BT1");
        c1.setNome("Cliente1");
        dao.cadastrar(c1);

        Cliente c2 = new Cliente();
        c2.setCodigo("BT2");
        c2.setNome("Cliente2");
        dao.cadastrar(c2);

        // testa
        List<Cliente> lista = dao.buscarTodos();
        assertNotNull(lista);
        assertTrue(lista.size() >= 2); // tem pelo menos 2

        // você pode imprimir pra ver também
        for (Cliente c : lista) {
            System.out.println(c.getId() + " " + c.getCodigo() + " " + c.getNome());
        }
    }

}
