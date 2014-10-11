import javax.swing.JOptionPane;

public class Oppgave3 
{
	public static void main( String args[] )
	   {
		
		String sekunderInput = JOptionPane.showInputDialog(null, "Skriv inn antall sekunder");
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

		
		JOptionPane.showMessageDialog(null, tid + " sekunder er " 
										+ timer + " timer, " 
										+ minutter + " minutter og " 
										+ sekunder + " sekunder. ");
		/* Hvis while-løkken stoppes her vil dialogboksen poppe opp uendelig, 
		 * ettersom løkken aldri vil få verdien false fordi vi ikke har flere input-runder.
		 * Det er derfor nødvendig å sette inn en ny dialogboks som spør etter et nytt tall. 
		 */
		sekunderInput = JOptionPane.showInputDialog (null, "Skriv inn antall sekunder");
		tid = Integer.parseInt(sekunderInput);
		}
		JOptionPane.showMessageDialog(null, "Hade på bra =)" );
	   }
}
