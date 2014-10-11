import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Oppgave5b_driverklasse
{
	public static void main(String[] args) 
	{
		<opprette Potenstabell-objekt>
		<foreta metodekall for å hente ut potenstabellen>
		
		
		JTextArea tabellen = new JTextArea();
		
		// lager overskrift i tekstområdet. <Her må de ulike variablene settes inn., typ "x. potens">
		tabellen.setText( "\n");
		
		
		
		// viser resultater. tabellen satt inn i sin helhet
		JOptionPane.showMessageDialog( null, tabellen,
				"Potenstabell", JOptionPane.INFORMATION_MESSAGE );
		// HVORFOR SKRIVES TABELLEN UT MED DESIMALTALL?!
	}
}