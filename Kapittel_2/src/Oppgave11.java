import javax.swing.JOptionPane;

public class Oppgave11 {

	public static void main(String[] args) 
	{
		int m = 3;
		int n = -7;
		int p = 2;
		int minst = m;
		 
		if ( n < minst )
		    minst = n;
		if ( p < minst )
		    minst = p;
		 
		JOptionPane.showMessageDialog(null, minst); // verdi av minst er her blitt -7

	}

}
