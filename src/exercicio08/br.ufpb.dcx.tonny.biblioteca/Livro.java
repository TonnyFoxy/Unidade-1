package br.ufpb.dcx.tonny.biblioteca;

public class Livro implements SistemaBiblioteca{
    private String nome;
    private int pag;
    
    public Livro(String nome, int pag, Autor autor){
        this.nome = nome;
        this.pag = pag;
    }
    public void setNome(){
        this.nome = nome;
    }
    public void setPag(){
        this.pag = pag;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPag(){
        return this.pag;
    }
}
