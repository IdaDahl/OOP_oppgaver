import javax.swing.JOptionPane;

public class Oppgave2_hoved 
{
	public static void main( String args[] )
	   {
		//initialiserer konstrukt�r/d�r�pneren til klassen Oppgave1_Sirkel
		Oppgave2_Tidskonverterer konvertering = new Oppgave2_Tidskonverterer (); 
		
		int sekunderInput = Integer.parseInt (JOptionPane.showInputDialog(null, "Skriv inn antall sekunder"));
	   
		// initialisering av do-while-l�kke
		while (sekunderInput >= 0)
		{		
			// Sender/gir verdien til variabel sekunderInput til setAntSekunder-metoden i klassen Oppgave2_Tidskonverterer.
			konvertering.setAntSekunder(sekunderInput);
			
			//innhenter verdien til konvertertTid-variabel 
			String utskrift = konvertering.konvertertTid();
			JOptionPane.showMessageDialog(null, utskrift, "Tidskonvertering", JOptionPane.INFORMATION_MESSAGE);
			
			//initialiserer ny runde i l�kken
			sekunderInput = Integer.parseInt (JOptionPane.showInputDialog(null, "Skriv inn antall sekunder"));
		}  // avslutter l�kken hvis verdien til sekunderInput er negativ 
			
		JOptionPane.showMessageDialog(null, "Hade p� bra =)" );
	   }
}
