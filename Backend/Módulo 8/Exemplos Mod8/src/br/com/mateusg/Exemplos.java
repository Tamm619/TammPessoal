package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class Exemplos {

    //Menos usados
    private float valorDecimal=10.0f;
    private short curto;
    private byte bi;

    //Mais usados
    private int codigo;  //Deixando sem valor para definir o valor com os métodos
    private long codigoMaior;  // /\ Igual o primeiro metodo abaixo, definindo codigo com valor
    private boolean decisao;
    private double valorDecimal1=10.1;
    private String texto="blablabla";



    public Exemplos(int valor){
        this.codigo = valor;
    }

    public Exemplos(String teste){

    }

    public String retornaTexto(){
        this.codigo = 0;
        return "texto";
    }

    public int retornaInteiro(){
//        Criando variáveis que só podem ser usadas aqui dentro, digamos que um "improviso"
        int val = 10;
        String texto = "texto teste";
        return val;
    }

    public long retornaLong(long num){
        return num;
    }
}
