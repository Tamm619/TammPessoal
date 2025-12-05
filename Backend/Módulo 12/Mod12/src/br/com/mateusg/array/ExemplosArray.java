package br.com.mateusg.array;

/**
 * @author Mateus Gonçalves
 */
public class ExemplosArray {

    public static void main(String[] args){
        exemplosArray1();
        tamanhoArray();
        percorrendoArray();
        percorrendoArray2();
        arrayBi();
    }

    private static void outputArray(int[][] arrays) {
        //LOOP PELAS LINHAS DO ARRAY
        for (int linha = 0; linha < arrays.length; linha++){
            //LOOP PELAS COLUNAS DA LINHA ATUAL
            for (int coluna = 0; coluna < arrays[linha].length; coluna++){
                System.out.printf("%d ", arrays[linha][coluna]);
            }
            System.out.println();
        }
    }

    private static void arrayBi() {
        System.out.println();
        System.out.println("***** Array Bidimensional *****");

        int[][] array1= { {1,2,3}, {4,5,6} };
        int[][] array2= { {1,2}, {3}, {4,5,6} };

        System.out.println("Valores do array1 passados na linha são: ");
        outputArray(array1);

        System.out.println("Valores do array2 passados na linha são: ");
        outputArray(array2);
    }

    private static void percorrendoArray2() {
        System.out.println();
        System.out.println("***** Percorrendo Array 2 *****");

        int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]);
        }
    }

    private static void percorrendoArray() {
        System.out.println();
        System.out.println("***** Percorrendo Array *****");

        int[] perNum = {1,2,3,4,5,6,7,8,9,10};
        int busca = 0;
        //ADICIONA VALOR DE CADA ELEMENTO A BUSCA
        for (int i : perNum){
            busca += i;
        }
        //ELE PASSA SOMANDO UM POR UM
        System.out.println("Total de elementos no perNum: " +busca);
    }

    private static void tamanhoArray() {
        System.out.println("***** Tamanho Array *****");
        int[] arrayUm = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayDois = {11,22,33,44,55,66};

        if(arrayUm.length > 8){
            System.out.println("Array com mais de 8 numeros");
        } else{
            System.out.println("Array com menos de 8 numeros");
        }
        System.out.println();
        System.out.println("Tamanho do Array : " +arrayUm.length);
    }

    private static void exemplosArray1() {
        System.out.println();
        System.out.println("***** Declarando Array *****");

        int[] valoresArray = {12,65,54,123,6,23,41,2,89,9};
//        AMBOS SÃO A MESMA COISA, MAS O DE CIMA É JÁ SETANDO, A DE BAIXO É DINAMICA
//        A DE BAIXO TEM MAIS USOS PRÁTICOS, PARA COLETA DE INFORMAÇÕES
        int[] meuArray;
        meuArray = new int[10];

        meuArray [0] = 32;
        meuArray [1] = 56;
        meuArray [2] = 862;
        meuArray [3] = 322;
        meuArray [4] = 45;
        meuArray [5] = 457;
        meuArray [6] = 152;
        meuArray [7] = 578;
        meuArray [8] = 234;
        meuArray [9] = 6534;

        System.out.println(meuArray[2] + "+" + meuArray[5]);
        System.out.println();
    }
}
