import javax.swing.JOptionPane;

public class Oppgave1 {

	public static void main(String[] args) 
	{
		// definerer variabel av typen int
		int sum = 0; 
		
		/*for-l�kken defineres: 
		 * variabel x defineres og gis startverdi 2
		 * l�kken har verdi true s� lenge x har verdi st�rre eller lik 98
		 * tellevariabelen x skal oppdateres ved � adderes med to for hver gang l�kken kj�res
		 */
		for (int x = 2; x <= 98; x += 2 )
			
		//variabelen sum oppdateres hver gang l�kken kj�res ved � addere sin verdi med verdi av x for hver gang l�kken kj�res
		sum += x;
		JOptionPane.showMessageDialog(null, sum);

	}

}
