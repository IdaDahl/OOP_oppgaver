import javax.swing.JOptionPane;

public class Oppgave1 {

	public static void main(String[] args) 
	{
		// definerer variabel av typen int
		int sum = 0; 
		
		/*for-løkken defineres: 
		 * variabel x defineres og gis startverdi 2
		 * løkken har verdi true så lenge x har verdi større eller lik 98
		 * tellevariabelen x skal oppdateres ved å adderes med to for hver gang løkken kjøres
		 */
		for (int x = 2; x <= 98; x += 2 )
			
		//variabelen sum oppdateres hver gang løkken kjøres ved å addere sin verdi med verdi av x for hver gang løkken kjøres
		sum += x;
		JOptionPane.showMessageDialog(null, sum);

	}

}
