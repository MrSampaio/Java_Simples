import javax.swing.JOptionPane;
public class exe9 {
	public static void main (String args []){

		double raio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do raio: "));
		double alt = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura: "));
		
		double ab = Math.PI * Math.pow( raio, 2 );
		double al = 2 * Math.PI * alt;
		double at = 2 * ab+al ;
		
		JOptionPane.showMessageDialog(null,"A área externa da lata é: " + at);
		
		
}
}