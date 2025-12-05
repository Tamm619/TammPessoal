package br.com.mateusg.adapter;

import java.io.File;

/**
 * @author Mateus Gonçalves
 */
public class DropBoxAdapter implements PersistenciaArquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());
    }
}
