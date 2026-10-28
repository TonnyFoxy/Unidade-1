package br.ufpb.dcx.ex7;

public class Tambor implements EmissorDeSom {
    private String tamanho;
    public Tambor(String tamanho){
        this.tamanho = tamanho;
    }
    public String emitirSom(){
        return "tum tum";
    }
}
