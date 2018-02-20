package revisao1;
import javax.swing.JOptionPane;

public class questao2 {
	public static void main(String[] args){
	int num1, num2, soma;
	
	num1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
	
	soma = num1 + num2;
	
	JOptionPane.showMessageDialog(null, "Soma: "+soma);
	}
}
