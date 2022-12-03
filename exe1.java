import javax.swing.JOptionPane;
public class exe1 {
	public static void main (String args[]){
		
		int n1, n2, n3, n4, media;
		
	    n1 = Integer.parseInt(JOptionPane.showInputDialog (null,"digite o valor um"));
	    n2 = Integer.parseInt (JOptionPane.showInputDialog(null,"digite o valor dois"));
		n3 = Integer.parseInt (JOptionPane.showInputDialog(null,"digite o valor três"));
	    n4 = Integer.parseInt (JOptionPane.showInputDialog(null,"digite o valor quatro"));
	    
	    media = (n1 + n2 + n3 + n4 / 4 ); 
	   
	    
	    JOptionPane.showMessageDialog (null,"a média é: " + media);
		
}
}



