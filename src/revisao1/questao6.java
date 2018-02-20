package revisao1;
import javax.swing.JOptionPane;

public class questao6 {
	public static void main(String[] args){
		double l_parede, l_azulejo, area_parede, area_azulejo, qtd;
		
		l_parede = Double.parseDouble(JOptionPane.showInputDialog("Largura da parede: "));
		l_azulejo = Double.parseDouble(JOptionPane.showInputDialog("Largura do azulejo: "));
		
		area_parede = Math.pow(l_parede,2);
		area_azulejo = Math.pow(l_azulejo, 2);
		
		qtd = area_parede/area_azulejo;
		
		JOptionPane.showMessageDialog(null,"Quantidade: "+qtd);
	}
}
