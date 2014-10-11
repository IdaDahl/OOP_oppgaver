import javax.swing.JOptionPane;

public class Oppgave2 
{
	public static void main( String args[] )
	   {
		String antallGram = JOptionPane.showInputDialog( "Skriv inn vekt på brevet i antall gram" );
	int vekt = Integer.parseInt(antallGram);
	double porto = 0.0;
	
	if (vekt <= 20)
		porto = 9.00;
	else if (vekt <= 50)
		porto = 14.00;
	else if (vekt <= 100)
		porto = 17.00;
	else if (vekt <= 350)
		porto = 27.00;
	else if (vekt <= 1000)
		porto = 67.00;
	else if (vekt <= 2000)
		porto = 145.00;
	
	JOptionPane.showMessageDialog(null, "Det vil koste deg " + porto + " kroner å sende brevet. ");
	}
}
