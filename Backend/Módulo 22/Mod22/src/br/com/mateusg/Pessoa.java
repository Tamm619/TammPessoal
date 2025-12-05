package br.com.mateusg;

import java.util.List;

/**
 * @author Mateus Gonçalves
 */
public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa(String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static List<Pessoa> populaPessoa(){
        Pessoa pessoa1 = new Pessoa("01", "Mateus Enrique", "Brasil", 21);
        Pessoa pessoa2 = new Pessoa("02", "Giovanna Lara", "Brasil", 23);
        Pessoa pessoa3 = new Pessoa("03", "Phillip Yan", "Brasil", 21);
        Pessoa pessoa4 = new Pessoa("04", "Rodrigo Pires", "Colombia", 32);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }


    @Override
    public String toString() {
        return "nome='" + nome + '\'';
    }
}
