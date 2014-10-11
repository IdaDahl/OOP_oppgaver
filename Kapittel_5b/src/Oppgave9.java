import javax.swing.JOptionPane;

public class Oppgave9
{
	public static void main(String[] args) 
	{
		// definerer to variabler av typen int for innlesning, og en for sum>

		int f�rsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn nedre grense") );
		int andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn �vre grense") );
		int sum = 0;

		// do-whilel�kke som starter med instruksjon i form av en for-setning s� lenge (while) betingelsen har verdi true
		do 
		{
			// MessageDialog med feilmelding til brukeren og foresp�rsel om to nye tall
			f�rsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Innlest �vre grense er mindre enn, eller lik, nedre grense."
																			+ "\nPass p� at det andre tallet du skriver inn er st�rst."
																			+ "\n\nSkriv inn nedre grense p� nytt") );
			andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn �vre grense") );
			
			/* slutt do-instruksjoner, start while-betingelse. 
			 * N�kkelordet while b�r plasseres etter parentesen } slik det er gjort ovenfor, ikke forrest p� en ny linje. 
			 * Da kunne vi lettere komme til � lese while som begynnelsen p� en while-l�kke istedenfor som slutten p� en do-while-l�kke.
			 */
			} while (andreTall <= f�rsteTall); // do-whilel�kke avsluttes alltid med semikolon etter while-betingelsen.
		
		/* for-l�kke som setter variabel x av typen int lik verdien til f�rsteTall (nedre grense)
		* l�kken har verdi true s� lenge x har verdi st�rre eller lik andreTall.
		* tellevariabelen x skal oppdateres ved � adderes med 1 for hver gang l�kken kj�res
		* sum oppdateres hver runde. Ny verdi for sum er eksisterende verdi addert med verdi av x 
		*/
		for (int x = f�rsteTall; x <= andreTall; x++)
		{
			//variabelen sum oppdateres hver gang l�kken kj�res ved � addere sin verdi med verdi av x for hver gang l�kken kj�res
			sum += x;	
		}
			
		// dialogboks av typen MessageDialog som viser f�rsteTall, andreTall og sum. PS: M� SETTES UTENFOR FOR-L�KKE.
		JOptionPane.showMessageDialog(null, "Summen av alle tall mellom \n" + f�rsteTall 
												+ " og " + andreTall + " er " + sum + ".");
		}
}