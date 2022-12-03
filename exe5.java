import javax.swing.JOptionPane;
public class exe5 {
	public static void main (String args []){
		
		double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço: "));  
 
		double desconto = ((preco/100)*10);
		double pv = preco - desconto;
		
		JOptionPane.showMessageDialog(null,"O preço é: " + preco + "\n O desconto é: " + desconto + "\n O preço a vista é: " + pv  );
}
}