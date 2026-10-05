package Atividades.Atividade_05;
//Crie um programa completo (classe com método main) que leia 5 números inteiros,
//guardando-os em um array e imprima o menor dentre os números lidos
import java.util.Scanner;

public class Atividade05Q5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os 5 números inteiros: ");
        int[]listaNumero = new int[5];
        int menorNumero = Integer.MAX_VALUE;
        for(int k=0; k<5; k++){
            int numero = Integer.parseInt(leitor.nextLine());
            if(numero<menorNumero){
                menorNumero = numero;
            }
            listaNumero[k] = numero;

        }leitor.close();
        System.out.println("O menor número é "+ menorNumero);
    }
}
