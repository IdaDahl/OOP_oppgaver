import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der
import java.text.DecimalFormat;

public class Oppgave8
{
	public static void main(String[] args) 
	{
		// deklarerer og initialiserer variabler
		int tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et helt tall" ) );

		int nedreGrense = 10;
		int �vreGrense = 50;
		int antallMellomGrensene = 0;
		int sum = 0;
		double gjennomsnitt = 0;

		
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();

		
		// while-l�kke som kj�res s� lenge tallInput er et postitivt tall.
		while (tallInput > 0)
		{
			// if-setning som sjekker om tallInput er st�rre enn nedreGrense (10) og mindre enn �vreGrense (50)
			if ( tallInput > nedreGrense && tallInput < �vreGrense )
			{
				// hvis if-setningen har verdi true skal variabelen antallMellomGrensene �kes med 1, 
				// for til slutt � vise hvor mange tall som er mellom de to satte grensene
				antallMellomGrensene +=1;
				
				//// hvis if-setningen har verdi true skal verdien til variabelen sum adderes med verdien til variabelen tallInput.
				sum += tallInput;
			}
		
			// s� lenge while-l�kken har verdi true sp�r den etter et nytt tall.
			tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et nytt helt tall" ) );
		}
			// if-setning som har verdi true n�r antallMellomGrensene og sum har verdi st�rre enn 0
			if (antallMellomGrensene > 0 && sum > 0 )
			{
				/* regner ut gjennomsnittet av alle verdier p� tallInput innad nedre og �vre grense 
				 * og deler p� antall ganger tallInput har v�rt innad grensene.
				 */
				gjennomsnitt = sum / antallMellomGrensene;
				
			}
		
		// gj�r int-variabelen antallMellomGrensene om til String.
		String antallMellomGrenseneTxt = Integer.toString(antallMellomGrensene);
		
		// Formatere double-variabel til desimaltall med to desimaler
		// Definerer og initialiserer variabel av typen String som  gir to desimaler som alltid vises, selv om de er 0
		String formateringsString = "0.00"; 
		
		/* Vi oppretter et objekt av type DecimalFormat. 
		 * Strengen formateringsString blir i form av konstrukt�rparameter overf�rt som verdi til et av datafeltene i objektet. 
		 * Variabelen formateringsobjekt blir satt til � referere til (peke p�) objektet.
		 * SKJ�NNER JEG EGENTLIG HVA JEG GJ�R HER?
		 */
		DecimalFormat formateringsobjekt = new DecimalFormat( formateringsString );
		
		// Variabel av typen String initialiseres ved ferdigformatert formateringsobjekt
		// og i denne formateringen formateres videre variabel gjennomsnitt av typen double
		String utskrift = formateringsobjekt.format( gjennomsnitt );
		
		// legger til antallet mellom �vre og nedre grense
		tabellen.append ( "Antall tall mellom " 
						+ nedreGrense + " og " 
						+ �vreGrense + ": \n" 
						+ antallMellomGrenseneTxt + "\n\n" );
		
		//skriv ut ferdigformatert gjennomsnitt i tabellen med to desimaler
		tabellen.append ( "Gjennomsnitt av verdiene mellom 10 og 50 " + "\n" + utskrift + "\n" );
		
		// dialogboks som skriver ut hele tekstomr�det
		JOptionPane.showMessageDialog( null, tabellen, 
										"Her er de vakre tallene dine", 
										JOptionPane.INFORMATION_MESSAGE);
		
	}
}