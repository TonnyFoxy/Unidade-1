package br.ufpb.dcx.tonny.biblioteca;

import java.util.ArrayList;

public class MeuSistemaDeBiblioteca {
    
    public static void main(String[] args){
        ArrayList<SistemaBiblioteca> livros = new ArrayList<>();
        livros.add(new Livro("Um Milhão de Finais Felizes"));
        livros.add(new Livro("15 Dias"));
        livros.add(new Livro("Heartstopper - Vol.1"));
        livros.add(new Livro("Beastars - Vol.20"));
        
        int quantLivros = 0;
        for (SistemaBiblioteca x : livros) {
            System.out.println(x.getNome);
            quantLivros++;
        }
        System.out.println("Quantidade total de livros:"+quantLivros);
    }
}
