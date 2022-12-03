import javax.swing.JOptionPane;
public class exe8 {
	public static void main (String args[]){

		double seg = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os segundos: "));
		
		double hora = seg / 3600;
		double min = seg / 60;
		
		JOptionPane.showMessageDialog(null,"O valor em horas é de: " + hora + "\n O valor em minutos é de: " + min);
}
}