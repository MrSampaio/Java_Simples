import javax.swing.JOptionPane;
public class exe6 {
	public static void main (String args []){
		
		double ht = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite quantas horas s�o trabalhadas: "));
		
		double vh = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da hora trabalhada: "));
		double pd = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a porcentagem do desconto: "));
		
		double sb = ht * vh;
		double td = (pd/100)*sb;
		double sl = sb-td;
		
		JOptionPane.showMessageDialog(null,"O sal�rio bruto �: " + sb +"\n O desconto � de: " + td + "\n O sal�rio l�quido �: " + sl);    
		
		
		
		
		
		
}
}