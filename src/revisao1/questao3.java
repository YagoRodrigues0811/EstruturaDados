package revisao1;
import javax.swing.JOptionPane;

public class questao3 {
	public static void main(String[] args){
	int num1, num2, mult;
	
	num1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
	
	mult = num1 * num2;
	
	JOptionPane.showMessageDialog(null, "Multiplicação: "+mult);
	}
}
