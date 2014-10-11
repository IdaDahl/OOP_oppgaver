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

public class UkedagMedStringtoLoweCase 
{
	public static void main(String[] args) 
	{
		// deklarering og initalisering av variabler
		// variabel av typen string initialiseres ved inputdialogboks
		String dag = JOptionPane.showInputDialog("Skriv inn en ukedag");
		// Konvertering til små bokstaver ved String-metoden toLowerCase
		// Dette for å omgå at Java skiller mellom store og små bokstaver, hvilket gjør at det ikke ser "mandag" og "Mandag" som lik.
		dag = dag.toLowerCase();
		String utskrift;
		
		switch (dag)
		{
		case "mandag": 
			utskrift = "Monday blues";
			break; // break gjør at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
		case "tirsdag": 
			utskrift = "Got nothing clever to say";
			break;
		case "onsdag": 
			utskrift = "Got nothing clever to say";
			break;
		case "torsdag": 
			utskrift = "Throwback Tuesday?";
			break;
		case "fredag": 
			utskrift = "Du får vente til freddan!";
			break;
		case "lørdag": 
			utskrift = "Let's get this party started!";
			break;
		case "søndag":
			utskrift = "Sunday is funday!";
				break;
		default: 
			utskrift = "Ingen ukedag jeg har hørt om væffal!";
				break; // ikke nødvendig med break her, men greit å ha med for ryddighetens skyld. 
		}
		JOptionPane.showMessageDialog(null , utskrift, 
				"Dagsrim", JOptionPane.INFORMATION_MESSAGE);
	}
}
