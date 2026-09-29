import java.util.Scanner;
public class beecrowd_Q1074 {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        for (int k=0; k<N; k++) {
            int numero = Integer.parseInt(leitor.nextLine());
            if (numero==0) {
                System.out.println("NULL");
            } else if (numero>0) {
                if (numero %2 ==0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            } else {
                if (numero %2 ==0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        } leitor.close();
    }
    
}
