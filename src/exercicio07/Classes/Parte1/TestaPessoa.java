import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int contador = 0;

        while (contador < 5) {
            System.out.println("Escreve o nome da pessoa " + (contador + 1) + ":");
            String nome = leitor.nextLine();
            System.out.println("Escreve a idade da pessoa " + (contador + 1) + ":");
            int idade = Integer.parseInt(leitor.nextLine());
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);
            contador++;
        }
        System.out.println("\nResultados:");
        for (Pessoa p : pessoas) {
            if (p.ehDeMaior()) {
                System.out.println(p.getNome() + " é de maior.");
            } else {
                System.out.println(p.getNome() + " é de menor.");
            }
        }
        
        leitor.close();
    }
}