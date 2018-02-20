package revisao1;
import javax.swing.JOptionPane;

public class questao5 {
	public static void main(String[] args){
		double raio, area, perimetro;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
		
		area = 3.14*(Math.pow(raio, 2));
		perimetro = 2*3.14*raio;
		
		JOptionPane.showMessageDialog(null,"Área: "+area+"\nPerímetro: "+perimetro);
		
	}
}
