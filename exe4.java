import javax.swing.JOptionPane;
public class exe4 {
public static void main (String args[]) {
	
	double cent = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite os centímetros"));
	
	double met = cent / 100;
	double dec = cent / 10;
	double mil = cent * 10;
	
	JOptionPane.showMessageDialog(null,"O valor em metros é: " + met +"\n O Valor em decímetros é: " + dec  +"\n  O Valor em milímetros é: " + mil );
			
}
}


