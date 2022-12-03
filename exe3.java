import javax.swing.JOptionPane;
public class exe3 {
	public static void main (String args[]){;
	
	int raio = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o raio da lata"));
	int alt = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a altura da lata"));
	
	
	int vol = (int) (Math.PI * Math.pow(raio, 2)) * alt ;
	
	 		 
	
	JOptionPane.showMessageDialog(null,"a área da lata é: " + vol );

}
}
