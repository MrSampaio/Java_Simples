import javax.swing.JOptionPane;
public class exe5 {
	public static void main (String args []){
		
		double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o pre�o: "));  
 
		double desconto = ((preco/100)*10);
		double pv = preco - desconto;
		
		JOptionPane.showMessageDialog(null,"O pre�o �: " + preco + "\n O desconto �: " + desconto + "\n O pre�o a vista �: " + pv  );
}
}