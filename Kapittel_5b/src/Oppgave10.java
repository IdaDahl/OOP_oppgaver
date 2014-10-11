/*
 Lag et program som gjentatte ganger leser inn nummeret til en ukedag, 
 der 1 svarer til mandag, 2 til tirsdag, og så videre, inntil 7 for søndag. 
 For hvert innlest nummer skal programmet skrive ut navnet på vedkommende ukedag, 
 altså "mandag" i tilfelle det blir lest inn 1, "tirsdag" når det blir lest inn 2, og så videre. 
 Dersom det blir lest inn et tall større enn 7, skal teksten "ukjent ukedag" skrives ut. 
 Dersom det blir lest inn 0 eller en negativ verdi, skal programmet avslutte. 
 Bruk en switch-setning til å avgjøre hva som skal skrives ut.
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
				break; // break gjør at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
			case 2: 
				utskrift = "Got nothing clever to say. Men tirsdag er det ivæffal";
				break;
			case 3: 
				utskrift = "Skjeraa, Bagera? Jo, det er onsdag skal jeg si deg!";
				break;
			case 4: 
				utskrift = "Throwback Tuesday? Yes it is.";
				break;
			case 5: 
				utskrift = "Du får vente til freddan! Og det er jo idag det!";
				break;
			case 6: 
				utskrift = "Let's get this party started! It's lørdag!";
				break;
			case 7:
				utskrift = "Sunday is funday!";
				break;
			default: 
				utskrift = "Ingen ukedag jeg har hørt om væffal!";
				break; // ikke nødvendig med break her, men greit å ha med for ryddighetens skyld. 
			};
			
			JOptionPane.showMessageDialog(null , utskrift, 
					"Ukedag", JOptionPane.INFORMATION_MESSAGE);
		} while  (dag > 0);
			
		

	}
}
