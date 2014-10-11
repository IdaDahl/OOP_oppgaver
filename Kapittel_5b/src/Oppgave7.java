import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Oppgave7
{
	public static void main(String[] args) 
	{
		// initialiserer variabler
		int tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et helt tall" ) );

		int nedreGrense = 10;
		int øvreGrense = 50;
		int antallMellomGrensene = 0;
		
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		tabellen.setText("Antall tall mellom " 
						+ nedreGrense + " og " 
						+ øvreGrense + ": \n");
		
		// while-løkke som kjøres så lenge tallInput er et postitivt tall.
		while (tallInput > 0)
		{
			// if-setning som sjekker om tallInput er større enn nedreGrense (10) og mindre enn øvreGrense (50)
			if ( tallInput > nedreGrense && tallInput < øvreGrense )
			{
				// hvis if-setningen har verdi true skal variabelen antallMellomGrensene økes med 1, 
				// for til slutt å vise hvor mange tall som er mellom de to satte grensene
				antallMellomGrensene +=1;
			}
			// så lenge while-løkken har verdi true spør den etter et nytt tall.
			tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et nytt helt tall" ) );
		}
		
		// gjør int-variabelen antallMellomGrensene om til String.
		String antallMellomGrenseneTxt = Integer.toString(antallMellomGrensene);
		// legger til antallet mellom øvre og nedre grense
		tabellen.append ( antallMellomGrenseneTxt + "\n" );
		
		JOptionPane.showMessageDialog( null, tabellen, 
										"Her er de vakre tallene dine", 
										JOptionPane.INFORMATION_MESSAGE);
		
	}
}