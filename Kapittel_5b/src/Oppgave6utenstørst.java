import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der

public class Oppgave6utenst�rst
{
	public static void main(String[] args) 
	{
		// initialiserer variabler
		int fra = 1;
		int til = 100;
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		
		for ( int x = fra; x <= til; x++)
		{
			// variabelen tall kaller opp metoden random i klassen Math 100 ganger.
			int tall = (int) (Math.random() * 100);
			
			// Tallene skrives ut. \t legger til ny kolonne.
			tabellen.append ( tall + "\t");
			
			// if-setning som sjekker om variabelen tall modulus 10 har en rest lik null, og om variabelen tall er st�rre enn null
			// dette fordi hver rad kun skal ha ti tallverdier for � gi en oversiktlig tabell
			if (x % 10 == 0 && x > 0)
			{
				// Ny linje legges til hver gang if-setningen har verdien true 
				tabellen.append ( "\n" );
			}
		}
			
			// viser resultater. tabellen satt inn i sin helhet
			JOptionPane.showMessageDialog( null, tabellen,
					"Hundre tilfeldige tall", JOptionPane.INFORMATION_MESSAGE );
			

	}
	}
		
			