package br.ufpb.titureco;

import javax.swing.JOptionPane;
import java.util.List;

public class ProgramaTitureco {

    public static void main(String[] args) {
        TiturecoInterface sistema = new TiturecoList();
        boolean sair = false;

        while (!sair) {
            String menu = "Digite uma opção:\n"
                    + "1- Cadastrar Atrativo\n"
                    + "2- Pesquisar Atrativos da Cidade\n"
                    + "3- Listar Todos os Atrativos\n"
                    + "4- Apagar Atrativo\n"
                    + "5- Sair";
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual o nome do atrativo?");
                    double lat = Double.parseDouble(JOptionPane.showInputDialog("Qual a latitude?(ex: -7.11)"));
                    double lon = Double.parseDouble(JOptionPane.showInputDialog("Qual a longitude?(ex: -34.86)"));
                    String comoChegar = JOptionPane.showInputDialog("Informe como chegar.");
                    String cidade = JOptionPane.showInputDialog("Qual a cidade?");
                    String estado = JOptionPane.showInputDialog("Qual o estado?");
                    
                    int respostaPraia = JOptionPane.showConfirmDialog(null, "Este atrativo é uma praia?", "Tipo de Atrativo", JOptionPane.YES_NO_OPTION);
                    
                    AtrativoTuristico novoAtrativo;
                    
                    if (respostaPraia == JOptionPane.YES_OPTION) {
                        int respBanho = JOptionPane.showConfirmDialog(null, "É própria para banho?", "Banho", JOptionPane.YES_NO_OPTION);
                        boolean propriaParaBanho = (respBanho == JOptionPane.YES_OPTION);
                        
                        int respTubarao = JOptionPane.showConfirmDialog(null, "Tem perigo de tubarão?", "Tubarão", JOptionPane.YES_NO_OPTION);
                        boolean perigoTubarao = (respTubarao == JOptionPane.YES_OPTION);
                        
                        String tipoOrla = JOptionPane.showInputDialog("Qual o tipo de orla (ex: Piscinas Naturais)?");
                        
                        novoAtrativo = new Praia(nome, lat, lon, comoChegar, cidade, estado, propriaParaBanho, perigoTubarao, tipoOrla);
                    } else {
                        novoAtrativo = new AtrativoTuristico(nome, lat, lon, comoChegar, cidade, estado);
                    }

                    boolean cadastrou = sistema.cadastrarAtrativo(novoAtrativo);
                    if (cadastrou) {
                        JOptionPane.showMessageDialog(null, "Atrativo foi cadastrado.");
                    }
                    break;
                case 2:
                    String cidadePesquisa = JOptionPane.showInputDialog("Qual a cidade?");
                    String estadoPesquisa = JOptionPane.showInputDialog("Qual o estado?");
                    
                    List<AtrativoTuristico> achados = sistema.pesquisaAtrativosDaCidade(cidadePesquisa, estadoPesquisa);
                    StringBuilder listaAchados = new StringBuilder("Atrativos encontrados:\n");
                    for (AtrativoTuristico a : achados) {
                        listaAchados.append(a.getNome()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, listaAchados.toString());
                    break;
                case 3:
                    List<AtrativoTuristico> todos = sistema.getAtrativos();
                    StringBuilder listaTodos = new StringBuilder("Lista de atrativos:\n");
                    for (AtrativoTuristico a : todos) {
                        listaTodos.append(a.getNome()).append(" (").append(a.getCidade()).append(")\n");
                    }
                    JOptionPane.showMessageDialog(null, listaTodos.toString());
                    break;
                case 4:
                    String nomeApagar = JOptionPane.showInputDialog("Qual o nome do atrativo a apagar?");
                    String cidadeApagar = JOptionPane.showInputDialog("Qual a cidade a apagar?");
                    String estadoApagar = JOptionPane.showInputDialog("Qual o estado a apagar?");
                    
                    boolean apagou = sistema.apagarAtrativo(nomeApagar, cidadeApagar, estadoApagar);
                    if (apagou) {
                        JOptionPane.showMessageDialog(null, "Atrativo foi apagado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Atrativo não encontrado.");
                    }
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}