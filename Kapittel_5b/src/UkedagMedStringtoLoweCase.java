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

public class UkedagMedStringtoLoweCase 
{
	public static void main(String[] args) 
	{
		// deklarering og initalisering av variabler
		// variabel av typen string initialiseres ved inputdialogboks
		String dag = JOptionPane.showInputDialog("Skriv inn en ukedag");
		// Konvertering til sm� bokstaver ved String-metoden toLowerCase
		// Dette for � omg� at Java skiller mellom store og sm� bokstaver, hvilket gj�r at det ikke ser "mandag" og "Mandag" som lik.
		dag = dag.toLowerCase();
		String utskrift;
		
		switch (dag)
		{
		case "mandag": 
			utskrift = "Monday blues";
			break; // break gj�r at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
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
			utskrift = "Du f�r vente til freddan!";
			break;
		case "l�rdag": 
			utskrift = "Let's get this party started!";
			break;
		case "s�ndag":
			utskrift = "Sunday is funday!";
				break;
		default: 
			utskrift = "Ingen ukedag jeg har h�rt om v�ffal!";
				break; // ikke n�dvendig med break her, men greit � ha med for ryddighetens skyld. 
		}
		JOptionPane.showMessageDialog(null , utskrift, 
				"Dagsrim", JOptionPane.INFORMATION_MESSAGE);
	}
}
