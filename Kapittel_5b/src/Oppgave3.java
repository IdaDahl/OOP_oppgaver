import javax.swing.JOptionPane;

public class Oppgave3 
{
	public static void main(String[] args) 
	{
		int størst = 0;
		int neststørst = 0;
		
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
			
			// if-setning med betingelsen verdi på variabel tall større enn verdi på variabel størst
			// eller (||) verdien på tall er lik 1 (altså første runde i for-løkken).
			if (innlestTall > størst || innlestTall == 1)
			{ 
				if (innlestTall > 1)
				{
					// Nest største tall ikke blir definert i første runde, altså må variabelen tall ha mer enn 1 i verdi.
					neststørst = størst; 
				}
				// else if-setning med betingelsen tall større enn neststørst. 
				// når setningen har verdien true settes verdien til variabel tall lik ny verdi på variabelen neststørst
				else if (innlestTall > neststørst)
				{
					neststørst = innlestTall;
				}

			
		}
		
		JOptionPane.showMessageDialog( null, "Det største tallet du skrev inn er " + størst + ". \nDet nest største tallet er " + neststørst + ". ");
		
		}
	}
}


