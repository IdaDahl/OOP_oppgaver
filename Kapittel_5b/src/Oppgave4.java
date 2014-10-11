import javax.swing.JOptionPane;

public class Oppgave4
{
	public static void main(String[] args) 
	{
		// definerer to variabler av typen int for innlesning, og en for sum>

		int førsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn nedre grense") );
		int andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn øvre grense") );
		int sum = 0;

		// if-setning som sjekker at førsteTall er større enn andreTall
		if (førsteTall < andreTall)
		{
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
		// else-if-setning som gir instruksjon for hva som skal gjøres hvis andreTall er mindre eller lik førsteTall.
		else if (andreTall <= førsteTall)
		{
			// MessageDialog med feilmelding til brukeren.
			JOptionPane.showMessageDialog(null, "Innlest øvre grense er mindre enn, eller lik, nedre grense. "
												+ "\nPass på at det andre tallet du skriver inn er størst.");

		}
		
	}
}