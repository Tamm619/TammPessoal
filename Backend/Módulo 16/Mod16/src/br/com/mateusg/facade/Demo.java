package br.com.mateusg.facade;

/**
 * @author Mateus Gonçalves
 */
public class Demo {

        public static void main(String[] args){

            IApartamentoService servico = new ApartamentoService();
            servico.alugarApartamento();
        }
}
