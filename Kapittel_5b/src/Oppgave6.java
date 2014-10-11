import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Oppgave6
{
	public static void main(String[] args) 
	{
		// initialiserer variabler
		int fra = 1;
		int til = 100;
		int størst = fra; // gir variabel startverdi 1. Jobber seg deretter oppover mot størst
		int neststørst = fra; // gir variabel startverdi 1. Jobber seg deretter oppover mot nest størst
		int minst = til;  // gir variabel startverdi 100. Jobber seg deretter nedover mot minst
		int nestminst = til; // gir variabel startverdi 100. Jobber seg deretter nedover mot nest minst
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		
		for ( int x = fra; x <= til; x+=1)
		{
			// variabelen tall kaller opp metoden random i klassen Math 100 ganger.
			int tall = (int) (Math.random() * 100);
			
			// Tallene skrives ut. \t legger til ny kolonne.
			tabellen.append ( tall + "\t");
			
			// if-setning som sjekker om variabelen tall modulus 10 har en rest lik null, og om variabelen tall er større enn null
			// dette fordi hver rad kun skal ha ti tallverdier for å gi en oversiktlig tabell
			if (x % 10 == 0 && x > 0)
			{
				// Ny linje legges til hver gang if-setningen har verdien true 
				tabellen.append ( "\n" );
			}
			
				// if-setning som sjekker om variabel tall er større enn variabel størst
				if (tall > størst)
				{ 
					// if-setning med verdi true gir neststørst verdien til størst, 
					// mens størst får verdien til tall (som da er den største verdien så langt)
					størst = tall;

				}
				if ( tall > neststørst &&  tall < størst) 
					{
						neststørst = tall;
					}
				
				// if-setning som sjekker om variabel tall er mindre enn variabel minst
				if (tall < minst)
				{
					// if-setning med verdi true gir nestminst verdien til minst, 
					// mens minst får verdien til tall (som da er den minste verdien så langt)
					minst = tall;
					
				}
				if ( tall < nestminst && tall > minst) 
					{
						nestminst = tall;
					}
		}
				
			tabellen.append("\n Størst:\t "+størst);
			tabellen.append("\n Nest største:\t "+ neststørst);
			tabellen.append("\n Minste:\t "+ minst);
			tabellen.append("\n Nest minste:\t "+ nestminst);

		
		// viser resultater. tabellen satt inn i sin helhet
		JOptionPane.showMessageDialog( null, tabellen,
				"Hundre tilfeldige", JOptionPane.INFORMATION_MESSAGE );
		
	}
}

	