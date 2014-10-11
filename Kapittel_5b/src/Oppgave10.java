/*
 Lag et program som gjentatte ganger leser inn nummeret til en ukedag, 
 der 1 svarer til mandag, 2 til tirsdag, og s� videre, inntil 7 for s�ndag. 
 For hvert innlest nummer skal programmet skrive ut navnet p� vedkommende ukedag, 
 alts� "mandag" i tilfelle det blir lest inn 1, "tirsdag" n�r det blir lest inn 2, og s� videre. 
 Dersom det blir lest inn et tall st�rre enn 7, skal teksten "ukjent ukedag" skrives ut. 
 Dersom det blir lest inn 0 eller en negativ verdi, skal programmet avslutte. 
 Bruk en switch-setning til � avgj�re hva som skal skrives ut.
 */
import javax.swing.JOptionPane;

public class Oppgave10 
{
	public static void main(String[] args) 
	{
		// deklarering av variabler
		int dag = 0;
		String utskrift = "";
		
		do
		{
			dag = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn et tall mellom 1 og 7"));
			
			switch (dag)
			{
			case 1: 
				utskrift = "Monday blues";
				break; // break gj�r at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
			case 2: 
				utskrift = "Got nothing clever to say. Men tirsdag er det iv�ffal";
				break;
			case 3: 
				utskrift = "Skjeraa, Bagera? Jo, det er onsdag skal jeg si deg!";
				break;
			case 4: 
				utskrift = "Throwback Tuesday? Yes it is.";
				break;
			case 5: 
				utskrift = "Du f�r vente til freddan! Og det er jo idag det!";
				break;
			case 6: 
				utskrift = "Let's get this party started! It's l�rdag!";
				break;
			case 7:
				utskrift = "Sunday is funday!";
				break;
			default: 
				utskrift = "Ingen ukedag jeg har h�rt om v�ffal!";
				break; // ikke n�dvendig med break her, men greit � ha med for ryddighetens skyld. 
			};
			
			JOptionPane.showMessageDialog(null , utskrift, 
					"Ukedag", JOptionPane.INFORMATION_MESSAGE);
		} while  (dag > 0);
			
		

	}
}
