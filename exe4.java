import javax.swing.JOptionPane;
public class exe4 {
public static void main (String args[]) {
	
	double cent = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os cent�metros"));
	
	double met = cent / 100;
	double dec = cent / 10;
	double mil = cent * 10;
	
	JOptionPane.showMessageDialog(null,"O valor em metros �: " + met +"\n O Valor em dec�metros �: " + dec  +"\n  O Valor em mil�metros �: " + mil );
			
}
}


