/*
 * Lag et program som simulerer kast med en terning 100 ganger. 
 * Verdiene skal skrives ut i et tekstområde med 10 verdier per linje, med et mellomrom (blankt tegn) mellom hver verdi. 
 * Tekstområdet skal til slutt vises i en meldingsboks. 
 * I programmet kan du bruke samme Terning-klassen som i eksemplet ovenfor (men programmet som bruker terningen må lages annerledes).
 */
import javax.swing.JOptionPane; // Klasse for dialogbokser
import javax.swing.JTextArea; // Klasse for egne tekstområder

public class Oppgave3_Terningtest 
{
	public static void main( String[] args )
	{
		Eksempel2_Terning terningen = new Eksempel2_Terning();
	    int antKast = 100;
	    
	    /* Oppretter et objekt av typen JTextArea ved bruk av new-operatoren. 
		 * Vi kan i dette tilfelle bruke default-konstruktøren, det vil si den som er uten parametre. 
		 * For å kunne referere til tekstområdet vårt, blant annet for å putte tekst inn i det, 
		 * må vi dessuten gi det et navn, det vil si tilordne JTextArea-objektet vårt som verdi til en variabel av type JTextArea
		 */
	    JTextArea terningtabell = new JTextArea(); // initialisering av tekstområde ved navn terningtabell
	    terningtabell.setText ("Throw that dice!\n\n"); // overskrift/første tekstområde i terningtabellen

	    for ( int i = 1; i <= antKast; i++ ) // initialisering av for-setning som kjøres så lenge variabel i er mellom 1 og 6000, altså 6000 kast
	    {
	      terningen.kast(); // klassen terning kaller opp metoden kast som kjøres én gang
	      int verdi = terningen.getVerdi(); // int verdi henter verdien av kastet i klassen terning
		
	      // Tallene skrives ut.
	      terningtabell.append ( verdi + " ");
	      
	   // if-setning som bruker variabel i av typen int. Hver gang i  dividert på 10 gir en rest på 0 skal det settes inn linjeskift (\n)
	      if (i % 10 == 0) 
			{
				// Ny linje legges til hver gang if-setningen har verdien true 
	    	  terningtabell.append ( "\n" );
			} // slutt if-løkke
	    } // slutt for-løkke
	 // viser resultater. tabellen satt inn i sin helhet
	      JOptionPane.showMessageDialog( null, terningtabell, 
	      		"Hundre terningkast", JOptionPane.INFORMATION_MESSAGE );
	} // slutt main-metode
} // slutt klasse

