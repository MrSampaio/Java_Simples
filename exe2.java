import javax.swing.JOptionPane;
public class exe2 {
	public static void main (String args[]){
	
	
	int comp = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o comprimento"));
	int larg = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a largura"));

	int area = comp * larg;
			
			JOptionPane.showMessageDialog(null,"a área é: " + area );
}
}
