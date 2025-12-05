package br.com.mateusg;

/**
 * @author Mateus Gonçalves
 */
public class OperacoesAritmeticas {

    public static void main(String[] args){
        operacoes();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("**** Operações Relacionais ****");
        int num1 = 10;
        int num2 = 10;

        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiff = num1 != num2;
        System.out.println("isDiff: " + isDiff);

        boolean isDentro10 = num1 >= 0 || num1 <= 10;
        System.out.println("isDentro10: " + isDentro10);

        int num3 = 25;
        int num4= 28;
        if (num3 > num4){
            System.out.println("Num3 ("+ num3 +") é maior que Num4 (" + num4 + ")");
        } else {
            System.out.println("Num4 ("+ num4 + " é maior que Num3 " + num3 + ")");
        }
    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("**** Operações de Incremento e Decremento ****");
        int num1 = 10;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    }

    public static void operacoesAtribuicoes() {
        System.out.println("**** Operações de Atribuições ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
        numero1 += numero2;
        System.out.println(numero1);
    }

    public static void operacoes(){
        System.out.println("**** Operações de Aritmética ****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        double num5 = (double) num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10) / 2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
