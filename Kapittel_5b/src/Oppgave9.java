import javax.swing.JOptionPane;

public class Oppgave9
{
	public static void main(String[] args) 
	{
		// definerer to variabler av typen int for innlesning, og en for sum>

		int førsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn nedre grense") );
		int andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn øvre grense") );
		int sum = 0;

		// do-whileløkke som starter med instruksjon i form av en for-setning så lenge (while) betingelsen har verdi true
		do 
		{
			// MessageDialog med feilmelding til brukeren og forespørsel om to nye tall
			førsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Innlest øvre grense er mindre enn, eller lik, nedre grense."
																			+ "\nPass på at det andre tallet du skriver inn er størst."
																			+ "\n\nSkriv inn nedre grense på nytt") );
			andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn øvre grense") );
			
			/* slutt do-instruksjoner, start while-betingelse. 
			 * Nøkkelordet while bør plasseres etter parentesen } slik det er gjort ovenfor, ikke forrest på en ny linje. 
			 * Da kunne vi lettere komme til å lese while som begynnelsen på en while-løkke istedenfor som slutten på en do-while-løkke.
			 */
			} while (andreTall <= førsteTall); // do-whileløkke avsluttes alltid med semikolon etter while-betingelsen.
		
		/* for-løkke som setter variabel x av typen int lik verdien til førsteTall (nedre grense)
		* løkken har verdi true så lenge x har verdi større eller lik andreTall.
		* tellevariabelen x skal oppdateres ved å adderes med 1 for hver gang løkken kjøres
		* sum oppdateres hver runde. Ny verdi for sum er eksisterende verdi addert med verdi av x 
		*/
		for (int x = førsteTall; x <= andreTall; x++)
		{
			//variabelen sum oppdateres hver gang løkken kjøres ved å addere sin verdi med verdi av x for hver gang løkken kjøres
			sum += x;	
		}
			
		// dialogboks av typen MessageDialog som viser førsteTall, andreTall og sum. PS: MÅ SETTES UTENFOR FOR-LØKKE.
		JOptionPane.showMessageDialog(null, "Summen av alle tall mellom \n" + førsteTall 
												+ " og " + andreTall + " er " + sum + ".");
		}
}