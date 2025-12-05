package br.com.mateusg.adapter;

import java.io.File;

/**
 * @author Mateus Gonçalves
 */
public class Demo {

    public static void main(String[] args){
        String file = "asdasd.txt";
        DropBox drop = new DropBox();
        PersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
