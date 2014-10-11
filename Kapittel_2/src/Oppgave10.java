import javax.swing.JOptionPane;


public class Oppgave10 {

	public static void main(String[] args) 
	{
	
	int m = 5;
	int n = -7;
	
	boolean a = m < n; // "er mindre enn"
	boolean b = n >= m; // "er større enn eller lik"
	boolean c = n <= m; // "er mindre enn eller lik"
	boolean d = n > m; // er større enn"
	boolean e = m != n; // "er ikke lik"
	boolean f = m == n; // "er lik"
	
	a = true; 
	b = false; 
	c = true; 
	d = false; 
	e = true; 
	f = false; 
	  
	JOptionPane.showMessageDialog(null,  
			"\n m < n = " + a + 
			"\n n >= m = " + b +
			"\n n <= m = " + c +
			"\n n > m = " + d + 
			"\n m != n = " + e +
			"\n m == n = " + f);

	}

}
