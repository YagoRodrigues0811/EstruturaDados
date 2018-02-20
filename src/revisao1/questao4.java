package revisao1;
import javax.swing.JOptionPane;

public class questao4 {
	public static void main(String[] args){
	double l, h, area, perimetro;
	
	h = Integer.parseInt(JOptionPane.showInputDialog("altura: "));
	l = Integer.parseInt(JOptionPane.showInputDialog("largura: "));
	
	area = l * h;
	perimetro = (l*2)+(h*2);
	
	JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerímetro: "+perimetro);
	}
}
