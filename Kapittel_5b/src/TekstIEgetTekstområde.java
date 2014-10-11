/*Et tekstområde er et objekt av type JTextArea, der JTextArea er navnet på en klasse i javas klassebibliotek. 
 * Når vi vil bruke et tekstområde, må vi derfor importere denne klassen fra klassebiblioteket. 
 */
import javax.swing.JTextArea;

public class TekstIEgetTekstområde {

	public static void main(String[] args) {
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
		JTextArea tekstområde = new JTextArea();

	      /* erstatter eventuell tekst i JTextArea-objektet tekstområde
	      * med den tekst (av type String) som er parameter til setText-metoden
	      */
		  tekstområde.setText( < tekststrengen vi ønsker som tekst > );
		  
		  /* beholder den teksten vi allerede har i tekstområdet vårt, 
		   * og tilføyer ny tekst til denne
		   */
		  tekstområde.append( < tekststrengen vi ønsker å tilføye > );
	
		  /* I begge tilfeller kan den parameteren vi bruker (til setText eller append) 
		   * enten være en konkret tekst avgrenset av doble sitattegn "..." på vanlig måte, 
		   * eller en String-variabel som er blitt tilordnet den teksten vi ønsker å ha.
		   */
		  
	
	
	}

}
