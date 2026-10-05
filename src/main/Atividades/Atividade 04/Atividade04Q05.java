package Atividades;
import java.util.Scanner;
public class Atividade04Q05 {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de respostas");
        int quant = Integer.parseInt(leitor.nextLine());
        int soma1 = 0;
        int soma2 = 0;
        for (int k=0; k<quant; k++){
            System.out.println("Digite a cor (azul/rosa)");
            String cor = leitor.nextLine();
            if(cor.equals("azul")){
                soma1++;
            }else if(cor.equals("rosa")) {
                soma2++;
            }else{
                System.out.println("Erro, digite novamente");
                k = k-1;
            }
        } leitor.close();
        if(soma1>soma2){
            System.out.println("A cor mais escolhida foi azul"); 
        } else{
            System.out.println("A cor mais escolhida foi rosa");
        }
    }
}
