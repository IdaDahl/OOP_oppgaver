import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder
import java.text.DecimalFormat;

public class Oppgave8
{
	public static void main(String[] args) 
	{
		// deklarerer og initialiserer variabler
		int tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et helt tall" ) );

		int nedreGrense = 10;
		int øvreGrense = 50;
		int antallMellomGrensene = 0;
		int sum = 0;
		double gjennomsnitt = 0;

		
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();

		
		// while-løkke som kjøres så lenge tallInput er et postitivt tall.
		while (tallInput > 0)
		{
			// if-setning som sjekker om tallInput er større enn nedreGrense (10) og mindre enn øvreGrense (50)
			if ( tallInput > nedreGrense && tallInput < øvreGrense )
			{
				// hvis if-setningen har verdi true skal variabelen antallMellomGrensene økes med 1, 
				// for til slutt å vise hvor mange tall som er mellom de to satte grensene
				antallMellomGrensene +=1;
				
				//// hvis if-setningen har verdi true skal verdien til variabelen sum adderes med verdien til variabelen tallInput.
				sum += tallInput;
			}
		
			// så lenge while-løkken har verdi true spør den etter et nytt tall.
			tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et nytt helt tall" ) );
		}
			// if-setning som har verdi true når antallMellomGrensene og sum har verdi større enn 0
			if (antallMellomGrensene > 0 && sum > 0 )
			{
				/* regner ut gjennomsnittet av alle verdier på tallInput innad nedre og øvre grense 
				 * og deler på antall ganger tallInput har vært innad grensene.
				 */
				gjennomsnitt = sum / antallMellomGrensene;
				
			}
		
		// gjør int-variabelen antallMellomGrensene om til String.
		String antallMellomGrenseneTxt = Integer.toString(antallMellomGrensene);
		
		// Formatere double-variabel til desimaltall med to desimaler
		// Definerer og initialiserer variabel av typen String som  gir to desimaler som alltid vises, selv om de er 0
		String formateringsString = "0.00"; 
		
		/* Vi oppretter et objekt av type DecimalFormat. 
		 * Strengen formateringsString blir i form av konstruktørparameter overført som verdi til et av datafeltene i objektet. 
		 * Variabelen formateringsobjekt blir satt til å referere til (peke på) objektet.
		 * SKJØNNER JEG EGENTLIG HVA JEG GJØR HER?
		 */
		DecimalFormat formateringsobjekt = new DecimalFormat( formateringsString );
		
		// Variabel av typen String initialiseres ved ferdigformatert formateringsobjekt
		// og i denne formateringen formateres videre variabel gjennomsnitt av typen double
		String utskrift = formateringsobjekt.format( gjennomsnitt );
		
		// legger til antallet mellom øvre og nedre grense
		tabellen.append ( "Antall tall mellom " 
						+ nedreGrense + " og " 
						+ øvreGrense + ": \n" 
						+ antallMellomGrenseneTxt + "\n\n" );
		
		//skriv ut ferdigformatert gjennomsnitt i tabellen med to desimaler
		tabellen.append ( "Gjennomsnitt av verdiene mellom 10 og 50 " + "\n" + utskrift + "\n" );
		
		// dialogboks som skriver ut hele tekstområdet
		JOptionPane.showMessageDialog( null, tabellen, 
										"Her er de vakre tallene dine", 
										JOptionPane.INFORMATION_MESSAGE);
		
	}
}