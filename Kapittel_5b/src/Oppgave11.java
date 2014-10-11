/*
Lag et program som kan fortelle brukeren hvor mange dager det er i en måned. Brukeren skal skrive inn navnet på måneden. 
Du trenger ikke ta hensyn til skuddår.
*/
import javax.swing.JOptionPane;

public class Oppgave11 
{
	public static void main(String[] args) 
	{
		// variabel av typen string initialiseres ved inputdialogboks
		String måned = JOptionPane.showInputDialog("Skriv inn en måned");
		
		// Verdien til variabelen måned konverteres til små bokstaver ved String-metoden ".toLowerCase"
		// Dette for å omgå Javas skille mellom store og små bokstaver, hvilket gjør at det ikke ser "januar" og "Januar" som lik.
		måned = måned.toLowerCase();
		String utskrift;
		
		switch (måned)
		{
		case "januar": 
			utskrift = "Januar har 31 dager";
			break; // break gjør at programmet hopper ut av switch-blokka fordi en betingelse er oppfylt
		case "februar": 
			utskrift = "Februar har 28 dager";
			break;
		case "mars": 
			utskrift = "Mars har 31 dager";
			break;
		case "april": 
			utskrift = "April har 30 dager";
			break;
		case "mai": 
			utskrift = "Mai har 31 dager!";
			break;
		case "juni": 
			utskrift = "Juni har 30 dager";
			break;
		case "juli":
			utskrift = "Juli har 31 dager";
				break;
		case "august":
			utskrift = "August har 31 dager!";
				break;
		case "september":
			utskrift = "September har 30 dager";
				break;
		case "oktober":
			utskrift = "Oktober har 31 dager";
				break;
		case "november":
			utskrift = "November har 30 dager";
				break;
		case "desember":
			utskrift = "Desember har 31 dager";
				break;
		default: 
			utskrift = "Dette ekke noen måned jeg har hørt om væffal!";
				break; // ikke nødvendig med break her, men greit å ha med for ryddighetens skyld. 
		}
		JOptionPane.showMessageDialog(null , utskrift, 
				"Dager i måneden", JOptionPane.INFORMATION_MESSAGE);
	}
}
