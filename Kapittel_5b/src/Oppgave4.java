import javax.swing.JOptionPane;

public class Oppgave4
{
	public static void main(String[] args) 
	{
		// definerer to variabler av typen int for innlesning, og en for sum>

		int f�rsteTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn nedre grense") );
		int andreTall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn �vre grense") );
		int sum = 0;

		// if-setning som sjekker at f�rsteTall er st�rre enn andreTall
		if (f�rsteTall < andreTall)
		{
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
		// else-if-setning som gir instruksjon for hva som skal gj�res hvis andreTall er mindre eller lik f�rsteTall.
		else if (andreTall <= f�rsteTall)
		{
			// MessageDialog med feilmelding til brukeren.
			JOptionPane.showMessageDialog(null, "Innlest �vre grense er mindre enn, eller lik, nedre grense. "
												+ "\nPass p� at det andre tallet du skriver inn er st�rst.");

		}
		
	}
}