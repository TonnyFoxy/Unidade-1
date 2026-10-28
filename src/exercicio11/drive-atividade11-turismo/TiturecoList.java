package br.ufpb.titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface {
    private List<AtrativoTuristico> atrativos;
    public TiturecoList() {
        this.atrativos = new ArrayList<>();
    }
    @Override
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        return this.atrativos.add(atrativo);
    }
    @Override
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        for (AtrativoTuristico a : this.atrativos) {
            if (a.getNome().equals(nomeAtrativo) && a.getCidade().equals(cidade) && a.getEstado().equals(estado)) {
                this.atrativos.remove(a);
                return true;
            }
        }
        return false;
    }
    @Override
    public List<AtrativoTuristico> getAtrativos() {
        return this.atrativos;
    }
    @Override
    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> encontrados = new ArrayList<>();
        for (AtrativoTuristico a : this.atrativos) {
            if (a.getCidade().equals(cidade) && a.getEstado().equals(estado)) {
                encontrados.add(a);
            }
        }
        return encontrados;
    }
}