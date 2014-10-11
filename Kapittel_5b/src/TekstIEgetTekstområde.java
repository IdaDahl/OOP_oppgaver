/*Et tekstomr�de er et objekt av type JTextArea, der JTextArea er navnet p� en klasse i javas klassebibliotek. 
 * N�r vi vil bruke et tekstomr�de, m� vi derfor importere denne klassen fra klassebiblioteket. 
 */
import javax.swing.JTextArea;

public class TekstIEgetTekstomr�de {

	public static void main(String[] args) {
		
		/* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstrukt�ren, det vil si den som er uten parametre. 
		 * For � kunne referere til tekstomr�det v�rt, blant annet for � putte tekst inn i det, 
		 * m� vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet v�rt som verdi til en variabel av type JTextArea
		 */
		JTextArea tekstomr�de = new JTextArea();

	      /* erstatter eventuell tekst i JTextArea-objektet tekstomr�de
	      * med den tekst (av type String) som er parameter til setText-metoden
	      */
		  tekstomr�de.setText( < tekststrengen vi �nsker som tekst > );
		  
		  /* beholder den teksten vi allerede har i tekstomr�det v�rt, 
		   * og tilf�yer ny tekst til denne
		   */
		  tekstomr�de.append( < tekststrengen vi �nsker � tilf�ye > );
	
		  /* I begge tilfeller kan den parameteren vi bruker (til setText eller append) 
		   * enten v�re en konkret tekst avgrenset av doble sitattegn "..." p� vanlig m�te, 
		   * eller en String-variabel som er blitt tilordnet den teksten vi �nsker � ha.
		   */
		  
	
	
	}

}
