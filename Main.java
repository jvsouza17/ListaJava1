import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");         
        String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno");
        String notaFinal = JOptionPane.showInputDialog("Digite a nota final");

        JOptionPane.showMessageDialog(null, "O nome do aluno é " +nome 
                + "\nA matrícula do aluno é " +matricula 
                + "\nA nota final foi " +notaFinal);

    }

}