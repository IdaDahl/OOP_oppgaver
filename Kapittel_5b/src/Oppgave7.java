import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstomr�der

public class Oppgave7
{
	public static void main(String[] args) 
	{
		// initialiserer variabler
		int tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et helt tall" ) );

		int nedreGrense = 10;
		int �vreGrense = 50;
		int antallMellomGrensene = 0;
		
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tabellen = new JTextArea();
		tabellen.setText("Antall tall mellom " 
						+ nedreGrense + " og " 
						+ �vreGrense + ": \n");
		
		// while-l�kke som kj�res s� lenge tallInput er et postitivt tall.
		while (tallInput > 0)
		{
			// if-setning som sjekker om tallInput er st�rre enn nedreGrense (10) og mindre enn �vreGrense (50)
			if ( tallInput > nedreGrense && tallInput < �vreGrense )
			{
				// hvis if-setningen har verdi true skal variabelen antallMellomGrensene �kes med 1, 
				// for til slutt � vise hvor mange tall som er mellom de to satte grensene
				antallMellomGrensene +=1;
			}
			// s� lenge while-l�kken har verdi true sp�r den etter et nytt tall.
			tallInput = Integer.parseInt (JOptionPane.showInputDialog ( "Skriv inn et nytt helt tall" ) );
		}
		
		// gj�r int-variabelen antallMellomGrensene om til String.
		String antallMellomGrenseneTxt = Integer.toString(antallMellomGrensene);
		// legger til antallet mellom �vre og nedre grense
		tabellen.append ( antallMellomGrenseneTxt + "\n" );
		
		JOptionPane.showMessageDialog( null, tabellen, 
										"Her er de vakre tallene dine", 
										JOptionPane.INFORMATION_MESSAGE);
		
	}
}