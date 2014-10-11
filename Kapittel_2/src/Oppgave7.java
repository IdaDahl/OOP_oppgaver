import javax.swing.JOptionPane;

public class Oppgave7 
{

	public static void main(String[] args) 
	{
		String sekunderString;
		
		int sekunder;
		int kvotient;
		
		sekunderString = JOptionPane.showInputDialog( "Skriv inn antall sekunder" );
		
		sekunder = Integer.parseInt(sekunderString);
		kvotient = sekunder / 60;
		
		JOptionPane.showMessageDialog(null, kvotient);
	
	}

}
