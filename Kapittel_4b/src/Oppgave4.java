import javax.swing.JOptionPane;

public class Oppgave4
{
	public static void main( String args[] )
	   {
		
		String sekunderInput = JOptionPane.showInputDialog(null, "Skriv inn antall sekunder");
		String utskrift = "";
		int tid = Integer.parseInt (sekunderInput);
		int timer;
		int resttimer;
		int minutter;
		int sekunder;
		
		while (tid >= 1)
		{
			timer = tid / 3600;
			resttimer = tid % 3600;
			minutter = resttimer / 60; 
			sekunder = resttimer % 60;

			if (tid <= 3601)
			{
				utskrift = minutter + " minutter og " + sekunder + " sekunder. ";
			}
			
			if (tid <= 61)
			{ 
				utskrift = sekunder + " sekunder";
			}
			JOptionPane.showMessageDialog(null, "Du har " + utskrift);
		sekunderInput = JOptionPane.showInputDialog (null, "Skriv inn antall sekunder");
		tid = Integer.parseInt(sekunderInput);
		}
	JOptionPane.showMessageDialog(null, "Hade på bra =)" );
	}
}
