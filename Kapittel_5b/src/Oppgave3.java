import javax.swing.JOptionPane;

public class Oppgave3 
{
	public static void main(String[] args) 
	{
		int st�rst = 0;
		int nestst�rst = 0;
		
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
			
			// if-setning med betingelsen verdi p� variabel tall st�rre enn verdi p� variabel st�rst
			// eller (||) verdien p� tall er lik 1 (alts� f�rste runde i for-l�kken).
			if (innlestTall > st�rst || innlestTall == 1)
			{ 
				if (innlestTall > 1)
				{
					// Nest st�rste tall ikke blir definert i f�rste runde, alts� m� variabelen tall ha mer enn 1 i verdi.
					nestst�rst = st�rst; 
				}
				// else if-setning med betingelsen tall st�rre enn nestst�rst. 
				// n�r setningen har verdien true settes verdien til variabel tall lik ny verdi p� variabelen nestst�rst
				else if (innlestTall > nestst�rst)
				{
					nestst�rst = innlestTall;
				}

			
		}
		
		JOptionPane.showMessageDialog( null, "Det st�rste tallet du skrev inn er " + st�rst + ". \nDet nest st�rste tallet er " + nestst�rst + ". ");
		
		}
	}
}


