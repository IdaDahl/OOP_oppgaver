import javax.swing.JOptionPane;

public class Oppgave2 
{
	public static void main(String[] args) 
	{
		int st�rst = 0;
		
		/*for-l�kken defineres: 
		 * variabel i defineres og gis startverdi 1
		 * l�kken har verdi true s� lenge i har verdi st�rre eller lik 10
		 * tellevariabelen i skal oppdateres ved � adderes med 1 for hver gang l�kken kj�res
		 */
		for (int i = 1; i <= 10; i++ )
		{
			// variabel innlestTall av typen int med inputDialog av typen String som omgj�res.
			int innlestTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn et heltall") );
			
			/*if-setning som i hver runde av for-l�kken sjekker som innlestTall-variabel har st�rre verdi enn foreg�ende verdi.
			 * i tilfelle if-setningen har verdi true, alts� at verdien til innlestTall er st�rre settes variabelen st�rst lik innlestTall
			 */
			if (innlestTall > st�rst)
			{ 
				st�rst = innlestTall;
			}
		}
		
		JOptionPane.showMessageDialog( null, "Det st�rste tallet du skrev inn er " + st�rst + ". " );

	}

}
