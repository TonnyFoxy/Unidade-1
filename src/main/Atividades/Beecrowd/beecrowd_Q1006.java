package Atividades.Beecrowd;
import java.util.Scanner;
public class beecrowd_Q1006{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        scanner.close();
        double media = ((A*2)+(B*3)+(C*5))/(2+3+5);
        
        System.out.printf("MEDIA = "+"%.1f\n", media);
    }
}
