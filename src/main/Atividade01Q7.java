import javax.swing.JOptionPane;
public class Atividade01Q7 {
    public static void main(String[] args) {
        String Peso = JOptionPane.showInputDialog("Qual teu peso?");
        String Altura = JOptionPane.showInputDialog("Qual tua altura?");
        double peeso = Double.parseDouble(Peso);
        double altuura = Double.parseDouble(Altura);
        double imc = peeso / (altuura * altuura);
        System.out.println("O teu IMC é: " + imc);
    }

}