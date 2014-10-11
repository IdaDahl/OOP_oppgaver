import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Oppgave5
{
	public static void main(String[] args) 
	{
		int andrepotens = 2;
		int tredjepotens = 3;
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		
		/* lager overskrift i tekstområdet. 
		* \t danner "kolonner" eller "mellomrom"
		* \n etter siste verdi på linja (hvorfor?)
		*/ 
		tabellen.setText("Tall\t Andrepotens\t Tredjepotens \n");
		
		for (int tall=0; tall <=10; tall++)
		{
			
			/* Lager første tekstområde. For å få til pene kolonner, 
			 * kan du på hver linje i tabellen tilføye strengen "\t" (et tabulatortegn) 
			 * etter hver verdi (unntatt etter siste verdien på linja).
			 */
			tabellen.append (tall+"\t");
					
			/* Lager andre tekstområde. 
			 * Gjøres kall på metoden pow i klassen Math.
			 * Bruk av tabulator ("\t") for "penere" tabell.
			 *  instruksjonen Math.pow( tall, andrepotens ); beregner og returnerer verdien 'tall opphøyd i andrepotens' 
			 *  eller " the value of the first argument (tall) raised to the power of the second argument (andrepotens)
			 */
			tabellen.append ( Math.pow(tall, andrepotens) + "\t");

			// Lager tredje tekstområde. Samme utforming som tekstområdet over, MEN UTEN BRUK AV TABULATOR PÅ SLUTTEN!
			tabellen.append ( Math.pow(tall, tredjepotens) + "\n");
		}
		
		// viser resultater. tabellen satt inn i sin helhet
		JOptionPane.showMessageDialog( null, tabellen,
				"Potenstabell", JOptionPane.INFORMATION_MESSAGE );
		// HVORFOR SKRIVES TABELLEN UT MED DESIMALTALL?!
	}
}