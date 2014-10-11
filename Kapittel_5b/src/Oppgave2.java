import javax.swing.JOptionPane;

public class Oppgave2 
{
	public static void main(String[] args) 
	{
		int størst = 0;
		
		/*for-løkken defineres: 
		 * variabel i defineres og gis startverdi 1
		 * løkken har verdi true så lenge i har verdi større eller lik 10
		 * tellevariabelen i skal oppdateres ved å adderes med 1 for hver gang løkken kjøres
		 */
		for (int i = 1; i <= 10; i++ )
		{
			// variabel innlestTall av typen int med inputDialog av typen String som omgjøres.
			int innlestTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn et heltall") );
			
			/*if-setning som i hver runde av for-løkken sjekker som innlestTall-variabel har større verdi enn foregående verdi.
			 * i tilfelle if-setningen har verdi true, altså at verdien til innlestTall er større settes variabelen størst lik innlestTall
			 */
			if (innlestTall > størst)
			{ 
				størst = innlestTall;
			}
		}
		
		JOptionPane.showMessageDialog( null, "Det største tallet du skrev inn er " + størst + ". " );

	}

}
