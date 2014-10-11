import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der

public class Oppgave5
{
	public static void main(String[] args) 
	{
		int andrepotens = 2;
		int tredjepotens = 3;
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		
		/* lager overskrift i tekstomr�det. 
		* \t danner "kolonner" eller "mellomrom"
		* \n etter siste verdi p� linja (hvorfor?)
		*/ 
		tabellen.setText("Tall\t Andrepotens\t Tredjepotens \n");
		
		for (int tall=0; tall <=10; tall++)
		{
			
			/* Lager f�rste tekstomr�de. For � f� til pene kolonner, 
			 * kan du p� hver linje i tabellen tilf�ye strengen "\t" (et tabulatortegn) 
			 * etter hver verdi (unntatt etter siste verdien p� linja).
			 */
			tabellen.append (tall+"\t");
					
			/* Lager andre tekstomr�de. 
			 * Gj�res kall p� metoden pow i klassen Math.
			 * Bruk av tabulator ("\t") for "penere" tabell.
			 *  instruksjonen Math.pow( tall, andrepotens ); beregner og returnerer verdien 'tall opph�yd i andrepotens' 
			 *  eller " the value of the first argument (tall) raised to the power of the second argument (andrepotens)
			 */
			tabellen.append ( Math.pow(tall, andrepotens) + "\t");

			// Lager tredje tekstomr�de. Samme utforming som tekstomr�det over, MEN UTEN BRUK AV TABULATOR P� SLUTTEN!
			tabellen.append ( Math.pow(tall, tredjepotens) + "\n");
		}
		
		// viser resultater. tabellen satt inn i sin helhet
		JOptionPane.showMessageDialog( null, tabellen,
				"Potenstabell", JOptionPane.INFORMATION_MESSAGE );
		// HVORFOR SKRIVES TABELLEN UT MED DESIMALTALL?!
	}
}