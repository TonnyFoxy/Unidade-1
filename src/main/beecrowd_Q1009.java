import java.util.Scanner;
public class beecrowd_Q1009{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String vendedor = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        scanner.close();
        double salario_Final = salario+(vendas*0.15);
        
        System.out.printf("TOTAL = R$ "+"%.2f\n",salario_Final);
    }
}
