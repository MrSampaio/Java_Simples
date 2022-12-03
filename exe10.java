import javax.swing.JOptionPane;
public class exe10 {
	public static void main (String args []){
		
		double x = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor de X: "));
		double y = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor de Y: "));
		
		JOptionPane.showMessageDialog(null,"X vale: " + x + "\n Y vale: " + y);
		
		double aux = y;
		double y2 = x;
		double x2 = aux;
		
		JOptionPane.showMessageDialog(null,"Trocando os valores, se tornam: " + "\n X vale: " + x2 + "\n Y vale: " + y2);
	}

}
