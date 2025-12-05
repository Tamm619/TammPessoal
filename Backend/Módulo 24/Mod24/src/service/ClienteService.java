package service;

import dao.ClienteDao;

/**
 * @author Mateus Gonçalves
 */
public class ClienteService {

    private ClienteDao clienteDao;

    public ClienteService(){
        clienteDao = new ClienteDao();
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
