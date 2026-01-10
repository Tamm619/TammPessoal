package br.com.mateusg.facade;

/**
 * @author Mateus Gonçalves
 */
public class ApartamentoService implements IApartamentoService{

    public void procurarPorEndereco(){

    }

    public void procurarContato(){

    }

    public void procurarValorTotal(){

    }



    @Override
    public void alugarApartamento() {
        procurarPorEndereco();
        procurarContato();
        procurarValorTotal();
    }
}
