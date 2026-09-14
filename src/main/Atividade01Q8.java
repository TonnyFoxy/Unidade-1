import javax.swing.JOptionPane;
public class Atividade01Q8 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual teu nome? :D");
        String cidade = JOptionPane.showInputDialog("Em qual cidade c nasceu?");
        System.out.println("Olá "+nome+"! Que legal saber que você é da cidade "+cidade+" :D");
    }
    
}
