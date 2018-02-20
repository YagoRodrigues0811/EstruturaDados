package revisao1;
import javax.swing.JOptionPane;

public class questao7 {
	public static void main(String[] args){
		double raio, a, volume;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Raio: "));
		a = Double.parseDouble(JOptionPane.showInputDialog("Área: "));
		
		volume = a*3.14*(Math.pow(raio, 2));
		
		JOptionPane.showMessageDialog(null, "Volume: "+volume);
	}
}
