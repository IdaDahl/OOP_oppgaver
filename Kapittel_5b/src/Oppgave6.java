import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der

public class Oppgave6
{
	public static void main(String[] args) 
	{
		// initialiserer variabler
		int fra = 1;
		int til = 100;
		int st�rst = fra; // gir variabel startverdi 1. Jobber seg deretter oppover mot st�rst
		int nestst�rst = fra; // gir variabel startverdi 1. Jobber seg deretter oppover mot nest st�rst
		int minst = til;  // gir variabel startverdi 100. Jobber seg deretter nedover mot minst
		int nestminst = til; // gir variabel startverdi 100. Jobber seg deretter nedover mot nest minst
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		
		for ( int x = fra; x <= til; x+=1)
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
			
				// if-setning som sjekker om variabel tall er st�rre enn variabel st�rst
				if (tall > st�rst)
				{ 
					// if-setning med verdi true gir nestst�rst verdien til st�rst, 
					// mens st�rst f�r verdien til tall (som da er den st�rste verdien s� langt)
					st�rst = tall;

				}
				if ( tall > nestst�rst &&  tall < st�rst) 
					{
						nestst�rst = tall;
					}
				
				// if-setning som sjekker om variabel tall er mindre enn variabel minst
				if (tall < minst)
				{
					// if-setning med verdi true gir nestminst verdien til minst, 
					// mens minst f�r verdien til tall (som da er den minste verdien s� langt)
					minst = tall;
					
				}
				if ( tall < nestminst && tall > minst) 
					{
						nestminst = tall;
					}
		}
				
			tabellen.append("\n St�rst:\t "+st�rst);
			tabellen.append("\n Nest st�rste:\t "+ nestst�rst);
			tabellen.append("\n Minste:\t "+ minst);
			tabellen.append("\n Nest minste:\t "+ nestminst);

		
		// viser resultater. tabellen satt inn i sin helhet
		JOptionPane.showMessageDialog( null, tabellen,
				"Hundre tilfeldige", JOptionPane.INFORMATION_MESSAGE );
		
	}
}

	