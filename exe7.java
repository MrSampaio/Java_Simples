import javax.swing.JOptionPane;
public class exe7 {
	public static void main (String args[]){
		
		double tg = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tempo gasto na viagem: "));
		double vm = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a velocidade dirigida"));
		
		double distan = tg * vm;
		double lu = distan / 12;
		
		JOptionPane.showMessageDialog(null,"A velocidade média foi de: " + vm + "\n O tempo gasto foi de: " + tg + "\n A distância percorrida foi de: " + distan + "\n E a quantidade de litros de combustível gasto foi de: " + lu);

}
}